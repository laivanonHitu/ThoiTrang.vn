<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/common/taglib.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh mục sản phẩm</title>
<style>
.pagination {
	display: inline-block;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
</head>
<body>
	<div class="row">
		<div>
			<label>sắp xếp theo</label> <select id="sort">
				<option value="volvo"><a>Giá từ thấp đến cao</option>
				<option value="saab">Từ A đến Z</option>
			</select>
		</div>


		<p>${PaginatesInfo.curentPage}||${PaginatesInfo.start}||
			${PaginatesInfo.end}</p>

		<div class="well well-small">
			<h3>Sản phẩm mới</h3>

			<c:if test="${ productPaginateById.size() > 0 }">
				<div class="row-fluid">
					<ul class="thumbnails">

						<c:forEach var="items" items="${productPaginateById}" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a href="product_details.html" class="overlay"></a> <a
										class="zoomTool" href="product_details.html"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="product_details.html"><img
										src="<c:url value="/assets/user/img/${items.img }"/>" alt=""></a>
									<div class="caption cntr">
										<p>${items.name }</p>
										<p>
											<strong><fmt:formatNumber type="number"
													groupingUsed="true" value="${ items.price }" />₫</strong>
										</p>
										<h4>
											<a class="shopBtn" href="#" title="add to cart"> Add to
												cart </a>
										</h4>
										<div class="actionList">
											<a class="pull-left" href="#">Add to Wish List </a> <a
												class="pull-left" href="#"> Add to Compare </a>
										</div>
										<br class="clr">
									</div>
								</div>
							</li>

							<c:if
								test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == productPaginateById.size() }">
					</ul>
					<c:if test="${ (loop.index + 1) < productPaginateById.size() }">
						<div class="row-fluid">
							<ul class="thumbnails">
					</c:if>
			</c:if>

			</c:forEach>

			</c:if>

		</div>

		<%-- ${PaginatesInfo.curentPage} || ${PaginatesInfo.start} || ${PaginatesInfo.end} --%>

		<div class="pagination">
			<c:forEach begin="1" end="${PaginatesInfo.totalPage}" varStatus="loop">

				<c:if test="${ (loop.index) == PaginatesInfo.curentPage }">
					<a class="active" href="<c:url value="/san-pham/${id}/${loop.index}"/>">${loop.index}</a>
				</c:if>
				<c:if test="${ (loop.index) != PaginatesInfo.curentPage  }">
					<a href="<c:url value="/san-pham/${id}/${loop.index}"/>">${loop.index}</a>
				</c:if>
			</c:forEach>
		</div>
	</div>

</body>
</html>