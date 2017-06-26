<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style>
	label{width:100px; float:left;}
</style>
</head>
<body>
	<div class="container">
		<fieldset>
			<legend>비만도 테스트 결과</legend>
				<label for="">이름 :</label>
				${myInfo.name }
			<p>
				<label for="">키 :</label>
				${myInfo.height}
			</p>
			<p>
				<label for="">몸무게 :</label>
				${myInfo.weight}
			</p>
			<p>
				<label for="">취미1 :</label>
				${myInfo.hobbies.get(0)}
			</p>
			<p>
				<label for="">취미2 :</label>
				${myInfo.hobbies.get(1)}
			</p>
			<p>
				<label for="">취미3 :</label>
				${myInfo.hobbies.get(2)}
			</p>
			<p>
				<label for="">비만도 :</label>
				${bmiResult }
			</p>
		</fieldset>
	</div>
</body>
</html>