<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đơn đặt hàng</title>
</head>
<body>
	<h1>Đơn đặt hàng</h1>
	<hr />
	<div class="row">
		<h3>ĐƠN HÀNG MỚI</h3>
		<div class="widget-box transparent">
			<div class="widget-header widget-header-flat"></div>

			<div class="widget-body">

				<div class="widget-main no-padding">
					<div>
						<a href='<c:url value="/admin/add-product"/>'><button type="button" class="btn btn-primary">Thêm sản phẩm</button></a>
						<a href="edit-product"><button type="button" class="btn btn-success">Sửa sản phẩm</button></a>
					</div>
					<table class="table table-bordered table-striped text-center">
						<thead class="thin-border-bottom ">
							<tr>
								<th>STT</th>
								<th>Mã sản phẩm</th>
								<th>Tên sản phẩm</th>
								<th>Hình ảnh</th>
								<th>Giá SP</th>
								<th>Sửa</th>
								<th>Xoá</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach items="${product}" var="items" varStatus="loop">
								<tr>
									<td>${loop.index+1}</td>
									<td>${items.id_product}</td>
									<td>${items.name}</td>
									<td><img
										src="<c:url value="/assets/user/img/${items.img}"/>"
										alt="payment method paypal" height="50"></td>
									<td><fmt:formatNumber
													type="number" groupingUsed="true" value="${ items.price }" />₫</td>
									<td><a href="<c:url value="/admin/edit-product/${items.id_product }"/>"><i class="fa fa-edit"
											style="height: 100"></i></a></td>
											
									<td><a href="<c:url value="/admin/delete/${items.id_product}"/>"><i class="fa fa-trash"
											style="height: 100"></i></a></td>

								</tr>
							</c:forEach>

						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>
</body>
</html>
