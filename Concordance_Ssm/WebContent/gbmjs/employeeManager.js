var addEmployeeInfoUrl = "../employeeInfo/saveEmployeeInfo.action";
var updateEmployeeInfoUrl = "../employeeInfo/updateEmployeeInfo.action";
var currEmployeeInfoUrl = "";

/* 点击员工信息查询按钮触发事件 */
function searchEmployeeInfoByName(){
	var searchByName = $("#searchByName").val();
	$("#employeeDataGrid").datagrid("load",{
		searchByName:searchByName
	});
}
/* 角色模糊查询 */
function searchRoles(){
	var searchByName = $("#s_roleName").val();
	$("#dgRoleInfo").datagrid("load",{
		s_roleName:searchByName
	});
}
/* 点击员工信息删除按钮触发事件 */
function deleteEmployeeInfo(){
	var rows = $("#employeeDataGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","请至少选择一条需要删除的用户信息！","warning");
		return false;
	}
	
	var em_ids=[];
	$.each(rows,function(index,row){
		em_ids.push(row.em_id);
	});
	var em_idss=em_ids.join(",");
	$.messager.confirm("删除提示","您确定要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗？",function(r){
		if(r){
			$.ajax({
				url:"../employeeInfo/deleteEmployeeInfo.action",
				data:{em_idss:em_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","您已成功删除了选中的<font color='red' size='5'>"+result.count+"</font>条数据！","info");
						$("#employeeDataGrid").datagrid("reload");
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
/* 点击员工信息新增按钮触发事件 */
function newEmployeeInfo(){
	$("#dlgEmployeeInfo").dialog("open").dialog("setTitle","新增用户");
	currEmployeeInfoUrl = addEmployeeInfoUrl;
}
/* 点击选择按钮触发事件 */
function openRoleChooseDialog(){
	$("#dlgRoleInfo").dialog("open").dialog("setTitle","请选择角色");
}
/* 选中角色后点击确认按钮触发事件 */
function chooseRole(){
	var row = $("#dgRoleInfo").datagrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择一个用户角色","warning");
		return false;
	}
	$("#ro_id").val(row.ro_id);
	$("#ro_name").val(row.ro_name);
	closeRoleDialog();
}
/* 角色信息关闭按钮点击事件 */
function closeRoleDialog(){
	$("#dgRoleInfo").datagrid({
		rows:[],
		total:0
	});
	$("#dlgRoleInfo").dialog("close");
}
/* 光标移开事件，验证用户名是否重复 */
$("#em_account").blur(function(){
	var em_account = $("#em_account").val();
	/* post请求三个参数，路径，参数，函数 */
	$.post("../employeeInfo/emAccountIsExist.action",{em_account:em_account},function(result){
		if(result.msg){
			$.messager.alert("系统提示","当前用户已存在，请重新输入！","warning");
			$("#em_account").val("");
		}
	});
});
/* 光标移开事件，验证邮箱格式是否正确 */
$("#em_email").blur(function(){
	var ePattern = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
	if(!ePattern.test( document.getElementById("em_email").value )){
		$.messager.alert("系统提示","邮箱格式不正确！","info");
		$("#em_email").val("");
	}
});
/* 光标移开事件，验证身份证格式是否正确 */
$("#em_idCard").blur(function(){
	var cP = /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
	if(!cP.test( document.getElementById("em_idCard").value )){
		$.messager.alert("系统提示","身份证格式不正确！","info");
		$("#em_idCard").val("");
	}
});
/* 光标移开事件，验证手机号码格式是否正确 */
$("#em_phone").blur(function(){
	var mPattern = /^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\d{8}$/;
	if(!mPattern.test( document.getElementById("em_phone").value )){
		$.messager.alert("系统提示","手机号码格式不正确！","info");
		$("#em_phone").val("");
	}
});
/* 光标移开事件，验证用户名格式是否正确 */
$("#em_account").blur(function(){
	var uPattern = /^[a-zA-Z0-9_-]{4,16}$/;
	if(!uPattern.test( document.getElementById("em_account").value )){
		$.messager.alert("系统提示","用户名格式不正确，请重新输入4-16位，以字母开头","info");
		$("#em_account").val("");
	}
});
/* 光标移开事件，密码强度验证 */
$("#em_password").blur(function(){
	var pPattern = /^.*(?=.{6,32})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$/;
	if(!pPattern.test( document.getElementById("em_password").value )){
		$.messager.alert("系统提示","密码强度不够，请重新输入","info");
		$("#em_password").val("");
	}
});
/* 光标移开事件，日期格式的验证 */
$("#em_entryTime").blur(function(){
	var dP1 = /^\d{4}(\-)\d{1,2}\1\d{1,2}$/;
	var dP2 = /^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$/;
	if(!dP1.test( document.getElementById("em_entryTime").value )){
		$.messager.alert("系统提示","日期格式不正确，请重新输入","info");
		$("#em_entryTime").val("");
	}
});
/* 保存用户信息按钮触发事件 */
function saveEmployeeInfo(){
	var dP1 = /^\d{4}(\-)\d{1,2}\1\d{1,2}$/;
	var dP2 = /^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$/;
	if( dP2.test( document.getElementById("em_entryTime").value )){
		$.messager.alert("系统提示","日期格式不正确，请重新输入","info");
		$("#em_entryTime").val("");
		//return false;
	}
	$("#fmEmployeeInfo").form("submit",{
		url:currEmployeeInfoUrl,
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
			/* 将result转化为对象 */
			var result = eval('('+result+')');
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				closeEmployeeInfoDialog();
				$("#employeeDataGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","info");
			}
		}
	});
	currEmployeeInfoUrl = "";
}
/* 点击员工表单关闭按钮触发事件 */
function closeEmployeeInfoDialog(){
	$("#fmEmployeeInfo").form("clear");
	$("#dlgEmployeeInfo").dialog("close");
}
/* 点击修改按钮触发事件 */
function updateEmployeeInfo(){
	var rows = $("#employeeDataGrid").datagrid("getSelections");
	if(rows.length != 1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#fmEmployeeInfo").form("load",rows[0]);
	$("#dlgEmployeeInfo").dialog("open").dialog("setTitle","修改用户信息");
	currEmployeeInfoUrl = updateEmployeeInfoUrl;
}