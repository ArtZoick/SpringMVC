<%--
  Created by IntelliJ IDEA.
  User: zoick
  Date: 2019/7/21
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="anno/testRequestParam?username=hehe">testRequestParam</a>

<form action="anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>

<a href="anno/testPathVariable/10">testPathVariable</a>

<a href="anno/testRequestHeader">RequestHeader</a><br/>

<form action="anno/testModelAttribute" method="post">
    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>

<a href="anno/testSessionAttrubutes">SessionAttrubutes</a><br/>

<a href="anno/getSessionAttrubutes">getSessionAttrubutes</a><br/>

<a href="anno/delSessionAttrubutes">delSessionAttrubutes</a><br/>

</body>
</html>
