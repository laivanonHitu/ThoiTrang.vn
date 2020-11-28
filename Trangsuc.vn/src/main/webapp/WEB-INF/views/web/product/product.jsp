<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<title>Sản - phẩm</title>
<meta charset="UTF-8" />
</head>
<body>

	<div class="row">
		<%@include file="/WEB-INF/views/layouts/web/category.jsp" %>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/home" />">Trang chủ</a> <span
					class="divider">/</span></li>
				<li><a href="<c:url value="/tat-ca-san-pham"/>">Sản phẩm</a> <span class="divider">/</span></li>
				<li class="<c:url value="/product/product_details" />">Chi tiết sản phẩm</li>
			</ul>
			<div class="row-fluid">

				<c:if test="${ all_product.size() > 0 }">
					<ul class="thumbnails">

						<c:forEach var="item" items="${ all_product }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="#" title="add to cart"><span
										class="icon-search"></span> QUICK VIEW</a> <a
										href="<c:url value="/details-product/${ item.id_product }"/>"><img
										src="<c:url value="/assets/user/img/${ item.img }"/>" alt=""></a>
									<div class="caption">
										<h5>${ item.name }</h5>
										<h4>
											<a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="#" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ item.price }" />₫</span>
										</h4>
									</div>
								</div>
							</li>

							<c:if
								test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == all_product.size() }">
					</ul>
					<c:if test="${ (loop.index + 1) < all_product.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>

				</c:forEach>

				</c:if>

			</div>
		</div>
	</div>
</body>