var newtenderContractInfo="../tenderContract/newtenderContractInfo.action";
var updatetenderContract="../tenderContract/updatetenderContract.action";
var currUrl="";
/*点击员工信息查询按钮触发事件*/
function searchtenderContractInfoByName(){
	var td_names=$("#td_names").val();
	$("#tenderContractInfoDataGrid").datagrid("load",{
		td_names:td_names
	})
}
/*点击新增按钮触发事件*/
function newtenderContract(){
	$("#dlgtenderContractInfo").dialog("open").dialog("setTitle","新增投标信息");
	currUrl=newtenderContractInfo;
}
/*点击选择小区按钮触发事件*/
function openCommunityDialog(){
	$("#dlgCommunityInfo").dialog("open").dialog("setTitle","请选择小区");
}
/*选中小区点击确定按钮触发事件*/
function chooseCommunity(){
var row=$("#dgCommunityInfo").datagrid("getSelected");
	if(row==null){
		$.messager.alert("系统提示","请选择一个小区","warning");
		return false;
	}
	$("#co_id").val(row.co_id);
	$("#co_name").val(row.co_name);
	 closeCommunityDialog();
}
/*选中角色点击关闭按钮触发事件*/
function closeCommunityDialog() {
	//清空
	$("#dlgCommunityInfo").datagrid({
		rows:[],
		totak:0
	})
	$("#dlgCommunityInfo").dialog("close");
}
/*点击修改按钮触发事件*/
function updatetenderContractInfo(){
	var rows=$("#tenderContractInfoDataGrid").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#dlgtenderContractInfo").dialog("open").dialog("setTitle","修改投标信息");
	$("#fmtenderContractInfo").form("load",rows[0]);
	currUrl=updatetenderContract;
}
/*点击保存按钮触发事件*/
function saveEmployeeInfo() {
	$("#fmtenderContractInfo").form("submit",{
		url:currUrl,
		/*提交之前验证是否有未填项*/
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			var	result=eval('('+result+')');//将json字符串转化成对象
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeEmployeeInfoDialog();
				$("#tenderContractInfoDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","warning");
			}
		}
	});
	currUrl="";
}
/*点击删除按钮触发事件*/
function deletetenderContractInfo(){
	var rows=$("#tenderContractInfoDataGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","至少选中一条","warning")
		return false;
	}
	var td_ids=[];
	$.each(rows,function(index,row){
		td_ids.push(row.td_id);
	});
	var td_idss=td_ids.join(",");
	$.messager.confirm("删除提示","您确认要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗?",function(r){
		if(r){
			$.ajax({
				url:"../tenderContract/deleteTenderContract.action",
				data:{td_idss:td_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","成功删除选中的<font color='red' size='5'>"+result.conut+"</font>条数据","info");
						$("#tenderContractInfoDataGrid").datagrid("reload");
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
function closeEmployeeInfoDialog(){
	$("#dlgtenderContractInfo").form("clear");
	$("#dlgtenderContractInfo").dialog("close");
}