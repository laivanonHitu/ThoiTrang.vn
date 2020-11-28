<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="main-content-inner">
		<div class="breadcrumbs" id="breadcrumbs">
			<script type="text/javascript">
				try {
					ace.settings.check('breadcrumbs', 'fixed')
				} catch (e) {
				}
			</script>

			<ul class="breadcrumb">
				<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
				</li>
				<li class="active">Bảng điều khiển</li>
			</ul>
			<!-- /.breadcrumb -->

			<div class="nav-search" id="nav-search">
				<form class="form-search">
					<span class="input-icon"> <input type="text"
						placeholder="Search ..." class="nav-search-input"
						id="nav-search-input" autocomplete="off" /> <i
						class="ace-icon fa fa-search nav-search-icon"></i>
					</span>
				</form>
			</div>
			<!-- /.nav-search -->
		</div>

		<div class="page-content pl-2">
			<div class="ace-settings-container" id="ace-settings-container">
				<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
					id="ace-settings-btn">
					<i class="ace-icon fa fa-cog bigger-130"></i>
				</div>

				<div class="ace-settings-box clearfix" id="ace-settings-box">
					<div class="pull-left width-50">
						<div class="ace-settings-item">
							<div class="pull-left">
								<select id="skin-colorpicker" class="hide">
									<option data-skin="no-skin" value="#438EB9">#438EB9</option>
									<option data-skin="skin-1" value="#222A2D">#222A2D</option>
									<option data-skin="skin-2" value="#C6487E">#C6487E</option>
									<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
								</select>
							</div>
							<span>&nbsp; Choose Skin</span>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-navbar" /> <label class="lbl"
								for="ace-settings-navbar"> Fixed Navbar</label>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-sidebar" /> <label class="lbl"
								for="ace-settings-sidebar"> Fixed Sidebar</label>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-breadcrumbs" /> <label class="lbl"
								for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-rtl" /> <label class="lbl"
								for="ace-settings-rtl"> Right To Left (rtl)</label>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-add-container" /> <label class="lbl"
								for="ace-settings-add-container"> Inside <b>.container</b>
							</label>
						</div>
					</div>
					<!-- /.pull-left -->

					<div class="pull-left width-50">
						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-hover" /> <label class="lbl"
								for="ace-settings-hover"> Submenu on Hover</label>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-compact" /> <label class="lbl"
								for="ace-settings-compact"> Compact Sidebar</label>
						</div>

						<div class="ace-settings-item">
							<input type="checkbox" class="ace ace-checkbox-2"
								id="ace-settings-highlight" /> <label class="lbl"
								for="ace-settings-highlight"> Alt. Active Item</label>
						</div>
					</div>
					<!-- /.pull-left -->
				</div>
				<!-- /.ace-settings-box -->
			</div>
			<!-- /.ace-settings-container -->

			<div class="page-header">
				<h1>
					Bảng điều khiển <small> <i
						class="ace-icon fa fa-angle-double-right"></i> Danh sách đơn hàng
						&amp; Đơn hàng mới
					</small>
				</h1>
			</div>
			<!-- /.page-header -->

			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<div class="alert alert-block alert-success">
						<button type="button" class="close" data-dismiss="alert">
							<i class="ace-icon fa fa-times"></i>
						</button>

						<i class="ace-icon fa fa-check green"></i> Chào mừng đến với <strong
							class="green"> trang Quản trị viên </strong>, click vào <a
							target="_blank" href="<c:url value="/home"/>">đây</a> để tới
						trang web bán hàng
					</div>

					<div class="row">
						<div class="space-6"></div>

						<div class="col-sm-4 infobox-container">

							<div class="col-sm-4">
								<div class="widget-box"></div>
								<!-- /.widget-box -->
							</div>
							<!-- /.col -->
						</div>
						<!-- /.row -->

						<div class="hr hr32 hr-dotted"></div>

						
						
						<div class="row">
							<h3> THÔNG TIN ĐẶT HÀNG</h3>
							<div class="widget-box transparent">
								<div class="widget-header widget-header-flat"></div>

								<div class="widget-body">

									<div class="widget-main no-padding">
										<table class="table table-bordered table-striped text-center">
											<thead class="thin-border-bottom ">
												<tr>
													<th>STT</th>
													<th>Tên sản phẩm</th>
													<th>Hình ảnh</th>
													<th>Giá SP</th>
													<th>Đã bán</th>
													<th>Từ khoá</th>
													<th>Thời gian</th>
													<th>id khách hàng</th>
													<th>Xoá</th>
												</tr>
											</thead>

											<tbody>
												<tr>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
												</tr>

											</tbody>
										</table>

									</div>
								</div>
							</div>
						</div>
						<hr/>
						<div class="row">
							<h3>Danh sách đã bán</h3>
							<div class="widget-box transparent">
								<div class="widget-header widget-header-flat"></div>

								<div class="widget-body">

									<div class="widget-main no-padding">
										<table class="table table-bordered table-striped text-center">
											<thead class="thin-border-bottom ">
												<tr>
													<th>STT</th>
													<th>Tên sản phẩm</th>
													<th>Hình ảnh</th>
													<th>Giá SP</th>
													<th>Đã bán</th>
													<th>Từ khoá</th>
													<th>Thời gian</th>
													
												</tr>
											</thead>

											<tbody>
												<tr>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													<td>1</td>
													
												</tr>

											</tbody>
										</table>

									</div>
								</div>
							</div>
						</div>
						<div class="hr hr32 hr-dotted"></div>


					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.page-content -->
		</div>
	</div>
</body>
</html>