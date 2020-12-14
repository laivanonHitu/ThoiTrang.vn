<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title><decorator:title default="Master-layout" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href="${pageContext.request.contextPath}/assets/user/css/bootstrap.css" rel="stylesheet" />
<!-- Customize styles -->
<link href="${pageContext.request.contextPath}/assets/user/style.css"  rel="stylesheet" />
<!-- font awesome styles -->
<link href="${pageContext.request.contextPath}/assets/user/font-awesome/css/font-awesome.css" rel="stylesheet">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/user/ico/favicon.ico" >
<decorator:head />
</head>
<body>
	<!-- 
	Upper Header Section 
-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">
					<div class="pull-left socialNw">
						<a href="#"><span class="icon-twitter"></span></a> <a href="#"><span
							class="icon-facebook"></span></a> <a href="#"><span
							class="icon-youtube"></span></a> <a href="#"><span
							class="icon-tumblr"></span></a>
					</div>
					<a class="active" href="<c:url value="/home"/>"> <span
						class="icon-home"></span> Home
					</a> <a href=""><span class="icon-user"></span> My Account</a> <a
						href="<c:url value="/dang-ky"/>"><span class="icon-edit"></span>
						Đăng ký thành viên </a> <a href="contact.html"><span
						class="icon-envelope"></span> Contact us</a> <a
						href="<c:url value="gio-hang"/>"><span
						class="icon-shopping-cart"></span> ${TotalCart} Item(s) - <span
						class="badge badge-warning"> <fmt:formatNumber
								type="number" groupingUsed="true" value="${TotalPrice}" />₫
					</span></a>
				</div>
			</div>
		</div>
	</div>

	<!--
Lower Header Section 
-->
	<div class="container">
		<div id="gototop"></div>

		<%@include file="/WEB-INF/views/layouts/web/header.jsp"%>

		<decorator:body />

		<%@include file="/WEB-INF/views/layouts/web/footer.jsp"%>

	</div>
	<!-- /container -->

	<div class="copyright">
		<div class="container">
			<p class="pull-right">
				<a href="#"><img
					src="<c:url value="${pageContext.request.contextPath}/assets/user/img/maestro.png"/>" alt="payment"></a>
				<a href="#"><img src="<c:url value="/assets/user/img/mc.png"/>"
					alt="payment"></a> <a href="#"><img
					src="<c:url value="${pageContext.request.contextPath}/assets/user/img/pp.png"/>" alt="payment"></a>
				<a href="#"><img
					src="<c:url value="${pageContext.request.contextPath}/assets/user/img/visa.png"/>" alt="payment"></a>
				<a href="#"><img
					src="<c:url value="${pageContext.request.contextPath}/assets/user/img/disc.png"/>" alt="payment"></a>
			</p>
			<span>Copyright &copy; 2013<br> bootstrap ecommerce
				shopping template
			</span>
		</div>
	</div>
	<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="${pageContext.request.contextPath}/assets/user/js/jquery.js" ></script>
	<script src="${pageContext.request.contextPath}/assets/user/js/bootstrap.min.js" ></script>
	<script
		src="${pageContext.request.contextPath}/assets/user/js/jquery.easing-1.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/user/js/jquery.scrollTo-1.4.3.1-min.js" ></script>
	<script src="${pageContext.request.contextPath}/assets/user/js/shop.js" ></script>
</body>
</html>
