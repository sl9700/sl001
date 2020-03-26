/**
 * login.jsp登陆界面的js样式
 */
function login(){
	var em_account=$("#em_account").val();
	var em_password=$("#em_password").val();
	var yzm=$("#yzm").val();
	if(em_account==""){
		$("#massagers").html("*用户名不能为空");
		return false;
	}
	if(em_password==""){
		$("#massagers").html("*密码不能为空");
		return false;
	}
	if(yzm==""){
		$("#massagers").html("*验证码不能为空");
		return false;
	}
	
	/* 用户名格式验证 
	var reg=/^[a-zA-Z0-9_-]{4,16}$/;
    if( !reg.test( document.getElementById("em_account").value ) ) {
      document.getElementById("two").innerHTML="用户名格式不正确";
    	return false;
    }
    else
      document.getElementById("two").innerHTML="正确";
	 密码格式验证 
    var reg=/^.*(?=.{6,})(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*? ]).*$/;
    if( !reg.test( document.getElementById("em_password").value ) ) 
      document.getElementById("massagers").innerHTML="密码格式不正确";
    else
      document.getElementById("massagers").innerHTML="正确";
	
	*/
	$("#form1").submit();
}
/**
 * 正则表达式获取url路径
 */
function getQueryString(name){
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var url=decodeURI(decodeURI(window.location.search));	//获取返回路径
	var r=url.substr(1).match(reg);
	if(r!=null){
		return unescape(r[2]);
	}
	return null;
}

function loadImage(){
	$("#randImage").attr("src","images/image.jsp?"+Math.random());
}

$(function(){
	var error=getQueryString("error");
	var em_account=getQueryString("em_account");
	var em_password=getQueryString("em_password");
	var yzm=getQueryString("yzm");
	if (error==1) {
		$("#massagers").html("*用户名或密码错误");
		$("#em_account").val(em_account);
		$("#em_password").val(em_password);
		$("#yzm").val(yzm);
	}
	if(error==2){
		$("#massagers").html("*验证码错误");
		$("#em_account").val(em_account);
		$("#em_password").val(em_password);
		$("#yzm").val(yzm);
	}
});