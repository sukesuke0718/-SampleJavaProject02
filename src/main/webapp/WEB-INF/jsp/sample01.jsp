<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width">
	<meta charset="ja">
	<title>計算</title>
</head>
<body>
	<h1>計算するよ</h1>
	
	<form method="POST" action="Sample01Servlet">
		<input type="text" name="num1" size="4" maxlength="2"> + 
		<input type="text" name="num2" size="4" maxlength="2">
		<input type="submit" value=" = ">
	</form>
	
	<p>計算結果：<%= request.getAttribute( "resultNum" ) %></p>
	
</body>
</html>