var newmaterialTypeInfo="../materialType/newmaterialTypeInfo.action";
var updatetenderContract="../materialType/updatematerialType.action";
var currUrl="";
/*点击员工信息查询按钮触发事件*/
function searchtenderContractInfoByName(){
	var mt_name=$("#mt_name").val();
	$("#dlgmaterialTypeInfo").datagrid("load",{
		mt_name:mt_name
	})
}
/*点击新增按钮触发事件*/
function newtenderContract(){
	$("#dlgmaterialTypeInfo").dialog("open").dialog("setTitle","新增物资类型信息");
	currUrl=newmaterialTypeInfo;
}
/*点击修改按钮触发事件*/
function updatetenderContractInfo(){
	var rows=$("#tendermaterialTypeDataGrid").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#dlgmaterialTypeInfo").dialog("open").dialog("setTitle","修改物资类型信息");
	$("#fmmaterialTypeInfo").form("load",rows[0]);
	currUrl=updatetenderContract;
}
/*点击保存按钮触发事件*/
function savematerialTypeInfo() {
	$("#fmmaterialTypeInfo").form("submit",{
		url:currUrl,
		/*提交之前验证是否有未填项*/
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			var	result=eval('('+result+')');//将json字符串转化成对象
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				$("#tendermaterialTypeDataGrid").datagrid("reload");
				closematerialTypeInfoDialog();
			}else{
				$.messager.alert("系统提示","保存失败","warning");
			}
		}
	});
	currUrl="";
}
/*点击删除按钮触发事件*/
function deletematerialTypeInfo(){
	var rows=$("#tendermaterialTypeDataGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","至少选中一条","warning")
		return false;
	}
	var mt_ids=[];
	$.each(rows,function(index,row){
		mt_ids.push(row.mt_id);
	});
	var mt_idss=mt_ids.join(",");
	$.messager.confirm("删除提示","您确认要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗?",function(r){
		if(r){
			$.ajax({
				url:"../materialType/deletematerialTypeInfo.action",
				data:{mt_idss:mt_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","成功删除选中的<font color='red' size='5'>"+result.conut+"</font>条数据","info");
						$("#tendermaterialTypeDataGrid").datagrid("reload");
					}else{
						$.messager.alert("系统提示","删除失败","error")
					}
				},
				error:function(){
					$.messager.alert("系统提示","系统繁忙,请稍后操作","warning")
				}
			});
		}
	});
}
/*点击新增表单关闭按钮触发事件*/
function closematerialTypeInfoDialog(){
	$("#fmmaterialTypeInfo").form("clear");
	$("#dlgmaterialTypeInfo").dialog("close");
}