<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zxx">

<head>
	<title>牧场总后台</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content=""
	/>
	<script type="text/javascript">
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}

	</script>
	<!-- Meta tag Keywords -->
	<!-- css files -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin-login.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontawesome-all.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->
	<!-- web-fonts -->
	<link href="http://maxcdn.bootstrapcdn.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
	<link href="http://maxcdn.bootstrapcdn.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
	<!-- //web-fonts -->
</head>

<body>
	<!-- bg effect -->
	<div id="bg">
		<canvas></canvas>
		<canvas></canvas>
		<canvas></canvas>
	</div>
	<!-- //bg effect -->
	<!-- title -->
	<h1>牧 场 总 后 台</h1>
	<!-- //title -->
	<!-- content -->
	<div class="sub-main-w3">
		<form  action="${pageContext.request.contextPath}/admin/login"  method="post">
			<h2>登 录
				<i class="fas fa-level-down-alt"></i>
			</h2>
			<div class="form-style-agile">
				<label>
					<i class="fas fa-user"></i>
					手机号
				</label>
				<input placeholder="phone" name="phone" type="text" required="">
			</div>
			<div class="form-style-agile">
				<label>
					<i class="fas fa-unlock-alt"></i>
					密码
				</label>
				<input placeholder="Password" name="password" type="password" required="">
			</div>
			<!-- checkbox -->
			<div class="wthree-text">
				<ul>
					<li>
<%--						<label class="anim">--%>
<%--							<input type="checkbox" class="checkbox">--%>
<%--							<span>记 住</span>--%>
<%--						</label>--%>
						<label class="anim">
							<a href="${pageContext.request.contextPath}/admin/toregister">注 册</a>
						</label>
					</li>
					<li>
						<a href="#">忘记密码?</a>
					</li>
				</ul>
				<div id="errorsty" class="errorsty">
					${error}
				</div>
			</div>
			<!-- //checkbox -->
			<input type="submit" value="登 录"></input>
		</form>
	</div>
	<!-- //content -->

	<!-- copyright -->
	<div class="footer">
		<p>山西鼎盛创意科技有限公司技术支持</p>
	</div>
	<!-- //copyright -->

	<!-- Jquery -->
	<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
	<!-- //Jquery -->

	<!-- effect js -->
	<script src="${pageContext.request.contextPath}/js/canva_moving_effect.js"></script>
	<!-- //effect js -->
	<script src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
</body>
<script>

</script>
</html>