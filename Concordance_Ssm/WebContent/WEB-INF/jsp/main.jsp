<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>垃圾分类信息化管理系统</title>
	<link href="${pageContext.request.contextPath }/css/base.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/css/platform.css" rel="stylesheet">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/custom/uimaker/easyui.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/custom/uimaker/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/custom/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/custom/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"></script>
    
   <script type="text/javascript" src="${pageContext.request.contextPath }/gbmjs/mainManager.js"></script>
</head>
<body>
	<div class="container">
        <div id="pf-hd">
            <div class="pf-logo">
                <img src="${pageContext.request.contextPath }/images/ljflLogo.png" alt="logo">
            </div>
            
            <div class="pf-nav-wrap">
              <div class="pf-nav-ww">
                <ul class="pf-nav">
                  <li class="pf-nav-item home current" data-menu="sys-manage">
                      <a href="javascript:;">
                          <span class="iconfont">&#xe63f;</span>
                          <span class="pf-nav-title">系统管理</span>
                      </a>
                  </li>
                  <li class="pf-nav-item project" data-menu="org-manage">
                      <a href="javascript:;">
                          <span class="iconfont">&#xe60d;</span>
                          <span class="pf-nav-title">基础台账管理</span>
                      </a>
                  </li>
                  <li class="pf-nav-item static" data-menu="main-data">
                      <a href="javascript:;">
                          <span class="iconfont">&#xe61e;</span>
                          <span class="pf-nav-title">回收站管理</span>
                      </a>
                  </li>
                  <li class="pf-nav-item manger" data-menu="supplier-mange">
                      <a href="javascript:;">
                          <span class="iconfont">&#xe620;</span>
                          <span class="pf-nav-title">分拣站管理</span>
                      </a>
                  </li>
                </ul>
              </div>
            </div>

            <div class="pf-user">
                <div class="pf-user-photo">
                    <img src="${pageContext.request.contextPath }/images/main/user.png" alt="">
                </div>
                <h4 class="pf-user-name ellipsis">${crurentEmployeeInfo.em_account }</h4>
                <i class="iconfont xiala">&#xe607;</i>
                <div class="pf-user-panel">
                    <ul class="pf-user-opt">
                        <li>
                            <a href="javascript:;">
                                <i class="iconfont">&#xe60d;</i>
                                <span class="pf-opt-name">用户信息</span>
                            </a>
                        </li>
                        <li class="pf-modify-pwd">
                            <a href="javascript:;">
                                <i class="iconfont">&#xe634;</i>
                                <span class="pf-opt-name">修改密码</span>
                            </a>
                        </li>
                        <li class="pf-logout">
                            <a href="${pageContext.request.contextPath }/employeeInfo/logout.action">
                                <i class="iconfont">&#xe60e;</i>
                                <span class="pf-opt-name">退出</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

        </div>

        <div id="pf-bd">
            <div id="pf-sider">
                <h2 class="pf-model-name">
                    <span class="iconfont">&#xe64a;</span>
                    <span class="pf-name">集团管理</span>
                    <span class="toggle-icon"></span>
                </h2>
                <!-- 菜单树 -->
                 <ul id="tree"></ul>
            </div>

            <div id="pf-page">
                <div class="easyui-tabs1" id="tabs" style="width:100%;height:100%;">
                  <div title="首页" style="padding:10px 5px 5px 10px;">
                    <iframe class="page-iframe" src="${pageContext.request.contextPath }/html/index.html" frameborder="no"   border="no" height="100%" width="100%" scrolling="auto"></iframe>
                  </div>
                </div>
            </div>
        </div>

        <div id="pf-ft">
            <div class="system-name">
              <i class="iconfont">&#xe6fe;</i>
              <span>信息管理系统&nbsp;v1.0</span>
            </div>
            <div class="copyright-name">
              <span>CopyRight&nbsp;2016&nbsp;&nbsp;uimaker.com&nbsp;版权所有</span>
              <i class="iconfont" >&#xe6ff;</i>
            </div>
        </div>
    </div>
    
    <script type="text/javascript">
    /**
     * 主界面的js
     */
    $('.easyui-tabs1').tabs(
    		{
    			tabHeight : 44,
    			onSelect : function(title, index) {
    				var currentTab = $('.easyui-tabs1').tabs("getSelected");
    				if (currentTab.find("iframe")
    						&& currentTab.find("iframe").size()) {
    					currentTab.find("iframe").attr("src",
    							currentTab.find("iframe").attr("src"));
    				}
    			}
    		})
    $(window).resize(function() {
    	$('.tabs-panels').height($("#pf-page").height() - 46);
    	$('.panel-body').height($("#pf-page").height() - 76)
    }).resize();

    var page = 0, pages = ($('.pf-nav').height() / 70) - 1;

    if (pages === 0) {
    	$('.pf-nav-prev,.pf-nav-next').hide();
    }
    $(document).on('click', '.pf-nav-prev,.pf-nav-next', function() {

    	if ($(this).hasClass('disabled'))
    		return;
    	if ($(this).hasClass('pf-nav-next')) {
    		page++;
    		$('.pf-nav').stop().animate({
    			'margin-top' : -70 * page
    		}, 200);
    		if (page == pages) {
    			$(this).addClass('disabled');
    			$('.pf-nav-prev').removeClass('disabled');
    		} else {
    			$('.pf-nav-prev').removeClass('disabled');
    		}

    	} else {
    		page--;
    		$('.pf-nav').stop().animate({
    			'margin-top' : -70 * page
    		}, 200);
    		if (page == 0) {
    			$(this).addClass('disabled');
    			$('.pf-nav-next').removeClass('disabled');
    		} else {
    			$('.pf-nav-next').removeClass('disabled');
    		}
    	}
    });

    $(function() {
    	$("#tree")
    			.tree(
    					{
    						url : "../menuInfo/findMenuInfoByRole.action",
    						lines : true,
    						loadFilter : function(data) {
    							return data.menuInfoList;
    						},
    						onLoadSuccess : function() {
    							$("#tree").tree("expandAll"); // expandAll:展开
    															// collapseAll:全部折叠
    						},
    						onClick : function(node) {
    							/* 树形列表，可编辑当前列表的对象 */
    							/* $(this).tree('beginEdit',node.target); */
    							var content = "<iframe frameborder=0 scrolling='auto' style='width:100%;height:100%' src='${pageContext.request.contextPath}/html/"
    									+ node.attributes.url + "'></iframe>"
    							if (node.attributes.url != ""
    									&& node.attributes.url != null) {
    								if ($("#tabs").tabs("exists", node.text)) {
    									$("#tabs").tabs("select", node.text);
    								} else {
    									$("#tabs").tabs("add", {
    										title : node.text,
    										closable : true,
    										iconCls : node.iconCls,
    										content : content
    									});
    								}
    							}
    						}
    					});
    });
    </script>
    
</body>
</html>