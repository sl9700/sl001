<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>垃圾分类信息化管理系统</title>
	 	<link href="css/base.css" rel="stylesheet">
	    <link href="css/login/login.css" rel="stylesheet">
	    <script type="text/javascript" src="js/jquery.min.js"></script>
	</head>
	<body>
		<div class="login-hd">
			<div class="left-bg"></div>
			<div class="right-bg"></div>
			<div class="hd-inner">
				<span class="logo"></span>
				<span class="split"></span>
				<span class="sys-name" style="color: #fff;font-size: 40px;font-family: '隶书'">垃圾分类信息化管理系统</span>
			</div>
		</div>
		<div class="login-bd">
			<div class="bd-inner">
				<div class="inner-wrap">
					<div class="lg-zone">
						<div class="lg-box">
							<div class="lg-label"><h4>用户登录</h4></div>
							<div class="alert alert-error">
				              <i class="iconfont">&#xe62e;</i>
				              <span id="massagers" style="font-size: 16px;font-weight: bold;">请输入用户信息</span>
				            </div>
							<form action="${pageContext.request.contextPath }/employeeInfo/login.action" method="post" id="form1">
								<div class="lg-username input-item clearfix">
									<i class="iconfont">&#xe60d;</i>
									<input type="text" name="em_account" id="em_account" placeholder="请输入用户名">
								</div>
								<div class="lg-password input-item clearfix">
									<i class="iconfont">&#xe634;</i>
									<input type="password" name="em_password" id="em_password" placeholder="请输入密码">
								</div>
								<div class="lg-check clearfix">
									<div class="input-item">
										<i class="iconfont">&#xe633;</i>
										<!-- 回车的键盘编码即为13 -->
										<input type="text" onkeydown="if(event.keyCode==13)form1.submit()" maxlength="4" name="yzm" id="yzm" placeholder="验证码">
									</div>
									<span class="check-code">
										<img title="换一张试试" onclick="javascript:loadImage()" src="${pageContext.request.contextPath }/images/image.jsp" id="randImage" name="randImage" style="width: 114px;height: 41px;"/>
									</span>
								</div>
								<div class="tips clearfix">
									<label><input type="checkbox" checked="checked">记住用户名</label>
									<a href="javascript:register()" class="register">立即注册</a>
									<a href="javascript:;" class="forget-pwd">忘记密码？</a>
								</div>
								<div class="enter" style="text-align: center;">
									<a href="javascript:login()" class="purchaser">登录</a>
								</div>
							</form>
						</div>
					</div>
					<div class="lg-poster"></div>
				</div>
			</div>
		</div>
		<div class="login-ft">
			<div class="ft-inner">
				<div class="about-us">
					<a href="javascript:;">关于我们</a>
					<a href="javascript:;">法律声明</a>
					<a href="javascript:;">服务条款</a>
					<a href="javascript:;">联系方式</a>
				</div>
				<div class="address">地址：陕西省西安市碑林区高速大厦&nbsp;邮编：2019&nbsp;&nbsp;Copyright&nbsp;©&nbsp;2006&nbsp;-&nbsp;2019&nbsp;北邮在线-专注于IT精英&nbsp;版权所有</div>
				<div class="other-info">建议使用IE8及以上版本浏览器&nbsp;&nbsp;09003078号&nbsp;E-mail：1191619897@qq.com</div>
			</div>
		</div>
		<script type="text/javascript" src="gbmjs/login.js"></script>
	</body>
</html>