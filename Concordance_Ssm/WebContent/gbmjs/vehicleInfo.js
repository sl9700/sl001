/**
 * 车辆信息操作
 */
var addUrlVehicle="../vehicleInfo/saveVehicleInfo.action";
var updateVehicle="../vehicleInfo/updateVehicleInfo.action";
var currUrlVehicle="";
/*通过查询触发事件，并分页展示结果*/
function searchVehicleInfo(){
	var searchByName=$("#searchByName").val();
	$("#vehicleDataGrid").datagrid("load",{
		searchByName:searchByName
	});
}

/*点击删除按钮触发删除事件*/
function deleteVehicleInfo(){
	var rows=$("#vehicleDataGrid").datagrid("getSelections");/*获取所选行*/
	if(rows.length<1){
		$.messager.alert("系统提示","请至少选中一条数据","warning");
		return false;
	}
	var ve_ids=[];
	$.each(rows,function(index,row){
		ve_ids.push(row.ve_id);
	});
	var ve_idss=ve_ids.join(",");
	$.messager.confirm("删除提示","您确定要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗？",function(r){
		if(r){
			$.ajax({
				url:"../vehicleInfo/deleteVehicleInfo.action",
				data:{ve_idss:ve_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","您已经删除成功！","info");
						$("#vehicleDataGrid").datagrid("reload");
					}else{
						$.messager.alert("系统提示","删除失败！","error");
					}
				},
				error:function(){
					$.messager.alert("系统提示","系统繁忙，请稍后再试","warning");
				}
			});
		}
	});
}

/*点击新增按钮触发新增事件*/
function newVehicleInfo(){
	$("#dlgVehicleInfo").dialog("open").dialog("setTitle","新增车辆信息")
	currUrlVehicle=addUrlVehicle;
}

/**
 * 光标移开之后判断当前车辆是否存在
 */
$("#ve_license").blur(function(){
	var ve_license=$("#ve_license").val();
	$.post("../vehicleInfo/veAccountIsExist.action",{ve_license:ve_license},function(result){
		if(result.msg){
			$.messager.alert("系统提示","当前车辆已经存在！","warning");
			$("#ve_license").val("");
		}
	});
});


/**
 * 新增或修改完成后点击保存按钮提交数据
 * */
function saveVehicleInfo(){
	$("#fmVehicleInfo").form("submit",{
		url:currUrlVehicle,
		onSubmit:function(){
		   return $(this).form("validate");
		},
		success:function(result){
			/*字符串转化为JSON对象*/
			var result=eval('('+result+')');
			alert(result+'6666666');
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeVehicleInfoDialog();
				$("#vehicleDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","warning");
			}
		}
	});
	currUrlVehicle="";
}
/*点击关闭按钮，清空表单，并关闭弹窗*/
function closeVehicleInfoDialog(){
	$("#fmVehicleInfo").form("clear");
	$("#dlgVehicleInfo").dialog("close");
}

/*点击修改按钮，触发修改逻辑*/
function updateVehicleInfo(){
	var rows=$("#vehicleDataGrid").datagrid("getSelections");/*获取到所选行*/
	if(rows.length!=1){
		 $.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		 return false;
	}
	$("#fmVehicleInfo").form("load",rows[0]);
	$("#dlgVehicleInfo").dialog("open").dialog("setTitle","修改车辆信息");
	currUrlVehicle=updateVehicle;
}






