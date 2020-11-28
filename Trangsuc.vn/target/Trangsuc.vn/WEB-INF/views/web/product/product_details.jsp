<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--
Lower Header Section 
-->
	<div class="container">


		<!--
Navigation Bar Section 
-->
<h1>${Cart.size()}</h1>

		<!-- Body Section -->
		<div class="row">
			<%@include file="/WEB-INF/views/layouts/web/category.jsp"%>
			<div class="span9">
				<ul class="breadcrumb">

					<li><a href="<c:url value="/home"/>">Trang chủ</a> <span
						class="divider">/</span></li>
					<li><a href="<c:url value="/tat-ca-san-pham"/>">Sản phẩm</a> <span
						class="divider">/</span></li>
					<li class="active">Chi tiết sản phẩm</li>
				</ul>
				<div class="well well-small">

					<div class="row-fluid">
						<div class="span5">
							<div id="myCarousel" class="carousel slide cntr">
								<div class="carousel-inner">
									<div class="item active">
										<a href="#"> <img
											src="<c:url value="/assets/user/img/${product.img }"/>"
											alt="" style="width: 100%"></a>
									</div>

								</div>
								<a class="left carousel-control" href="#myCarousel"
									data-slide="prev">‹</a> <a class="right carousel-control"
									href="#myCarousel" data-slide="next">›</a>
							</div>
						</div>
						<div class="span7">
							<h3>${product.name}</h3>
							<hr class="soft" />

							<form class="form-horizontal qtyFrm" method="get" ="<c:url value="/AddCart/${product.id_product}"/>">
								<div class="control-group">
									<label class="control-label"><span><fmt:formatNumber
												type="number" groupingUsed="true" value="${ product.price }" />₫</span></label>
									<div class="controls">
										<input type="number" class="span6" placeholder="Số lượng" min="0">
									</div>
								</div>

								<div class="control-group">
									<label class="control-label"><span>Vàng</span></label>
									<div class="controls">
										<select class="span11">
											<option>${product.name_color}</option>

										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label"><span>Materials</span></label>
									<div class="controls">
										<select class="span11">
											<option>Material 1</option>

										</select>
									</div>
								</div>
								<h4>100 items in stock</h4>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. Nowadays the lingerie industry is
									one of ...
								<p>
									<button type="submit" class="shopBtn">
										<span class=" icon-shopping-cart"></span> Thêm sản phẩm
									</button>
							</form>
						</div>
					</div>
					<hr class="softn clr" />


					<ul id="productDetail" class="nav nav-tabs">
						<li class="active"><a href="#home" data-toggle="tab">Chi
								tiết sản phẩm </a></li>
						<li class=""><a href="#profile" data-toggle="tab">Sản
								phẩm liên quan </a></li>

					</ul>
					<div id="myTabContent" class="tab-content tabWrapper">
						<div class="tab-pane fade active in" id="home">
							<h4>Product Information</h4>
							<table class="table table-striped">
								<tbody>
									<tr class="techSpecRow">
										<td class="techSpecTD1">Màu: ${ product.name_color }</td>
									</tr>
									<tr class="techSpecRow">
										<td class="techSpecTD1">Size: ${ product.sizes }</td>
									</tr>
									<tr class="techSpecRow">
										<td class="techSpecTD1">Season:</td>
									</tr>
									<tr class="techSpecRow">
										<td class="techSpecTD1">Usage:</td>
									</tr>
									<tr class="techSpecRow">
										<td class="techSpecTD1">Sport:</td>
									</tr>
									<tr class="techSpecRow">
										<td class="techSpecTD1">Brand:</td>
									</tr>
								</tbody>
							</table>
							<p>${ product.details }</p>

						</div>

						<div class="tab-pane fade" id="profile">
							<c:forEach var="items" items="${ProductByIdCategory}">
								<div class="row-fluid">
									<div class="span2">
										<img src="<c:url value="/assets/user/img/${items.img }"/>" alt="">
									</div>
									<div class="span6">
										<h5>${items.name}</h5>
										<p>${items.details}</p>
									</div>
									<div class="span4 alignR">
										<form class="form-horizontal qtyFrm">
											<h3><fmt:formatNumber
												type="number" groupingUsed="true" value="${ items.price }" />₫</h3>
											<label class="checkbox"> <input type="checkbox">
												Adds product to compair
											</label><br>
											<div class="btn-group">
												<a href="product_details.html" class="defaultBtn"><span
													class=" icon-shopping-cart"></span> Add to cart</a> <a
													href="product_details.html" class="shopBtn">VIEW</a>
											</div>
										</form>
									</div>
								<hr class="soften" />
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>