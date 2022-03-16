<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2> Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>

    Name <from:input path="name"/>
    <br>
    Surname <from:input path="surname"/>
    <br>
    Department <from:input path="department"/>
    <br>
    Salary <from:input path="salary"/>
    <br>
    <input type="submit" value="OK">

</form:form>
</body>
</html>
