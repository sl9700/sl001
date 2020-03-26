var addMenuInfo="../menuInfo/addMenuInfo.action";
var updateMenuIfo="../menuInfo/updateMenuInfo.action";
var currMenuInfo="";

/* 将英文图标转化为图标格式 */
function formatterIcon(value,row,index){
	return "<div class='"+value+"'>&nbsp;&nbsp;</div>";
}
/* 菜单新增触发事件 */
function newMenuInfo(){
	var row = $("#menuTreeGrid").treegrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择一个父节点","warning");
		return false;
	}
	/* 拿到当前节点的父节点 */
	$("#mn_parent").val(row.mn_id);
	$("#dlgMenuInfo").dialog("open").dialog("setTitle","新增菜单信息");
	currMenuInfo=addMenuInfo;
}
/* 点击保存按钮触发事件 */
function saveMenuInfo(){
	$("#fmMenuInfo").form("submit",{
		url:currMenuInfo,
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			/* 将result转化为对象 */
			var result = eval('('+result+')');
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeMenuInfoDialog();
				$("#menuTreeGrid").treegrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","info");
			}
		}
	});
	currMenuInfo = "";
}
/* 点击关闭按钮触发事件 */
function closeMenuInfoDialog(){
	$("#fmMenuInfo").form("clear");
	$("#dlgMenuInfo").dialog("close");
}
/* 点击删除按钮触发事件 */
function deleteMenuInfo(){
	var row = $("#menuTreeGrid").treegrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择需要删除的节点","warning");
		return false;
	}
	var state = row.mn_son;
	if(state == "closed"){
		$.messager.alert("系统提示","该节点被其他节点占用，不能删除","warning");
	}else {
		$.messager.confirm("删除提示","您确认要删除该节点：<font color='red' size='5'>"+row.mn_menuName+"</font>吗？",function(r){
			if(r){
				$.ajax({
					url:"../menuInfo/deleteMenuInfo.action",
					type:"post",
					data:{mn_id:row.mn_id},
					dataType:"json",
					success:function(result){
						if(result.msg){
							$.messager.alert("系统提示","您已成功删除<font color='red' size='5'>"+row.mn_menuName+"</font>节点","info");
							$("#menuTreeGrid").treegrid("reload");
						}else {
							$.messager.alert("错误提示","删除失败，请稍后操作","error");
						}
					},
					error:function(){
						$.messager.alert("系统提示","系统繁忙，请稍后操作","warning");
					}
				});
			}
		});
	}
}
/* 点击修改按钮触发事件 */
function updateMenuInfo(){
	var rows = $("#menuTreeGrid").treegrid("getSelections");
	if(rows.length != 1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#fmMenuInfo").form("load",rows[0]);
	$("#dlgMenuInfo").dialog("open").dialog("setTitle","修改菜单列表");
	currMenuInfo = updateMenuIfo;
}