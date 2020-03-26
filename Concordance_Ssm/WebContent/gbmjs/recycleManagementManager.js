var addRecycleUrl = "../recycle/addRecycleInfo.action";
var updateRecycleUrl = "../recycle/updateRecycleInfo.action";
var currrRecycleUrl = "";
/* 判断是否是行编辑的新增按钮 */
var addDetail="";

/**
 * 回收站主表的JS样式
 */
/* 主表模糊查询 */
function searchRecycleInfo(){
	var searchValue = $("#r_recycleName").val();
	jQuery("#dgRecycleInfo").datagrid("load",{
		r_recycleName:searchValue
	});
}
/* 页面加载事件，只加载一次，一加载所需要的表就都出来了 */
jQuery(function(){
	init();
	jQuery("#dgRecycleInfo").datagrid({
		/* 注意这个回掉函数名 */
		onClickRow:function(index,row){
			$("#recycleEditForm").form("load",row);
			$("#dgMaterialsDetail").datagrid("loadData",row.materialsList);
			$("#dgRecycleEmpDetail").datagrid("loadData",row.empList);
		}
	});
});
/* 控制页面按钮逻辑的方法(加载时的按钮状态) */
function init(){
	jQuery("#recycleManager_newbtn").linkbutton({disabled:false});
	jQuery("#recycleManager_editbtn").linkbutton({disabled:false});
	jQuery("#recycleManager_delbtn").linkbutton({disabled:false});
	
	jQuery("#recycleManager_savebtn").linkbutton({disabled:true});
	jQuery("#recycleManager_canclebtn").linkbutton({disabled:true});
	
	jQuery("#recycleDeatilAdd").linkbutton({disabled:true});
	jQuery("#recycleDeatilUpdate").linkbutton({disabled:true});
	jQuery("#recycleDeatilDel").linkbutton({disabled:true});
	jQuery("#recycleDeatilSav").linkbutton({disabled:true});
	
	jQuery("#recycleDeatilAdd2").linkbutton({disabled:true});
	jQuery("#recycleDeatilUpdate2").linkbutton({disabled:true});
	jQuery("#recycleDeatilDel2").linkbutton({disabled:true});
	jQuery("#recycleDeatilSav2").linkbutton({disabled:true});
	
	jQuery("#recycleEditForm").form("clear");
	jQuery("#dgRecycleEmpDetail").datagrid("loadData",{
		rows:[],
		total:0
	});
	jQuery("#dgMaterialsDetail").datagrid("loadData",{
		rows:[],
		total:0
	});
	currrRecycleUrl = "";
	jQuery("#recycleEditForm").form("disableValidation");
	jQuery("#recycleEditForm :input").attr("disabled","disabled");
}
/* 点击新增（主）的按钮逻辑触发事件 */
function newRecycleInfo(){
	jQuery("#recycleManager_canclebtn").linkbutton({disabled:false});
	jQuery("#recycleManager_delbtn").linkbutton({disabled:true});
	jQuery("#recycleManager_editbtn").linkbutton({disabled:true});
	
	jQuery("#recycleDeatilAdd").linkbutton({disabled:false});
	jQuery("#recycleDeatilUpdate").linkbutton({disabled:false});
	jQuery("#recycleDeatilDel").linkbutton({disabled:false});
	jQuery("#recycleDeatilSav").linkbutton({disabled:false});
	
	jQuery("#recycleDeatilAdd2").linkbutton({disabled:false});
	jQuery("#recycleDeatilUpdate2").linkbutton({disabled:false});
	jQuery("#recycleDeatilDel2").linkbutton({disabled:false});
	jQuery("#recycleDeatilSav2").linkbutton({disabled:false});
	
	jQuery("#recycleEditForm :input").removeAttr("disabled","disabled");
	jQuery("#recycleEditForm").form("enableValidation");
	
	jQuery("#recycleEditForm").form("clear");
	
	jQuery("#dgRecycleEmpDetail").datagrid("loadData",{
		rows:[],
		total:0
	});
	
	jQuery("#dgMaterialsDetail").datagrid("loadData",{
		rows:[],
		total:0
	});
	
	currRecycleUrl = addRecycleUrl;
}
/* 点击取消按钮触发事件 */
function cancleRecycle(){
	init();	
}
/* 点击修改(主)触发事件 */
function editRecycle(){
	var row = jQuery("#dgRecycleInfo").datagrid("getSelected");
	if(row == null){
		jQuery.messager.alert("系统提示","请选择需要修改的数据","warning");
		return false;
	}
	jQuery("#recycleManager_canclebtn").linkbutton({disabled:false});
	jQuery("#recycleManager_delbtn").linkbutton({disabled:true});
	jQuery("#recycleManager_newbtn").linkbutton({disabled:true});
	
	jQuery("#recycleDeatilAdd").linkbutton({disabled:false});
	jQuery("#recycleDeatilUpdate").linkbutton({disabled:false});
	jQuery("#recycleDeatilDel").linkbutton({disabled:false});
	jQuery("#recycleDeatilSav").linkbutton({disabled:false});
	
	jQuery("#recycleDeatilAdd2").linkbutton({disabled:false});
	jQuery("#recycleDeatilUpdate2").linkbutton({disabled:false});
	jQuery("#recycleDeatilDel2").linkbutton({disabled:false});
	jQuery("#recycleDeatilSav2").linkbutton({disabled:false});
	
	jQuery("#recycleEditForm :input").removeAttr("disabled","disabled");
	jQuery("#recycleEditForm").form("enableValidation");
	currRecycleUrl = updateRecycleUrl;
	
}
/* 子表添加按钮超链接事件(人员) */
function wbDetailManager(){
	addDetail="addDetail";
	jQuery("#dgRecycleEmpDetail").datagrid("appendRow",{});
	var rows = jQuery("#dgRecycleEmpDetail").datagrid("getRows");
	jQuery("#dgRecycleEmpDetail").datagrid("beginEdit",rows.length - 1);
}
/* 子表添加按钮超链接事件(物资) */
function wbDetailManager2(){
	addDetail="addDetail";
	jQuery("#dgMaterialsDetail").datagrid("appendRow",{});
	var rows = $("#dgMaterialsDetail").datagrid("getRows");
	jQuery("#dgMaterialsDetail").datagrid("beginEdit",rows.length - 1);
}
/* 子表保存按钮触发事件(人员) */
function saveWb_detail(){
	var rows = $("#dgRecycleEmpDetail").datagrid("getRows");
	console.info(JSON.stringify(rows));
	jQuery("#recycleManager_savebtn").linkbutton({disabled:false});
	jQuery.each(rows,function(index,item){
		jQuery("#dgRecycleEmpDetail").datagrid("endEdit",index);
		jQuery("#dgRecycleEmpDetail").datagrid("cancelEdit",index);
	});
	addDetail="";
}
/* 子表保存按钮触发事件(物资) */
function saveWb_detail2(){
	var rows = jQuery("#dgMaterialsDetail").datagrid("getRows");
	jQuery("#recycleManager_savebtn").linkbutton({disabled:false});
	jQuery.each(rows,function(index,item){
		jQuery("#dgMaterialsDetail").datagrid("endEdit",index);
		jQuery("#dgMaterialsDetail").datagrid("cancelEdit",index);
	});
}
/* FROM表单序列化转对象,转化完成之后就不用eval转化了 */
function serializeObject(form){
	var o = {};
	jQuery.each(form.serializeArray(),function(index){
		if(o[this['name']]){
			
			o[this['name']] = o[this['name']]+","+this['value'];
		} else{
			o[this['name']] = this['value'];
		}
	});
	return o;
}
/* 保存(主)新添加的子表信息 */
function saveForm(){
	var form = jQuery("#recycleEditForm");
	var recycleInfo = serializeObject(form);
	/* 员工信息 */
	var recycleDetail = jQuery("#dgRecycleEmpDetail").datagrid("getRows");
	if(recycleDetail){
		recycleInfo.empList = recycleDetail;
	}
	/* 物资信息 */
	var materialsDetail = jQuery("#dgMaterialsDetail").datagrid("getRows");
	if(materialsDetail){
		recycleInfo.materialsList = materialsDetail;
	}
	
	/* 将新增的保存的数据打印在控制台上 */
	/*console.log(JSON.stringify(recycleInfo));*/
	
	$.ajax({
		url:currRecycleUrl,
		type:"post",
		dataType:"json",
		data:JSON.stringify(recycleInfo),
		contentType:"application/json;charset=utf-8",
		success:function(result){
			if(result.msg){
				jQuery("#dgRecycleInfo").datagrid("reload");
				init();
				jQuery.messager.alert("系统提示","操作成功","info");
			}else {
				jQuery.messager.alert("系统提示","操作失败","error");
			}
		},error:function(){
			jQuery.messager.alert("系统提示","系统繁忙，请稍后操作","warning");
			}
		
	});
	currRecycleUrl = "";
}
/* 删除（主）单机事件 */
function delRecycle(){
	var row = jQuery("#dgRecycleInfo").datagrid("getSelected");
	if(row == null){
		jQuery.messager.alert("系统提示","请选择需要删除的数据","warning");
		return false;
	}
	jQuery.messager.confirm("删除提示","您确认要删除该数据吗？",function(r){
		if(r){
			jQuery.post("../recycle/deleteRecycleInfo.action",{re_id:row.re_id},function(result){
				if(result.msg){
					jQuery("#dgRecycleInfo").datagrid("reload");
					init();
					jQuery.messager.alert("系统提示","删除成功！","info");
				}else {
					jQuery.messager.alert("系统提示","删除失败！","info");
				}
			});
		}
	});
}
/* 子表修改按钮触发事件(人员) */
function wbDetailModify(){
	var rows = jQuery("#dgRecycleEmpDetail").datagrid("getSelections");
	if(rows == 0){
		$.messager.alert("系统提示","请选择需要修改的数据","warning");
		return false;
	}
	/* 循环遍历修改（jQuery） */
	jQuery.each(rows,function(index,row){
		var currIndex = $("#dgRecycleEmpDetail").datagrid("getRowIndex",row);
		jQuery("#dgRecycleEmpDetail").datagrid("beginEdit",currIndex);
	});
}
/* 子表修改按钮触发事件(物资) */
function wbDetailModify2(){
	var rows = jQuery("#dgMaterialsDetail").datagrid("getSelections");
	if(rows == 0){
		jQuery.messager.alert("系统提示","请选择需要修改的数据","warning");
		return false;
	}
	/* 循环遍历修改（jQuery） */
	jQuery.each(rows,function(index,row){
		var currIndex = $("#dgMaterialsDetail").datagrid("getRowIndex",row);
		jQuery("#dgMaterialsDetail").datagrid("beginEdit",currIndex);
	});
}
/* 子表删除按钮触发事件(人员) */
function wbDetailDelete(){
	var rows = jQuery("#dgRecycleEmpDetail").datagrid("getSelections");
	if(rows == 0){
		jQuery.messager.alert("系统提示","请选择需要删除的数据","warning");
		return false;
	}
	jQuery.messager.confirm("删除提示","您确定要删除选中的数据吗？",function(r){
		if(r){
			/* 循环遍历删除 */
			jQuery.each(rows,function(index,row){
				var currIndex = $("#dgRecycleEmpDetail").datagrid("getRowIndex",row);
				jQuery("#dgRecycleEmpDetail").datagrid("deleteRow",currIndex);
			});
		}
	});
}
/* 子表删除按钮触发事件(物资) */
function wbDetailDelete2(){
	var rows = jQuery("#dgMaterialsDetail").datagrid("getSelections");
	if(rows == 0){
		jQuery.messager.alert("系统提示","请选择需要删除的数据","warning");
		return false;
	}
	jQuery.messager.confirm("删除提示","您确定要删除选中的数据吗？",function(r){
		if(r){
			/* 循环遍历删除 */
			jQuery.each(rows,function(index,row){
				var currIndex = jQuery("#dgMaterialsDetail").datagrid("getRowIndex",row);
				jQuery("#dgMaterialsDetail").datagrid("deleteRow",currIndex);
			});
		}
	});
}
/* 自动加载地图 */
$(function(){
//	// 百度地图API功能
//	var map = new BMap.Map("allmap");    // 创建Map实例
//	map.centerAndZoom(new BMap.Point(108.952806,34.24006), 15);  // 初始化地图,设置中心点坐标和地图级别
//	//添加地图类型控件
//	map.addControl(new BMap.MapTypeControl({
//		mapTypes:[
//            BMAP_NORMAL_MAP,
//            BMAP_HYBRID_MAP
//        ]}));	  
//	map.setCurrentCity("西安");          // 设置地图显示的城市 此项是必须设置的
//	map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
//	
	// 百度地图API功能
    var map = new BMap.Map('allmap');
    var poi = new BMap.Point(108.952986,34.239083);
    map.centerAndZoom(poi, 18);
    map.enableScrollWheelZoom();
    
    var polygon = new BMap.Polygon([
		new BMap.Point(108.951567,34.239814),
		new BMap.Point(108.95255,34.239807),
		new BMap.Point(108.952568,34.239411),
		new BMap.Point(108.952065,34.239359),
		new BMap.Point(108.951562,34.239411),
	], {strokeColor:"red",fillColor:"red", strokeWeight:2, strokeOpacity:0.6});  //创建多边形
	map.addOverlay(polygon);   //增加多边形
	
	
	
	
	
	
	
	
	var points = [
   				 new BMap.Point(108.951728,34.239672),
                 new BMap.Point(108.952402,34.239575),
                 new BMap.Point(108.951872,34.239546),
                 new BMap.Point(108.952222,34.239557),
                 new BMap.Point(108.952188,34.239645)];
	
	var pt = new BMap.Point(108.952088,34.239745);
	var myIcon = new BMap.Icon("../images/回收站1.png", new BMap.Size(20,20));
	var marker2 = new BMap.Marker(pt,{icon:myIcon});  // 创建标注
	map.addOverlay(marker2);              // 将标注添加到地图中
	marker2.enableDragging();	//定点可移动
	marker2.addEventListener("click",attribute);
	
	ljd();
	
	function ljd(){
		for(var i=0;i<points.length;i++){
			var myIcon = new BMap.Icon("../images/回收员1.png", new BMap.Size(20,20));
			var marker = new BMap.Marker(points[i],{icon:myIcon});  // 创建标注
			map.addOverlay(marker);              // 将标注添加到地图中
			marker.enableDragging();	//定点可移动
			marker.addEventListener("click",attribute1);
		}
	}
	/* 获取坐标 */
	function attribute(e){
		var p = e.target;
		alert("垃圾回收点信息：" + p.getPosition().lng + "," + p.getPosition().lat);    
	}	
	//信息窗口的内容定义
    var content = '<div style="margin:0;line-height:20px;padding:2px;">' +
                    '地址：北京市海淀区上地十街10号<br/>电话：(010)59928888<br/>简介：百度大厦位于北京市海淀区西二旗地铁站附近，为百度公司综合研发及办公总部。' +
                  '</div>';
	function attribute1(e){
		var p = e.target;
		alert("回收员信息：" + p.getPosition().lng + "," + p.getPosition().lat);  
		/*alert(content);*/
	}	
	
	
	
    $("getLastOverLay").onclick = function(){
        if(overlays.length){
            alert(overlays[overlays.length - 1]);
        }else{
            alert("没有覆盖物");
        }
    }
 
    //信息窗口的内容定义
    var content = '<div style="margin:0;line-height:20px;padding:2px;">' +
                    '地址：北京市海淀区上地十街10号<br/>电话：(010)59928888<br/>简介：百度大厦位于北京市海淀区西二旗地铁站附近，为百度公司综合研发及办公总部。' +
                  '</div>';
    
    //创建带信息窗口的poi点
    var searchInfoWindow = new BMapLib.SearchInfoWindow(map, content, {
        title  : "百度大厦",      //标题
        width  : 290,             //宽度
        height : 105,              //高度
        panel  : "panel",         //检索结果面板
        enableAutoPan : true,     //自动平移
        searchTypes   :[
            BMAPLIB_TAB_SEARCH,   //周边检索
            BMAPLIB_TAB_TO_HERE,  //到这里去
            BMAPLIB_TAB_FROM_HERE //从这里出发
        ]
    });    
    
    var overlays = [];
    //回调获得覆盖物信息
    var overlaycomplete = function(e){
        overlays.push(e.overlay);
        var result = "";
        result = "<p>";
        result += e.drawingMode + ":";
        if (e.drawingMode == BMAP_DRAWING_MARKER) {
            result += ' 坐标：' + e.overlay.getPosition().lng + ',' + e.overlay.getPosition().lat;
            if ($('isInfowindow').checked) {
                searchInfoWindow.open(e.overlay);
            }
            alert(result);
        }
        if (e.drawingMode == BMAP_DRAWING_CIRCLE) {
            result += ' 半径：' + e.overlay.getRadius();
            result += ' 中心点：' + e.overlay.getCenter().lng + "," + e.overlay.getCenter().lat;
            alert(result);
            return false;
        }
        if (e.drawingMode == BMAP_DRAWING_POLYLINE || e.drawingMode == BMAP_DRAWING_POLYGON || e.drawingMode == BMAP_DRAWING_RECTANGLE) {
            result += ' 所画的点个数：' + e.overlay.getPath().length;
            result+='坐标为：';
            for(var i=0;i<e.overlay.getPath().length;i++){
            	result+=e.overlay.getPath()[i].lng+','+e.overlay.getPath()[i].lat+';';
            }
            alert(result);
            return false;
        }
        result += "</p>";
        $("showOverlayInfo").style.display = "none";
        $("panel").innerHTML += result; //将绘制的覆盖物信息结果输出到结果面板
    };
 
    var styleOptions = {
        strokeColor:"red",    //边线颜色。
        fillColor:"red",      //填充颜色。当参数为空时，圆形将没有填充效果。
        strokeWeight: 3,       //边线的宽度，以像素为单位。
        strokeOpacity: 0.8,	   //边线透明度，取值范围0 - 1。
        fillOpacity: 0.6,      //填充的透明度，取值范围0 - 1。
        strokeStyle: 'solid' //边线的样式，solid或dashed。
    }
    //实例化鼠标绘制工具
    var drawingManager = new BMapLib.DrawingManager(map, {
        isOpen: false, //是否开启绘制模式
        enableDrawingTool: true, //是否显示工具栏
        drawingToolOptions: {
            anchor: BMAP_ANCHOR_TOP_RIGHT, //位置
            offset: new BMap.Size(5, 5), //偏离值
            scale: 0.8 //工具栏缩放比例
        },
        circleOptions: styleOptions, //圆的样式
        polylineOptions: styleOptions, //线的样式
        polygonOptions: styleOptions, //多边形的样式
        rectangleOptions: styleOptions //矩形的样式
    });
 
    
    //添加鼠标绘制工具监听事件，用于获取绘制结果
    drawingManager.addEventListener('overlaycomplete', overlaycomplete);
    
    /* 影响了面板的显示 */
//   function $(id){
//        return document.getElementById(id);
//    }
 
//    function clearAll() {
//        for(var i = 0; i < overlays.length; i++){
//            map.removeOverlay(overlays[i]);
//        }
//        overlays.length = 0
//    }
//    var isPanelShow = false;
//    //显示结果面板动作
//    $("showPanelBtn").onclick = showPanel;
//    function showPanel(){
//        if (isPanelShow == false) {
//            isPanelShow = true;
//            $("showPanelBtn").style.right = "230px";
//            $("panelWrap").style.width = "230px";
//            $("map").style.marginRight = "230px";
//            $("showPanelBtn").innerHTML = "隐藏绘制结果信息<br/>>";
//        } else {
//            isPanelShow = false;
//            $("showPanelBtn").style.right = "0px";
//            $("panelWrap").style.width = "0px";
//            $("map").style.marginRight = "0px";
//            $("showPanelBtn").innerHTML = "显示绘制结果信息<br/><";
//        }
//    }
});


/* 开始自动隐藏地图 */
//$(function(){
//	$("#allmap").hide();
//	$("#result").hide();
//});


/* 点击地图定位按钮触发事件 */
function openMapRecycle(){
	
	/*$("#tabs").toggle();*/
	$("#allmap").toggle();
	$("#result").toggle();
	/*$("#tab_show").toggle();*/
	
}