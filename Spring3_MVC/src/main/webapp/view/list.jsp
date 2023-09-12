<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>입력한 ID, 비밀번호 출력</title>
	<link href="css/list.css" rel="stylesheet">
</head>
<body>
	<table border=1>
	<tr>
		<th>ID</th>
		<td>${bkey.id}</td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td>${bkey.pass}</td>
	</tr>
	</table>
</body>
</html>