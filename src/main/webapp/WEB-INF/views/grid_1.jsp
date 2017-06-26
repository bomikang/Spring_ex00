<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style>
	.row div{padding: 10px; border:1px solid black; }
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
		</div>
		<div class="row">
			<div class="col-md-6">.col-md-6</div>
			<div class="col-md-6">.col-md-6</div>
		</div>
		<div class="row">
			<div class="col-md-4">.col-md-4</div>
			<div class="col-md-4">.col-md-4</div>
			<div class="col-md-4">.col-md-4</div>
		</div>
		<div class="row">
			<div class="col-md-8">.col-md-8</div>
			<div class="col-md-4">.col-md-4</div>
		</div>
		<br /><br /><br /><br />
		<table class="table table-hover">
			<tr>
				<td>#</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Username</td>
			</tr>
			<tr>
				<td>1</td>
				<td>Mark</td>
				<td>Otto</td>
				<td>@mdo</td>
			</tr>
			<tr>
				<td>2</td>
				<td>Jacob</td>
				<td>Thornton</td>
				<td>@fat</td>
			</tr>
			<tr>
				<td>3</td>
				<td colspan="2">Larry the Bird</td>
				<td>@twitter</td>
			</tr>
		</table>
		<br /><br /><br /><br />
		<form action="" role="form">
			<div class="form-group">
				<label for="">이름</label>
				<input type="text" name="name" class="form-control" placeholder="이름"/>
			</div>
			<div class="form-group">
				<label for="">비밀번호</label>
				<input type="text" name="password" class="form-control" placeholder="비밀번호"/>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-default">확인</button>
			</div>
		</form>
	</div>
</body>
</html>