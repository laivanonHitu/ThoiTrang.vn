<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>Sửa thông tin</title>

<meta name="description" content="overview &amp; stats" />

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<link rel="stylesheet"
	href="<c:url value="/assets/resAdmin/css/bootstrap.min.css" />" />
<c:url
	value="/assets/resAdmin/font-awesome/4.2.0/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="<c:url value="/assets/resAdmin/font-awesome/4.2.0/css/font-awesome.min.css" />" />

<link rel="stylesheet"
	href="<c:url value="/assets/resAdmin/fonts/fonts.googleapis.com.css"/>" />

<link rel="stylesheet"
	href="<c:url value="/assets/resAdmin/css/ace.min.css" />"
	class="ace-main-stylesheet" id="main-ace-style" />

<script src="<c:url value="/assets/resAdmin/js/ace-extra.min.js" />"></script>


</head>
<body>
	<c:forEach items="${product}" var="items">
		<h1>Thông tin sản phẩm cần sửa</h1>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Mã sản phẩm</th>
					<th scope="col">Tên</th>
					<th scope="col">Giá</th>
					<th scope="col">Ảnh</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">${items.id_product}</th>
					<td>${items.name}</td>
					<td><fmt:formatNumber type="number" groupingUsed="true"
							value="${ items.price }" />₫</td>
					<td><img src="<c:url value="/assets/user/img/${items.img}"/>"
						alt="payment method paypal" height="50"></td>
				</tr>

			</tbody>
		</table>
	</c:forEach>
	<form action="" method="POST">
		<!-- <div class="form-group">
			<label for="exampleFormControlSelect1">Danh mục sản phẩm</label> <select
				class="form-control" id="exampleFormControlSelect1">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
			</select>
		</div> -->

		<div class="form-group">
			<label for="exampleInputEmail1">Tên sản phẩm</label>
			 <input type="text" class="form-control" name ="editName">
		</div>

		<div class="form-group">
			<label for="exampleInputPassword1">Giá sản phẩm</label> 
			 <input type="text" class="form-control" name ="editPrice" min="0" max="100000000" value="${product.getPrice()}">
		</div>

		<div class="m-5 input-group mb-3 bg-success">
			<div class="custom-file">
				<h3 class="input-group-text">Cập nhật ảnh</h3> <input
					type="file" class="custom-file-input" id="inputGroupFile01">
				<label class="custom-file-label" for="inputGroupFile01"></label>
			</div>
		</div>
		<button type="submit" class=" mt-5 btn btn-primary">Cập nhật</button>
	</form>
</body>
</html>