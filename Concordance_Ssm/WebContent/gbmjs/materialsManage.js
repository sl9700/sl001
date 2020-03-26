var newtenderContractInfo="../MaterialsManageInfo/newMaterialsManageInfo.action";
var updatetenderContract="../MaterialsManageInfo/updateMaterialsManageInfo.action";
var currUrl="";
/*点击物资信息查询按钮触发事件*/
function searchtenderMaterialsByName(){
	var td_namess=$("#mm_name").val();
	$("#materialsManageInfoDataGrid").datagrid("load",{
		mm_name:mm_name
	});
}
/*点击新增按钮触发事件*/
function newtenderContract(){
	$("#dlgmaterialsManageInfo").dialog("open").dialog("setTitle","新增物资管理信息");
	currUrl=newtenderContractInfo;
}
/*点击选择物资类型按钮触发事件*/
function openmaterialsManageDialog(){
	$("#dlgmaterialTypeInfo").dialog("open").dialog("setTitle","请选择物资类型");
}
/*点击选择采购人按钮触发事件*/
function openCommunityDialog(){
	$("#dlgemployeeInfo").dialog("open").dialog("setTitle","请选择采购人");
}
/*选中物资类型点击确定按钮触发事件*/
function choosematerialType(){
var row=$("#dgmaterInfo").datagrid("getSelected");
	if(row==null){
		$.messager.alert("系统提示","请选择一个物资类型","warning");
		return false;
	}
	$("#mt_ids").val(row.mt_id);
	$("#mt_names").val(row.mt_name);
	closeCommunityDialog();
}
/*选中采购人点击确定按钮触发事件*/
function chooseemployee(){
var row=$("#dgemployeeInfo").datagrid("getSelected");
	if(row==null){
		$.messager.alert("系统提示","请选择一个采购人","warning");
		return false;
	}
	$("#em_ids").val(row.em_id);
	$("#em_names").val(row.em_name);
	closeemployeeDialog();
}

/*选中物资类型点击关闭按钮触发事件*/
function closeCommunityDialog() {
	//清空
	$("#dgmaterInfo").datagrid({
		rows:[],
		totak:0
	})
	$("#dlgmaterialTypeInfo").dialog("close");
}
/*选中采购人点击关闭按钮触发事件*/
function closeemployeeDialog() {
	//清空
	$("#dgRoleInfo").datagrid({
		rows:[],
		totak:0
	})
	$("#dlgemployeeInfo").dialog("close");
}
/*点击修改按钮触发事件*/
function updatetenderContractInfo(){
	var rows=$("#materialsManageInfoDataGrid").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#dlgmaterialsManageInfo").dialog("open").dialog("setTitle","修改物资管理信息");
	$("#fmmaterialsManageInfo").form("load",rows[0]);
	currUrl=updatetenderContract;
}
/*点击保存按钮触发事件*/
function saveEmployeeInfo() {
	$("#fmmaterialsManageInfo").form("submit",{
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
				$("#materialsManageInfoDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","warning");
			}
		}
	});
	currUrl="";
}
/*点击删除按钮触发事件*/
function deletetenderContractInfo(){
	var rows=$("#materialsManageInfoDataGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","至少选中一条","warning")
		return false;
	}
	var mm_ids=[];
	$.each(rows,function(index,row){
		mm_ids.push(row.mm_id);
	});
	var mm_idss=mm_ids.join(",");
	$.messager.confirm("删除提示","您确认要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗?",function(r){
		if(r){
			$.ajax({
				url:"../MaterialsManageInfo/deleteMaterialsManageInfo.action",
				data:{mm_idss:mm_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","成功删除选中的<font color='red' size='5'>"+result.conut+"</font>条数据","info");
						$("#materialsManageInfoDataGrid").datagrid("reload");
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
	$("#fmmaterialsManageInfo").form("clear");
	$("#dlgmaterialsManageInfo").dialog("close");
}