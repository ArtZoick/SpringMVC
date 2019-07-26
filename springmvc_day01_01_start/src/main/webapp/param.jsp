<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/29
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--请求参数绑定--%>
<a href="param/testParam?username=hehe&password=123">请求参数绑定</a>

<%--把数据封装Account类中
  每个input里的name和javabean的属性名相同--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    <!--Account类中引用类型的封装，name标签中，user表示是account中的User user，后面.uname表示是user中的属性-->
    用户姓名：<input type="text" name="user.uname"/><br/>
    用户年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交"/>
</form>


<%--把数据封装Account类中，类中存在list和map的集合 --%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>

    <%--把uname和age都封装到User对象中去，然后再存到list中去--%>
    用户姓名：<input type="text" name="list[0].uname"/><br/>
    用户年龄：<input type="text" name="list[0].age"/><br/>

    <%--map['one']里的one为key值，随便写的，但要符合定义时的key值 String。
    同样，这里将uname和age都封装到User对对象中，再存入map集合。map的key值为one--%>
    用户姓名：<input type="text" name="map['one'].uname"/><br/>
    用户年龄：<input type="text" name="map['one'].age"/><br/>
    <input type="submit" value="提交"/>
</form>


<%--自定义类型转换器--%>
<form action="param/saveUser" method="post">
    用户姓名：<input type="text" name="uname"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    用户生日：<input type="text" name="date"/><br/>
    <input type="submit" value="提交"/>
</form>


<a href="param/testServlet">Servlet原生的API</a><br/>


</body>
</html>
