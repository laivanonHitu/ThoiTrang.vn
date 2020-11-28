<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div id="sidebar" class="span3">
	<p>${ productPaginateById.size() }</p>
	<div class="well well-small">
		<ul class="nav nav-list">

			<c:forEach var="item" items="${ categorys }">
				<li><a href="<c:url value="san-pham/${item.id}"/>"><span
						class="icon-circle-blank"></span> ${ item.category_name }</a></li>
				<li>
			</c:forEach>

			<li><a class="totalInCart" href="cart.html"><strong>Đã
						mua <span class="badge badge-warning pull-right"
						style="line-height: 18px;"><fmt:formatNumber
								type="number" groupingUsed="true" value="${TotalPrice}" />₫</span>
				</strong></a></li>
		</ul>
	</div>

	<div class="well well-small alert alert-warning cntr">
		<h2>50% Discount</h2>
		<p>
			only valid for online order. <br> <br> <a
				class="defaultBtn" href="#">Click here </a>
		</p>
	</div>
	<div class="well well-small">
		<a href="#"><img
			src="<c:url value="/assets/user/img/paypal.jpg"/>"
			alt="payment method paypal"></a>
	</div>

	<a class="shopBtn btn-block" href="#">Upcoming products <br> <small>Click
			to view</small></a> <br> <br>
	<ul class="nav nav-list promowrapper">

		<c:forEach items="${Banner}" var="items">
			<li>

				<div class="thumbnail">
					<a class="zoomTool" href="<c:url value="/details-product/${ items.id_product }"/>" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="<c:url value="/assets/user/img/${items.img}"/>"
						alt="bootstrap template">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="product_details.html">VIEW</a> <span
								class="pull-right"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ items.price }" />₫</span>
						</h4>
					</div>
				</div>

			</li>
		</c:forEach>
	</ul>

</div>