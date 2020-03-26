/* 监听浏览器回退事件 */
    $(function(){ 
	pushHistory(); 
	window.addEventListener("popstate", function(e) { 
		alert("我监听到了浏览器的返回按钮事件啦");	//根据自己的需求实现自己的功能 
		$.ajax({
			url:"../employeeInfo/logout",	//退出登录
			success:function(){
				window.location="../login.jsp";
			},
			error:function(){
				window.location="../login.jsp";
			}
		});
	}, false); 
	function pushHistory() { 
		var state = { 
				title: "title",
				url: "#"
		}; 
		window.history.pushState(state, "title", "#"); 
	} 
});
