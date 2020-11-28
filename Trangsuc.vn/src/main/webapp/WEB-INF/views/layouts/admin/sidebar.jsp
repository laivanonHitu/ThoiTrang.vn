<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div id="sidebar" class="sidebar responsive">
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
				</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="ace-icon fa fa-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="ace-icon fa fa-pencil"></i>
						</button>

						<button class="btn btn-warning">
							<i class="ace-icon fa fa-users"></i>
						</button>

						<button class="btn btn-danger">
							<i class="ace-icon fa fa-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span>

						<span class="btn btn-info"></span>

						<span class="btn btn-warning"></span>

						<span class="btn btn-danger"></span>
					</div>
				</div><!-- /.sidebar-shortcuts -->

				<ul class="nav nav-list">
					<li class="active">
						<a href="<c:url value="/admin/"/>">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> Bảng điều khiển </span>
						</a>

						<b class="arrow"></b>
					</li>
					
					<li class="">
						<a href='<c:url value="/admin/category"/>' class="dropdown-toggle">
							<i class="menu-icon fa fa-list"></i>
							<span class="menu-text"> Danh mục mặt hàng </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
					</li>
					
					<li class="">
						<a href="<c:url value="/admin/product"/>" class="dropdown-toggle">
							<i class="menu-icon fa fa-cube"></i>
							<span class="menu-text"> Sản phẩm </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

					
					</li>
			
					
					
					<li class="">
						<a href="<c:url value="/admin/oder"/>" class="dropdown-toggle">
						
							<i class="menu-icon fa fa-shopping-cart"></i>
							<span class="menu-text"> Đơn đặt hàng </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
					</li>
			
					<li class="">
					
						<a href="<c:url value="/admin/coupon"/>" class="dropdown-toggle">
							<i class="menu-icon fa fa-gift"></i>
							<span class="menu-text"> Giảm giá </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
					</li>
					
					<li class="">
					
						<a href="<c:url value="/admin/CKeditor"/>" class="dropdown-toggle">
							<i class="menu-icon fa fa-credit-card"></i>
							<span class="menu-text"> Bài viết </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>
					</li>
				</ul><!-- /.nav-list -->

				
			</div>

			