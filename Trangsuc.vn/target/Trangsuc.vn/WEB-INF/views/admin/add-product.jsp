<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="utf-8">
<title>A Simple Page with CKEditor 4</title>
<!-- Make sure the path to CKEditor is correct. -->
<%--  <c:url value="assets/resAdmin/ckeditor"/> --%>
<script src="../ckeditor.js"></script>
</head>
<body>
	<form method="POST" action="">
		<div class="form-group">


			<div class="custom-file">
				<label class="custom-file-label" for="customFile">Chọn file
					ảnh</label> <input type="file" class="custom-file-input btn btn-success"
					id="customFile">
			</div>
			
			<label>Tên sản phẩm</label>
			<input class="form-control" type="text" placeholder="Nhập tên sản phẩm" />
			
			<label>Giá sản phẩm</label>
			<input class="form-control" type="number" value="0" max="100000000" maxlength="10"/>
			
			<label>Mô tả ngắn</label>
			<textarea name="editor1" id="editor1" rows="5" cols="180"></textarea>
			
			<label>Mô tả chi tiết</label>
			<textarea name="decripton" id="editor1" rows="5" cols="180"></textarea>
			<button type="submit" class="btn btn-primary">Thêm sản phẩm</button>

		</div>
	</form>
	<script>
		CKEDITOR.replace('editor1');
	</script>

	<script src="<c:url value ="/assets/resAdmin/ckeditor/ckeditor.js"/>">
		
	</script>
	<script>
		CKEDITOR.replace('decripton');
	</script>

	<script type="text/javascript">
		CKEDITOR.editorConfig = function(config) {
			config.language = 'es';
			config.uiColor = '#F7B42C';
			config.height = 300;
			config.toolbarCanCollapse = true;
		};
	</script>
</body>
</html>