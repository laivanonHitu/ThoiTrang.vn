<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div class="box">
<h1>${products.size()}</h1>
	<div class="box-heading">Sản phẩm nổi bật</div>
	<div class="box-content">
		<div class="box-product">
		
			<c:forEach items="${products}" var="items" >
				<div>
					<div class="image">
						<a href="<c:url value="chi-tiet-san-pham/${items.getId()}"/>"><img
							src="assets/web/image/product/${items.getImage()}"
							alt="Fancy Saddle" /></a>
					</div>
					<div class="name">
						<a href="/chi-tiet-san-pham/${items.getId()}"></a>
					</div>
					<div class="name-product">${items.getName_product() }</div>
					<div class="price">${items.getPrice() }</div>
					<div class="rating">
						<img src="assets/web/image/stars-2.png" alt="Based on 0 reviews." />
					</div>
					<div class="cart">
						<input type="button" value="Add to Cart"
							onClick="addToCart('43');" class="button" />
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>