var currUrl="";	
var updatesCommunityInfoDetail='../CommunityInfoDetail/updateCommunityInfoDetail.action';
var newcommunity= '../community/newCommunityInfo.action';
var updatecommunityInfo='../community/updateCommunityInfo.action';



/*地图*/
// 百度地图API功能
var map = new BMap.Map("allmaps");        // 创建Map实例
map.centerAndZoom(new BMap.Point(108.952986,34.239083), 15);  // 初始化地图,设置中心点坐标和地图级别
//添加地图类型控件
map.addControl(new BMap.MapTypeControl({
mapTypes:[
    BMAP_NORMAL_MAP,
    BMAP_HYBRID_MAP
]}));	  
map.setCurrentCity("西安");          // 设置地图显示的城市 此项是必须设置的
map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
/*地图END*/


/*地图*/
		// 百度地图API功能
	var map = new BMap.Map("allmap");        // 创建Map实例
	map.centerAndZoom(new BMap.Point(108.952986,34.239083), 15);  // 初始化地图,设置中心点坐标和地图级别
	//添加地图类型控件
	map.addControl(new BMap.MapTypeControl({
		mapTypes:[
            BMAP_NORMAL_MAP,
            BMAP_HYBRID_MAP
        ]}));	  
	map.setCurrentCity("西安");          // 设置地图显示的城市 此项是必须设置的
	map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
/*地图END*/	

/*小区详情*/
function updatecommunityInfoDetail() {//小区详情修改
	var rows=$("#communityInfoDetailGrid").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	currUrl=updatesCommunityInfoDetail;
	$("#fmCommunityInfoDetail").form("load",rows[0]);
	$("#dlgcommunityInfoDetail").dialog("open").dialog("setTitle","修改小区信息");
}
function closecommunityInfoDetail(){//小区详情关闭按钮触发事件
	$("#fmCommunityInfoDetail").form("clear");
	$("#dlgcommunityInfoDetail").dialog("close");
}
function savecommunityInfoDetail(){//保存按扭触发事件
	$("#fmCommunityInfoDetail").form("submit",{
		url:currUrl,
		/*提交之前验证是否有未填项*/
		onSubmit:function(){
			return $(this).form("validate");
		},
		success:function(result){
		var	result=eval('('+result+')');//将json字符串转化成对象
			if(result.msg){
				$.messager.alert("系统提示","保存成功","info");
				$("#communityInfoDetailGrid").datagrid("reload");
				closecommunityInfoDetail();
			}else{
				$.messager.alert("系统提示","保存失败","warning");
			}
		}
	});
	currUrl="";
}
function delectcommunityInfoDetail(){//删除小区信息
	var rows=$("#communityInfoDetailGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","至少选中一条","warning")
		return false;
	}
	var cd_ids=[];
	$.each(rows,function(index,row){
		 cd_ids.push(row.cd_id);
	});
	var cd_idss=cd_ids.join(",");
	$.messager.confirm("删除提示","您确认要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗?",function(r){
		if(r){
			$.ajax({
				url:'../CommunityInfoDetail/deleteCommunityInfoDetail.action',
				data:{cd_idss:cd_idss},
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
/*小区详情END*/
/*试点小区新增*/
function newcommunityInfo(){
	currUrl=newcommunity;
	$("#dlgcommunity").dialog("open").dialog("setTitle","新增试点小区信息");
}
/*修改试点小区信息*/
function updatecommunity(){
	currUrl=updatecommunityInfo;
	var rows=$("#communityGrid").datagrid("getSelections");
	if(rows.length!=1){
		$.messager.alert("系统提示","请选择一条需要修改的数据","warning");
		return false;
	}
	$("#dlgcommunity").dialog("open").dialog("setTitle","新增试点小区信息");
	$("#fmtenderContractInfo").form("load",rows[0]);
}

function newCommunityInfo(){//试点小区信息保存按扭触发事件
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
				closecommunity();
				$("#communityGrid").datagrid("reload");
				$("#communityInfoDetailGrid").datagrid("reload");
			}else{
				$.messager.alert("系统提示","保存失败","warning");
			}
		}
	});
	currUrl="";
}
function closecommunity(){//试点小区关闭按钮触发事件
	$("#fmtenderContractInfo").form("clear");
	$("#dlgcommunity").dialog("close");
}
function deletecommunity(){//试点小区删除
	var rows=$("#communityGrid").datagrid("getSelections");
	if(rows.length<1){
		$.messager.alert("系统提示","至少选中一条","warning")
		return false;
	}
	var co_ids=[];
	$.each(rows,function(index,row){
		 co_ids.push(row.co_id);
	});
	var co_idss=co_ids.join(",");
	$.messager.confirm("删除提示","您确认要删除选中的<font color='red' size='5'>"+rows.length+"</font>条数据吗?",function(r){
		if(r){
			$.ajax({
				url:'../community/deleteCommunityInfo.action',
				data:{co_idss:co_idss},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result.msg){
						$.messager.alert("系统提示","成功删除选中的<font color='red' size='5'>"+result.conut+"</font>条数据","info");
						$("#communityGrid").datagrid("reload");
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


/*点击选择项目负责人按钮触发事件*/
function openCommunityDialog(){
	$("#dlgemployeeInfo").dialog("open").dialog("setTitle","请选择项目负责人");
}
/*选中项目负责人点击确定按钮触发事件*/
function chooseemployee(){
var row=$("#dgemployeeInfo").datagrid("getSelected");
	if(row==null){
		$.messager.alert("系统提示","请选择一个采购人","warning");
		return false;
	}
	$("#co_projectLeader").val(row.em_id);
	$("#em_names").val(row.em_name);
	closeemployeeDialog();
}
/*选中项目负责人点击关闭按钮触发事件*/
function closeemployeeDialog() {
	//清空
	$("#dgRoleInfo").datagrid({
		rows:[],
		totak:0
	})
	$("#dlgemployeeInfo").dialog("close");
}


