<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Spring Login Example </title>
</head>
<body>
<div th:if="${param.error}">
    Invalid username and password.
</div>
<div th:if="${param.logout}">
    You have been logged out.
</div>
<form:form action="login"  method="post" modelAttribute="user">
    <div><label> User Name : <input type="text" name="uname"/> </label></div>
    <div><label> Password: <input type="password" name="pwd"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form:form>
</body>
</html>