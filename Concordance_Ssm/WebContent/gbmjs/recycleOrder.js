var addUrl="../RecycleOrder/addRecycleOrder.action";
var updateUrl="../RecycleOrder/updateRecycleOrder.action";
var currUrl="";

/*按照订单名模糊查询信息*/
function searchRecycleOrderInfoByName(){
	var searchByName=$("#searchByName").val();
	$("#dgRecycleOrder").datagrid("load",{
		searchByName:searchByName
	});
	 
}


/*点击新增按钮触发事件*/
function addRecycleOrder(){
	$("#dlgRecycleOrder").dialog("open").dialog("setTitle","新增回收站员工信息");
	currUrl=addUrl;
}



/*点击选择居民按钮触发时间*/
/*function openRecycleChooseDialog(){
	$("#dlgRecycleInfo").dialog("open").dialog("setTitle","请选择居民信息");
}*/

/*点击选择员工按钮触发时间*/
function openRoleChooseDialog(){
	$("#dlgRoleInfo").dialog("open").dialog("setTitle","请选择员工信息");
}

/*点击选择车辆按钮触发时间*/
function openVehicleChooseDialog(){
	$("#dlgVehicleinfo").dialog("open").dialog("setTitle","请选择员工信息");
}

/*点击查询员工按钮查询触发事件*/
function searchRole(){
	var searchByEmp_name=$("#searchByEmp_name").val();
	$("#dlgRoleInfo").datagrid("load",{
		searchByEmp_name:searchByEmp_name
	});
}
/*点击查询居民按钮查询触发事件
function searchRecycle(){
	var searchByUs_name=$("#searchByUs_name").val();
	$("#dlgRecycleInfo").datagrid("load",{
		searchByUs_name:searchByUs_name
	});
}*/

/*点击查询车辆按钮查询触发事件*/
function searchVehicle(){
	var searchByve_license=$("#searchByve_license").val();
	$("#dlgRecycleInfo").datagrid("load",{
		searchByve_license:searchByve_license
	});
}


/*点击确定居民按钮触发事件
function chooseRecycle(){
	var row=$("#dgRecycleInfo").datagrid("getSelected");
	$("#us_id").val(row.us_id);
	$("#us_name").val(row.us_name);
	$("#dlgRecycleInfo").dialog("close");
	closeRecycleDialog();
}*/

/*点击关闭居民按钮触发事件
function closeRecycleDialog(){
	$("#dlgRecycleInfo").dialog("close");
}*/

/*点击确定员工按钮触发事件*/
function chooseRole(){
	var row=$("#dgRoleInfo").datagrid("getSelected");
	$("#em_id").val(row.em_id);
	$("#em_name").val(row.em_name);
	$("#dlgRoleInfo").dialog("close");
	closeRoleDialog();
}

/*点击关闭员工按钮触发事件*/
function closeRoleDialog(){
	$("#dlgRoleInfo").dialog("close");
}


/*点击确定车辆按钮触发事件*/
function choosedlgVehicle(){
	var row=$("#dgdlgVehicleinfo").datagrid("getSelected");
	$("#ve_id").val(row.ve_id);
	$("#ve_license").val(row.ve_license);
	$("#dlgVehicleinfo").dialog("close");
	closeVehicleDialog();
}


/*点击关闭车辆按钮触发事件*/
function closeVehicleDialog(){
	$("#dlgVehicleinfo").dialog("close");
}


/*点击关闭弹框按钮触发事件*/
function closeRecycleOrderDialog(){
	$("#fmRecycleOrder").form("clear");
	$("#dlgRecycleOrder").dialog("close");
}
/*点击保存触发事件*/
function saveRecycleOrder(){
	$("#fmRecycleOrder").form("submit",{
		url:currUrl,
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			var result=eval("("+result+")");
			if(result.msg){
				$.messager.alert("提示信息","保存成功!","info"); 
				$("#dgRecycleOrder").datagrid("reload");
			}else{
				$.messager.alert("提示信息","系统繁忙，请稍后操作!","error");
			}
			closeRecycleOrderDialog();
			currUrl="";
		}
	});
	
}
/*点击修改触发事件*/
function updateRecycleOrder(){
	var rows=$("#dgRecycleOrder").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选一条要修改的员工信息","warning");
		return false;
	}
	$("#fmRecycleOrder").form("load",rows[0]);
	$("#dlgRecycleOrder").dialog("open").dialog("setTitle","修改员工信息");
	currUrl=updateUrl;
}
/*点击删除触发事件*/
function deleteRecycleOrder(){
	var rows=$("#dgRecycleOrder").datagrid("getSelections");
	if(rows.length<=0){
		$.messager.alert("系统提示","请选需要删除的员工信息","warning");
		return false;
	}
	$.messager.confirm("系统提示","您确定要删除<font color='red' size='3'>"+rows.length+"</font>条的员工信息么？",function(r){
		if(r){
			var rco_ids=[];
			$.each(rows,function(index, row){
				rco_ids.push(row.rco_id);
			});
			var rcoIds=rco_ids.join(",");
			$.ajax({
				url:"../RecycleOrder/deleteRecycleOrder.action",
				type:"post",
				data:{rcoIds:rcoIds},
				dataType:"json",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","您已成功删除<font color='red' size='3'>"+result.count+"</font>条数据","info");
						$("#dgRecycleOrder").datagrid("reload");
					}else{
						$.messager.alert("系统提示","系统繁忙,请稍后再试","info");
					}
				},
				error:function(){
					$.messager.alert("系统提示","网络繁忙,请稍后再试","info");
				}
				
				
			});
		}
		
	});
	
}




