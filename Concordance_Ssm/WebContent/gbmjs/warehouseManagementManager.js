/**
 * 回收站出入库管理信息的JS样式
 */
/* 定义三个全局变量，用于新增与修改的路径问题 */
var addWareHouseUrl = "../wareHouseInfo/addWareHouseInfo.action";
var updateWareHouseUrl = "../wareHouseInfo/updateWareHouseInfo.action";
var currWareHouseUrl = "";
/* 用于订单表号的模糊查询 */
function searchWareHouseInfoByName(){
	var searchByName = $("#searchByName").val();
	$("#wareHouseDataGrid").datagrid("load",{
		searchByName:searchByName
	});
}
/* 回收站模糊查询 */
function searchRecycles(){
	var r_recycleName = $("#r_recycleName").val();
	$("#dgRecycleInfo").datagrid("load",{
		r_recycleName:r_recycleName
	});
}
/* 回收站出库按钮触发事件 */
function deleteWareHouseInfo(){
	var rows = $("#wareHouseDataGrid").datagrid("getSelections");
	
	if(rows.length<1){
		$.messager.alert("系统提示","请至少选择一条需要出库的回收站物资信息！","warning");
		return false;
	}
	var pr_ids=[];
	$.each(rows,function(index,row){
		pr_ids.push(row.pr_id);
	});
	var pr_idss=pr_ids.join(",");
	$.messager.confirm("出库提示","您确定要出库选中的<font color='red' size='5'>"+rows.length+"</font>条物资吗？",function(r){
		if(r){
			$.ajax({
				url:"../wareHouseInfo/deleteWareHouseInfo.action",
				data:{pr_idss:pr_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","您已成功出库了选中的<font color='red' size='5'>"+result.count+"</font>条物资！","info");
						$("#wareHouseDataGrid").datagrid("reload");
					}else{
						$.messager.alert("系统提示","出库失败！","error");
					}
				},
				error:function(){
					$.messager.alert("系统提示","系统繁忙，请稍后操作！","warning");
				}
			});
		}
	});
}
/* 新增回收站出入库信息 */
function newWareHouseInfo(){
	$("#dlgwareHouseInfo").dialog("open").dialog("setTitle","新增入库单");
	currWareHouseUrl = addWareHouseUrl;
}
/* 点击修改按钮触发事件 */
function updateWareHouseInfo(){
	var rows = $("#wareHouseDataGrid").datagrid("getSelections");
	if(rows.length != 1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#fmwareHouseInfo").form("load",rows[0]);
	$("#dlgwareHouseInfo").dialog("open").dialog("setTitle","修改出入库信息");
	currWareHouseUrl = updateWareHouseUrl;
}
/* 保存出入库信息按钮触发事件 */
function saveWareHouseInfo(){
	$("#fmwareHouseInfo").form("submit",{
		url:currWareHouseUrl,
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			/* 将result转化为对象 */
			var result = eval('('+result+')');
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeWareHouseInfoDialog();
				$("#wareHouseDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","info");
			}
		}
	});
	currWareHouseUrl = "";
}
/* 关闭dialog表单的按钮触发事件  */
function closeWareHouseInfoDialog(){
	$("#fmwareHouseInfo").form("clear");
	$("#dlgwareHouseInfo").dialog("close");
}
/* 打开回收站选择按钮触发事件 */
function openRecycleChooseDialog(){
	$("#dlgRecycleInfo").dialog("open").dialog("setTitle","请选择回收站");
}
/* 关闭回收站选择按钮触发事件 */
function closeRecycleDialog(){
	$("#dgRecycleInfo").datagrid({
		rows:[],
		total:0
	});
	$("#dlgRecycleInfo").dialog("close");
}
/* 选中回收站名称点击确认触发事件 */
function chooseRecycle(){
	var row = $("#dgRecycleInfo").datagrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择一个用户角色","warning");
		return false;
	}
	$("#re_id").val(row.re_id);
	$("#re_name").val(row.re_name);
	closeRecycleDialog();
}
