var addRoleInfoUrl = "../roleInfo/saveRoleInfo.action";
var updateRoleInfoUrl = "../roleInfo/updateRoleInfo.action";
var currRoleInfoUrl = "";

/* 角色表查询信息，搜索框 */
function searchRole(){
	$("#roleDataGrid").datagrid("load",{
		s_roleName:$("#s_roleName").val()
	});
}
/* 点击角色信息新增按钮触发事件 */
function newRoleInfo(){
	$("#dlgRoleInfo").dialog("open").dialog("setTitle","新增角色信息");
	currRoleInfoUrl = addRoleInfoUrl;
}
/* 光标移开角色名触发事件（判断是否已存在当前角色） */
$("#ro_name").blur(function(){
	var ro_name = $("#ro_name").val();
	$.post("../roleInfo/emRoleNameIsExist.action",{ro_name:ro_name},function(result){
		if(result.msg){
			$.messager.alert("系统提示","当前角色已存在，请重新输入！","warning");
			$("#ro_name").val("");
		}
	});
});
/* 保存角色信息按钮触发事件 */
function saveRoleInfo(){
	$("#fmRoleInfo").form("submit",{
		url:currRoleInfoUrl,
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			/* 将result转化为对象 */
			var result = eval('('+result+')');
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeRoleInfoDialog();
				$("#roleDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","info");
			}
		}
	});
	currRoleInfoUrl = "";
}
/* 点击角色表单关闭按钮触发事件 */
function closeRoleInfoDialog(){
	$("#fmRoleInfo").form("clear");
	$("#dlgRoleInfo").dialog("close");
}
/* 点击确认修改角色信息按钮触发事件 */
function updateRoleInfo(){
	var rows = $("#roleDataGrid").datagrid("getSelections");
	if(rows.length != 1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#fmRoleInfo").form("load",rows[0]);
	$("#dlgRoleInfo").dialog("open").dialog("setTitle","修改角色信息");
	currRoleInfoUrl = updateRoleInfoUrl;
}
/* 点击角色信息删除按钮触发事件 */
function deleteRoleInfo(){
	var rows = $("#roleDataGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","请至少选择一条需要删除的角色信息！","warning");
		return false;
	}
	
	var ro_ids=[];
	$.each(rows,function(index,row){
		ro_ids.push(row.ro_id);
	});
	var ro_idss=ro_ids.join(",");
	$.ajax({
		url:"../roleInfo/roldIsUse.action",
		data:{ro_idss:ro_idss},
		dataType:"json",
		type:"post",
		success:function(result){
			var ro_names = [];
			$.each(result.roleNames,function(index,name){
				ro_names.push(name);
			});
			if(ro_names.length>0){
				$.messager.alert("系统管理","当前角色："+ro_names.join(",")+"已被其他数据占用，不能删除！","warning");
			}else{
				$.messager.confirm("删除提示","您确定要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗？",function(r){
					if(r){
						$.ajax({
							url:"../roleInfo/deleteRoleInfo.action",
							data:{ro_idss:ro_idss},
							dataType:"json",
							type:"post",
							success:function(result){
								if(result.msg){
									$.messager.alert("系统提示","您已成功删除了选中的<font color='red' size='5'>"+result.count+"</font>条数据！","info");
									$("#roleDataGrid").datagrid("reload");
								}else{
									$.messager.alert("系统提示","删除失败！","error");
								}
							},
							error:function(){
								$.messager.alert("系统提示","系统繁忙，请稍后操作！","warning");
							}
						});
					}
				});
			}
		}
	});		
}
/* 角色授权按钮触发事件 */
function authRoleInfo(){
	var rows = $("#roleDataGrid").datagrid("getSelections");
	if(rows.length != 1){
		$.messager.alert("系统提示","请选择一个需要授权的角色","warning");
		return false;
	}
	var menuIds = rows[0].ro_menuids;
	/* 在开打之前加载tree结构图 */
	$("#tree").tree({
		url:"../menuInfo/findAllMenuInfo.action?menuIds="+menuIds,
		lines:true,
		checkbox:true,
		cascadeCheck:false,
		loadFilter:function(data){
			return data.menuInfoList;
		},
		onLoadSuccess:function(){
			$("#tree").tree("expandAll");	//expandAll:展开	  collapseAll:全部折叠
		},
		onCheck:function(node,checked){
			/* 点击复选框选中触发事件 */
			if(checked){								/* 转化为对象 */
				var nodeParents = $("#tree").tree("getParent",node.target);//获取当前节点的父节点（递归）
				$("#tree").tree("check",nodeParents.target);//选中父节点
			}else {//取消复选框触发事件
				var nodeChildrens = $("#tree").tree("getChildren",node.target);//获取当前节点的所有
				for(var i = 0;i < nodeChildrens.length;i++){//遍历子节点，取消所有子节点的选中状态（递归条件为check，uncheck）
					$("#tree").tree("uncheck",nodeChildrens[i].target);
				}
			}
		}
	});
	$("#dlgMenuInfo").dialog("open").dialog("setTitle","请选择要授权的菜单");
}
/* 角色授权关闭按钮触发事件 */
function closeAuthDialog(){
	$("#dlgMenuInfo").dialog("close");
}
/* 角色授权按钮触发事件 */
function saveAuth(){
	var nodes = $("#tree").tree("getChecked");
	var rows = $("#roleDataGrid").datagrid("getSelections");
	if(nodes.length <= 0){
		$.messager.confirm("系统提示","您未选中任何菜单信息，您确定要授权吗？",function(r){
			if(r){
				updateRoleMenuIds(nodes,rows);
			}else {
				closeAuthDialog();
			}
		});
	}else {
		updateRoleMenuIds(nodes,rows);
	}
}
/* 角色授权的封装 */
function updateRoleMenuIds(nodes,rows){
	var menuIds = [];
	$.each(nodes,function(index,itme){
		menuIds.push(itme.id);
	});
	var mn_menuIds = menuIds.join(",");
	var ro_id = rows[0].ro_id;
	$.ajax({
		url:"../roleInfo/saveAuth.action",
		data:{mn_menuIds:mn_menuIds,ro_id:ro_id},
		type:"post",
		dataType:"json",
		success:function(result){
			if(result.msg){
				$.messager.alert("系统提示","授权成功","info");
				closeAuthDialog();
				$("#roleDataGrid").datagrid("reload");
			}else {
				$.messager.alert("系统提示","授权失败，请稍后操作","error");
			}
		},
		error:function(){
			$.messager.alert("系统提示","系统繁忙，请稍后操作！","warning");
		}
	});
}