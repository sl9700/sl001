var addUrl="../cartsInfo/addCartsInfo.action";
var updateUrl="../cartsInfo/updataCartsInfo.action";
var currUrl="";
var srole=("#s_roleName").val;
//点击查询触发事件
function searchCartsInfoByName(){
	$.messager.alert('QWE',srole);
	$("#dgCartsInfo").datagrid("reload",{
		searchByName:$("#searchByName").val()
	})
}
//点击选择车辆触发事件
function openCarChooseDialog(){
	$("#dlgCarInfo").dialog("open")
}
//点击选择司机触发事件
function openUserChooseDialog(){
	$("#dlgUserInfo").dialog("open")
}
//点击车辆调度触发事件(新增)
function newCartsInfo(){
	$("#dlgCartsInfo").dialog("open").dialog("setTitle","车源调度请求")
	currUrl=addUrl;
}


//点击司机查询按钮触发事件
function searchUser(){
	$.messager.alert('QWE',srole);
	$("#dlgUserInfo").datagrid("reload",{
		
		s_roleName:$("#s_roleName").val()
	})
}
//车牌号点击查询按钮触发事件
function searchCar(){
	$("#dlgCarInfo").datagrid("reload",{
		s_roleNames:$("#s_roleNames").val()
	});
}
//选中司机，点击保存按钮触发事件
function chooseUser(){
	var rows=$("#dgUserInfo").datagrid("getSelected")//选择单行
	$("#em_id").val(rows.em_id);
	$("#em_name").val(rows.em_name);
	closeUserDialog()
}
//选中司机，点击关闭按钮触发事件
function closeUserDialog(){
	$("#dlgUserInfo").dialog("close");
}
//选中车辆，点击保存按钮触发事件
function chooseCar(){
	var rows=$("#dgCarInfo").datagrid("getSelected")//选择单行
	$("#ve_id").val(rows.ve_id);
	$("#ve_license").val(rows.ve_license);
	$("#ve_firm").val(rows.ve_firm);
	closeCarDialog()
}
//选中车辆，点击关闭按钮触发事件
function closeCarDialog(){
	$("#dlgCarInfo").dialog("close");
}
//点击保存触发事件
function saveCartsInfo(){
	
	$("#formCartsInfo").form("submit",{
		url:currUrl,
		 onSubmit:function(){
			 return $(this).form("validate")//当非空验证未通过时返回false,否则亦之
		 },
		 success:function(data){
			 var	data=eval('('+data+')');//执行函数
			 if(data.msg){
				 $.messager.alert("系统提示","保存成功","info")
				 $("#dgCartsInfo").datagrid("reload")//刷新界面信息
				 closeCartsAddDialog()	 
			 }else{
				 $.messager.alert("系统提示","系统繁忙,请稍后在操作！","info")
				  $("#dgCartsInfo").datagrid("reload")//刷新界面信息
				 closeCartsAddDialog()
			 }
		   }
	})
}
//点击关闭触发事件
function closeCartsAddDialog(){
	$("#formCartsInfo").form("clear")//清除form表单中内容
	$("#dlgCartsInfo").dialog("close")//关闭form表单
}


//点击车辆调度触发事件(修改)
function updateCartsInfo(){
	var rows=$("#dgCartsInfo").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选择一条您要修改的员工信息","warning");
		return false;
	}
	$("#formCartsInfo").form("load",rows[0]);
	$("#dlgCartsInfo").dialog("open").dialog("setTitle","修改调度信息");
	currUrl=updateUrl; 
	
}

/*点击删除按钮触发事件*/
function delectCartsInfo(){
	var rows=$("#dgCartsInfo").datagrid("getSelections");
	if(rows.length<=0){
		$.messager.alert("系统提示","请选择您要删除的员工信息","warning");
		return false;
	}
	
	$.messager.confirm("系统提示","您确定要删除选中的<font color='red' size='3'>"+rows.length+"</font>条员工信息吗？",function(r){
		if(r){
			var em_ids=[];
			$.each(rows,function(index,row){
				em_ids.push(row.vd_id);
			});			
			var emIds=em_ids.join(",");
			$.ajax({
				url:"../cartsInfo/deleteEmployeeInfo.action",
				type:"post",
				data:{emIds:emIds},
				dataType:"json",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","已成功删除<font color='red' size='3'>"+result.count+"</font>条员工信息!","info");
						$("#dgCartsInfo").datagrid("reload");
					}else{
						$.messager.alert("系统提示","系统繁忙，请稍候操作!","info");
					}
				},
				error:function(){
					$.messager.alert("系统提示","网路繁忙，请稍候操作!","info");
				}
			});
		}
	})
}



