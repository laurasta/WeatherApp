<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Styles/style.css" />

<%--<a href="/register">Navigate to registration</a>--%>
<%--<a href="/login">Navigate to login</a>--%>

<%--<div align=center>--%>
<%--    <h1>User Login</hl>--%>
<%--</div>--%>
<%--<form name="loginForm" action=loginServlet method=post>--%>
<%--    <table>--%>
<%--        <tr><td>Enter Name:</td><td><input type=text name=username></td></tr>--%>
<%--        <tr><td>Enter Password:</td><td><input type=password name=password></td></tr>--%>
<%--        <tr><td><input type=submit value=Login></td><td><input type=reset></td></tr>--%>
<%--    </table>--%>
<%--</form>--%>


<%--Login form--%>
<div class="login">
    <div class="login-screen">
        <div class="app-title">
            <h1>Login</h1>
        </div>
<form method="post" action="loginServlet">
        <div class="login-form">
            <div class="control-group">
                <input type="text" name=username class="login-field" value="" placeholder="username" id="login-name">
                <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="control-group">
                <input type="password" name=password class="login-field" value="" placeholder="password" id="login-pass">
                <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

<%--            <a class="btn btn-primary btn-large btn-block" href="#">login</a>--%>
            <input class="btn btn-primary btn-large btn-block" type="submit" value="Done" />
            <a class="login-link" href="#">Want to register?</a>
        </div>
</form>
    </div>
</div>

<%--Choice form--%>
<br/>
<br/>
<div class="login">
<div class="login-screen">
    <div class="app-title">
        <h1>Filters</h1>
    </div>
<center>
<form name="choiceForm" method="post" action="choiceServlet">
    Wind speed unit:
    <select name="windSpeed_unit" >
        <option value="km/h">Km/h</option>
        <option value="m/s">m/s</option>
        <option value="mph">Mph</option>
        <option value="knots">Knots</option>
    </select><br/><br/>

    <input type="text" name="latitude" class="login-field" placeholder="latitude"/><br/><br/>
    <input type="text" name="longitude" class="login-field" value="" placeholder="longitude"/><br/><br/>
    <input type="text" name="startDate" class="login-field" value="" placeholder="start date"/><br/><br/>
    <input type="text" name="endDate" class="login-field" value="" placeholder="end date"/><br/><br/>
    <input class="btn btn-primary btn-large btn-block" type="submit" value="Done" /><br/><br/>
</form>
</center>
</div>
    </div>
</body>
</html>