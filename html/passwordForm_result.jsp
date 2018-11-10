
<<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>注册成功</title>
</head>
<body>
	< % 
	     String username = request.getParameter("account");
	     String password = request.getParameter("pwd");
	     out.println("账号为: " + username);
	     out.println("密码为: " + password);
	% >
</body>
</html>