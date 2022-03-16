<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>Dear Employee, please enter your details</h2>
<br><br>
<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>

    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
</form:select>
    <br>
    Which car do you want?
    <br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--    BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    MB<form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
<%--    AUDI<form:radiobutton path="carBrand" value="AUDI"/>--%>
    <br>
    Foreign language(s)?
    <br>
    <form:checkboxes path="languages" items="${employee.languageMap}"/>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    GE <form:checkbox path="languages" value="Germany"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
