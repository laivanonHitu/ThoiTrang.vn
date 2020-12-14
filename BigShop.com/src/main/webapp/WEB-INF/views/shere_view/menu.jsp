<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div id="menu">
	<span>Menu</span>
	<ul>

		<li class="home"><a title="Home" href="home"><span>Home</span></a></li>
		<c:forEach items="${menu}" var="list" varStatus="index">
		
			<li>
				<c:if test="${list.getId() == 1}">
					<a href="<c:url value="/home"/>">${list.getMenu_name() }</a> 
				</c:if>
				<c:if test="${list.getId() != 1}">
					<a href="a">${list.getMenu_name() }</a> 
					<!-- <div>
							<ul>
								<li><a href="category.html">Cameras</a></li>
								<li><a href="category.html">Phones</a></li>
								<li><a href="category.html">Tablets</a></li>
							</ul>
						</div> -->
				</c:if>
				
			</li>
			
		</c:forEach>
	</ul>
</div>