<%--
  Created by IntelliJ IDEA.
  User: guan_x
  Date: 2016/3/17
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form action="${pageContext.request.contextPath}/addStudent.do" method="post">

    <table>
        <tr>
            <td>name</td>
            <td><input name="name"></td>
        </tr>
         <tr>
            <td>age</td>
            <td><input name="age"></td>
        </tr>
         <tr>
            <td>id</td>
            <td><input name="id"></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form>
<%--<form:form method="POST" action="${pageContext.request.contextPath}/addStudent.do">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><form:label path="name">Name</form:label></td>--%>
            <%--<td><form:input path="name" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="age">Age</form:label></td>--%>
            <%--<td><form:input path="age" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="id">id</form:label></td>--%>
            <%--<td><form:input path="id" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td colspan="2">--%>
                <%--<input type="submit" value="Submit"/>--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
</body>
</html>