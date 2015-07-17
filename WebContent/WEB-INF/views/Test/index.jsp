<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><strong>This is a Testing page</strong></p>
<style type="text/css" >
label { width: 150px; font-weight:bold; display:block}
</style>
<form action="testsave" method="post">
<label>First Name</label><input type="text" name="firstName" /><br>
<label>Last Name</label><input type="text" name="LastName" /><br>
<label>Email</label><input type="text" name="email" /><br>
<label>Password</label><input type="password" name="password" /><br>
<label>Role</label><input type="text" name="role" /><br>
<input type="submit" value="Submit"/><br>
</form>

</body>
</html>