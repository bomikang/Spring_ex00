<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style>
	
</style>
</head>
<body>
	<div class="container">
		<form action="bmi" method="post" role="form" class="form-horizontal">
			<fieldset>
				<legend>비만도 테스트 결과</legend>
				<div class="form-group">
					<label class="col-sm-2 control-label" >이름 :</label>
					<div class="col-sm-10">
						<input type="text" name="name" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">키 :</label>
					<div class="col-sm-10">
						<input type="text" name="height" class="form-control"/>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">몸무게 :</label>
					<div class="col-sm-10">
						<input type="text" name="weight" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">취미1 :</label>
					<div class="col-sm-10">
						<input type="text" name="hobbies" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">취미2 :</label>
					<div class="col-sm-10">
						<input type="text" name="hobbies" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">취미3 :</label>
					<div class="col-sm-10">
						<input type="text" name="hobbies" class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">계산</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>