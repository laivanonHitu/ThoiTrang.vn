<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>
					Thanh toán <small class="pull-right"> ${TotalCart} sản phẩm
						đang có trong giỏ hàng </small>
				</h1>
				<hr class="soften" />
				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Hình ảnh</th>
							<th>Tên sản phẩm</th>
							<th>Mô tả</th>
							<th>Xóa</th>
							<th>Sửa</th>
							<th>Đơn giá</th>
							<th>Tổng tiền</th>
						</tr>
					</thead>

					<c:forEach items="${Cart}" var="items">
						<tbody>
							<tr>
								<td><img width="100" src="assets/user/img/${items.value.productDTO.img}" alt=""></td>
								<td>Items name here<br>Carate : 22<br>Model : n/a
								</td>
								<td>${items.value.productDTO.name}</td>
								<td>
								<%-- --%>
									<a href="<c:url value="delete/${items.value.productDTO.id_product}"/>" class="btn btn-mini btn-danger" >
										<span class="icon-remove"></span>
									</a>
								</td>

								<td><input class="span1" style="max-width: 34px"
									placeholder="1" id="appendedInputButtons" size="16"
									type="number" value="#" min="1" max="1000">
									<div class="input-append"></div></td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${ items.value.totalPrice }" />₫</td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${ items.value.totalPrice }" />₫</td>
							</tr>

						</tbody>
					</c:forEach>
				</table>
				<br />


				<table class="table table-bordered">
					<tbody>
						<tr>
							<td>
								<form class="form-inline">
									<label style="min-width: 159px"> VOUCHERS Code: </label> <input
										type="text" class="input-medium" placeholder="CODE">
									<button type="submit" class="shopBtn">ADD</button>
								</form>
							</td>
						</tr>

					</tbody>
				</table>

				<a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
</body>
</html>