<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
	<div class="row">
		<%@include file="/WEB-INF/views/layouts/web/category.jsp"%>





		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/home"/>">Trang chủ</a> <span
					class="divider">/</span></li>
				<li class="active">Đăng nhập</li>
			</ul>
			<h3>Login</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span4">
					<div class="well">
						<c:if test="${status!=true}">
							<h5>ĐĂNG KÝ</h5>
						</c:if>
						<c:if test="${status==true}">
							<h5>ĐĂNG KÝ THÀNH CÔNG</h5>
						</c:if>
						<!-- FORM -->
						<form:form method="POST" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputEmail">tên tài
									khoản</label>
								<div class="controls">
									<form:input class="span3" type="text" maxlength="100"
										placeholder="Điền tên tài khoản" path="account" />
								</div>
								<label class="control-label" for="inputEmail">Mật khẩu</label>
								<div class="controls">
									<form:input class="span3" type="password" maxlength="100"
										placeholder="Nhập mật khẩu" path="password" />
								</div>
								<label class="control-label" for="inputEmail">Họ và tên</label>
								<div class="controls">
									<form:input class="span3" type="text" maxlength="100"
										placeholder="Điền họ và tên" path="user_name" />
								</div>
								<label class="control-label" for="inputEmail">Số điện
									thoại</label>
								<div class="controls">
									<form:input class="span3" type="text" maxlength="14"
										placeholder="Điền số điện thoại" path="phone_number" />
								</div>
								<label class="control-label" for="inputEmail">Địa chỉ
									email</label>
								<div class="controls">
									<form:input class="span3" type="text" maxlength="100"
										placeholder="Điền địa chỉ email" path="email_address" />
								</div>
							</div>
							<div class="controls">
								<button type="submit" class="btn block">ĐĂNG KÝ</button>
							</div>
						</form:form>
					</div>
				</div>

				<!-- ĐĂNG NHẬP -->
				<div class="span1">&nbsp;</div>
				<div class="span4">
					<div class="well">
						<h5>ĐĂNG NHẬP</h5>
						<c:if test="${statusLogin==true}"><h3 style="color: green;">${statusLogin}</h3></c:if>
						<c:if test="${statusLogin!=true}"><h3 style="color: green;">${statusLogin}</h3></c:if>
						<form:form method="POST" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputEmail">tên tài
									khoản</label>
								<div class="controls">
									<form:input class="span3" type="text" maxlength="100"
										placeholder="Điền tên tài khoản" path="account" />
								</div>
								<label class="control-label" for="inputEmail">Mật khẩu</label>
								<div class="controls">
									<form:input class="span3" type="password" maxlength="100"
										placeholder="Nhập mật khẩu" path="password" />
								</div>

							</div>
							<div class="control-group">
								<div class="controls">
									<button type="submit" class="defaultBtn">ĐĂNG NHẬP</button>
									<a href="#">QUÊN MẬT KHẨU?</a>
								</div>
							</div>
						</form:form>

					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>