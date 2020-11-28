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
	<form>
		<div class="form-group">
			<label>Thển loại</label>
			<textarea name="editor1" id="editor1" rows="5" cols="180">
                This is my textarea to be replaced with CKEditor 4.
            </textarea>
		</div>
		<div class="form-group">
			<label>Tiêu đề</label>
			<textarea name="editor1" id="editor1" rows="5" cols="180">
                This is my textarea to be replaced with CKEditor 4.
            </textarea>
		</div>
		
		<div class="Hình đại diện">
			<label>Tiêu đề</label>
			<textarea name="editor1" id="editor1" rows="5" cols="180">
                This is my textarea to be replaced with CKEditor 4.
            </textarea>
		</div>
		
		<div class="Mô tả dài">
			<label>Tiêu đề</label>
			<textarea name="editor1" id="editor1" rows="5" cols="180">
                This is my textarea to be replaced with CKEditor 4.
            </textarea>
		</div>
		
		<div class="Nội dung">
			<label>Tiêu đề</label>
			<textarea name="editor1" id="editor1" rows="5" cols="180">
                This is my textarea to be replaced with CKEditor 4.
            </textarea>
		</div>
		
		<button type="submit" class="btn btn-primary">Cập nhật</button>
		
	</form>
	<script>
		// Replace the <textarea id="editor1"> with a CKEditor 4
		// instance, using default configuration.
		CKEDITOR.replace('editor1');
	</script>
</body>
</html>