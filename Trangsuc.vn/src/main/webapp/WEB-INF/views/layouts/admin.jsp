<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>

<c:url value="" />
<!DOCTYPE html>
<html lang="en">


	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Trang quản trị - Admin</title>

		<meta name="description" content="overview &amp; stats" />
		
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<link rel="stylesheet" href="<c:url value="/assets/resAdmin/css/bootstrap.min.css" />" />
		<c:url value="/assets/resAdmin/font-awesome/4.2.0/css/font-awesome.min.css" />
		<link rel="stylesheet" href="<c:url value="/assets/resAdmin/font-awesome/4.2.0/css/font-awesome.min.css" />" />

		<link rel="stylesheet" href="<c:url value="/assets/resAdmin/fonts/fonts.googleapis.com.css"/>"/>

		<link rel="stylesheet" href="<c:url value="/assets/resAdmin/css/ace.min.css" />" class="ace-main-stylesheet" id="main-ace-style" />

		<script src="<c:url value="/assets/resAdmin/js/ace-extra.min.js" />"></script>


	 </head>
<body class="no-skin">
	
	<%@include file="/WEB-INF/views/layouts/admin/header.jsp" %>
		<div class="main-container" id="main-container">
		
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
			
			<%@include file="/WEB-INF/views/layouts/admin/sidebar.jsp" %>
			
			<div class="main-content">
					<decorator:body/>
			</div>
			
			<%@include file="/WEB-INF/views/layouts/admin/footer.jsp" %>
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div>
		

</body>
</html>