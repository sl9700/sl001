var addWorkBookUrl = "../workBook/addWorkBookInfo.action";
var updateWorkBookUrl = "../workBook/updateWorkBookInfo.action";
var currWorkBookUrl = "";
/* 页面加载 触发事件，将所有从表加载出来（只加载一次） */
$(function(){
	init();
	$("#dgWorkBookInfo").datagrid({
		/* 注意这个回掉函数名 */
		onClickRow:function(index,row){
			$("#workBookEditForm").form("load",row);
			$("#dgWorkBookDetail").datagrid("loadData",row.wbdList);
		}
	});
});
/* FROM表单序列化转对象,转化完成之后就不用eval转化了 */
function serializeObject(form){
	var o = {};
	$.each(form.serializeArray(),function(index){
		if(o[this['name']]){
			
			o[this['name']] = o[this['name']]+","+this['value'];
		} else{
			o[this['name']] = this['value'];
		}
	});
	return o;
}
/* 对于数据字典主表的模糊查询 */
function searchWorkBookInfo(){
	$("#dgWorkBookInfo").datagrid("load",{
		searchValue:$("#searchValue").val()
	});
}
/* 控制页面按钮逻辑控制 */
function init(){
	$("#workBookManager_newbtn").linkbutton({disabled:false});
	$("#workBookManager_editbtn").linkbutton({disabled:false});
	$("#workBookManager_delbtn").linkbutton({disabled:false});
	
	$("#workBookManager_savebtn").linkbutton({disabled:true});
	$("#workBookManager_canclebtn").linkbutton({disabled:true});
	
	$("#workBookDeatilAdd").linkbutton({disabled:true});
	$("#workBookDeatilUpdate").linkbutton({disabled:true});
	$("#workBookDeatilDel").linkbutton({disabled:true});
	$("#workBookDeatilSav").linkbutton({disabled:true});
	
	$("#workBookEditForm").form("clear");
	$("#dgWorkBookDetail").datagrid("loadData",{
		rows:[],
		total:0
	});
	currWorkBookUrl = "";
	$("#workBookEditForm").form("disableValidation");
	$("#workBookEditForm :input").attr("disabled","disabled");
}
/* 点击新增（主）的按钮逻辑触发事件 */
function newWorkBookInfo(){
	$("#workBookManager_canclebtn").linkbutton({disabled:false});
	$("#workBookManager_delbtn").linkbutton({disabled:true});
	$("#workBookManager_editbtn").linkbutton({disabled:true});
	
	$("#workBookDeatilAdd").linkbutton({disabled:false});
	$("#workBookDeatilUpdate").linkbutton({disabled:false});
	$("#workBookDeatilDel").linkbutton({disabled:false});
	$("#workBookDeatilSav").linkbutton({disabled:false});
	
	$("#workBookEditForm :input").removeAttr("disabled","disabled");
	$("#workBookEditForm").form("enableValidation");
	
	$("#workBookEditForm").form("clear");
	$("#dgWorkBookDetail").datagrid("loadData",{
		rows:[],
		total:0
	});
	currWorkBookUrl = addWorkBookUrl;
}
/* 点击取消按钮触发事件 */
function cancleworkBook(){
	init();	
}
/* 点击修改(主)触发事件 */
function editworkBook(){
	var row = $("#dgWorkBookInfo").datagrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择需要修改的数据","warning");
		return false;
	}
	$("#workBookManager_canclebtn").linkbutton({disabled:false});
	$("#workBookManager_delbtn").linkbutton({disabled:true});
	$("#workBookManager_newbtn").linkbutton({disabled:true});
	
	$("#workBookDeatilAdd").linkbutton({disabled:false});
	$("#workBookDeatilUpdate").linkbutton({disabled:false});
	$("#workBookDeatilDel").linkbutton({disabled:false});
	$("#workBookDeatilSav").linkbutton({disabled:false});
	
	$("#workBookEditForm :input").removeAttr("disabled","disabled");
	$("#workBookEditForm").form("enableValidation");
	currWorkBookUrl = updateWorkBookUrl;
	
}
/* 子表添加按钮超链接事件 */
function wbDetailManager(){
	$("#dgWorkBookDetail").datagrid("appendRow",{});
	var rows = $("#dgWorkBookDetail").datagrid("getRows");
	$("#dgWorkBookDetail").datagrid("beginEdit",rows.length - 1);
}
/* 子表保存按钮触发事件 */
function saveWb_detail(){
	var rows = $("#dgWorkBookDetail").datagrid("getRows");
	$("#workBookManager_savebtn").linkbutton({disabled:false});
	$.each(rows,function(index,item){
		$("#dgWorkBookDetail").datagrid("endEdit",index);
		$("#dgWorkBookDetail").datagrid("cancelEdit",index);
	});
}
/* 保存(主)新添加的子表信息 */
function saveForm(){
	var form = $("#workBookEditForm");
	var workBookInfo = serializeObject(form);
	var workBookDetail = $("#dgWorkBookDetail").datagrid("getRows");
	if(workBookDetail){
		workBookInfo.wbdList = workBookDetail;
	}
	/* 将新增的保存的数据打印在控制台上 */
	console.log(JSON.stringify(workBookInfo));
	$.ajax({
		url:currWorkBookUrl,
		type:"post",
		dataType:"json",
		data:JSON.stringify(workBookInfo),
		contentType:"application/json;charset=utf-8",
		success:function(result){
			if(result.msg){
				$("#dgWorkBookInfo").datagrid("reload");
				init();
				$.messager.alert("系统提示","操作成功","info");
			}else {
				$.messager.alert("系统提示","操作失败","error");
			}
		},error:function(){
				$.messager.alert("系统提示","系统繁忙，请稍后操作","warning");
			}
		
	});
	currWorkBookUrl = "";
}
/* 删除（主）单机事件 */
function delworkBook(){
	var row = $("#dgWorkBookInfo").datagrid("getSelected");
	if(row == null){
		$.messager.alert("系统提示","请选择需要删除的数据","warning");
		return false;
	}
	$.messager.confirm("删除提示","您确认要删除该数据吗？",function(r){
		if(r){
			$.post("../workBook/deleteWorkBookInfo.action",{wb_id:row.wb_id},function(result){
				if(result.msg){
					$("#dgWorkBookInfo").datagrid("reload");
					init();
					$.messager.alert("系统提示","删除成功！","info");
				}else {
					$.messager.alert("系统提示","删除失败！","info");
				}
			});
		}
	});
}
/* 子表修改按钮触发事件 */
function wbDetailModify(){
	var rows = $("#dgWorkBookDetail").datagrid("getSelections");
	if(rows == 0){
		$.messager.alert("系统提示","请选择需要修改的数据","warning");
		return false;
	}
	/* 循环遍历修改（jQuery） */
	$.each(rows,function(index,row){
		var currIndex = $("#dgWorkBookDetail").datagrid("getRowIndex",row);
		$("#dgWorkBookDetail").datagrid("beginEdit",currIndex);
	});
}
/* 子表删除按钮触发事件 */
function wbDetailDelete(){
	var rows = $("#dgWorkBookDetail").datagrid("getSelections");
	if(rows == 0){
		$.messager.alert("系统提示","请选择需要删除的数据","warning");
		return false;
	}
	$.messager.confirm("删除提示","您确定要删除选中的数据吗？",function(r){
		if(r){
			/* 循环遍历删除 */
			$.each(rows,function(index,row){
				var currIndex = $("#dgWorkBookDetail").datagrid("getRowIndex",row);
				$("#dgWorkBookDetail").datagrid("deleteRow",currIndex);
			});
		}
	});
}