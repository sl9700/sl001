var addMaterialsInfoUrl = "../materialsInfo/saveMaterialsInfo.action";
var updateMaterialsInfoUrl = "../materialsInfo/updateMaterialsInfo.action";
var currMaterialsInfoUrl = "";

/* 查询所有信息显示至主界面(模糊查询) */
function searchMaterialsInfoByName(){
	var searchByName = $("#searchByName").val();
	$("#materialsDataGrid").datagrid("load",{
		searchByName:searchByName
	});
}
/* 回收站信息的模糊查询(dialog) */
function searchRecycle(){
	var searchByName = $("#r_recycleName").val();
	$("#dgRecycleInfo").datagrid("load",{
		r_recycleName:searchByName
	});
}
/* 物资信息的模糊查询(dialog) */
function search_Materials(){
	var searchByName = $("#m_materialsName").val();
	$("#dgMaterialsInfo").datagrid("load",{
		m_materialsName:searchByName
	});
}
/* 新增回收站物资信息关闭按钮 */
function newMaterialsInfo(){
	$("#dlgMaterialsInfo").dialog("open").dialog("setTitle","新增回收站物资");
	currMaterialsInfoUrl = addMaterialsInfoUrl;
}
/* 新增物资类别信息的关闭按钮 */
function closeMaterialsDialog(){
	$("#dlg_MaterialsInfo").dialog("close");
}
/* 点击回收站物资信息删除按钮触发事件 */
function deleteMaterialsInfo(){
	var rows = $("#materialsDataGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","请至少选择一条需要删除的回收站物资信息！","warning");
		return false;
	}
	
	var rm_ids=[];
	$.each(rows,function(index,row){
		rm_ids.push(row.rm_id);
	});
	var rm_idss=rm_ids.join(",");
	$.messager.confirm("删除提示","您确定要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗？",function(r){
		if(r){
			$.ajax({
				url:"../materialsInfo/deleteMaterialsInfo.action",
				data:{rm_idss:rm_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","您已成功删除了选中的<font color='red' size='5'>"+result.count+"</font>条数据！","info");
						$("#materialsDataGrid").datagrid("reload");
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

/* 点击选择回收站按钮触发事件 */
function openRecycleChooseDialog(){
	$("#dlg_RecycleInfo").dialog("open").dialog("setTitle","请选择回收站");
}
/* 点击选择物资按钮触发事件 */
function openMaterialsChooseDialog(){
	$("#dlg_MaterialsInfo").dialog("open").dialog("setTitle","请选择物资");
}
/* 选中回收站后点击确认按钮触发事件 */
function chooseMaterials(){
	var row = $("#dg_MaterialsInfo").datagrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择一个用户物资类别","warning");
		return false;
	}
	$("#mm_id").val(row.mm_id);
	$("#mm_name").val(row.mm_name);
	closeRecycleDialog();
}
/* 回收站信息关闭按钮点击事件 */
function closeRecycleDialog(){
	$("#dgRecycleInfo").datagrid({
		rows:[],
		total:0
	});
	$("#dlg_RecycleInfo").dialog("close");
}
/* 保存回收站物资信息按钮触发事件 */
function saveMaterialsInfo(){
	$("#fmMaterialsInfo").form("submit",{
		url:currMaterialsInfoUrl,
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			/* 将result转化为对象 */
			var result = eval('('+result+')');
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeMaterialsInfoDialog()
				$("#materialsDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","info");
			}
		}
	});
	currMaterialsInfoUrl = "";
}
/* 点击回收站物资表单关闭按钮触发事件 */
function closeMaterialsInfoDialog(){
	$("#fmMaterialsInfo").form("clear");
	$("#dlgMaterialsInfo").dialog("close");
}
/* 点击回收站物资修改按钮触发事件 */
function updateMaterialsInfo(){
	var rows = $("#materialsDataGrid").datagrid("getSelections");
	if(rows.length != 1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#fmMaterialsInfo").form("load",rows[0]);
	$("#dlgMaterialsInfo").dialog("open").dialog("setTitle","修改回收站物资信息");
	currMaterialsInfoUrl = updateMaterialsInfoUrl;
}