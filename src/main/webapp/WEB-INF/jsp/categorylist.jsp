<%--
  Created by IntelliJ IDEA.
  User: Neuedu
  Date: 2019/8/6
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>

    <table>
       <thead>
           <th>类别Id</th>
           <th>类别名称</th>
           <th>所属父类</th>
           <th>类别状态</th>
           <th>创建时间</th>
           <th>修改时间</th>
           <th>操作</th>
       </thead>

        <c:forEach items="${categorylist}" var="category">

         <tr>
             <th>${category.id}</th>
             <th>${category.name}</th>
             <th>${category.parentId}</th>
             <th>${category.status}</th>
             <th>${category.createTime}</th>
             <th>${category.updateTime}</th>
             <th>
                 <a href="update/${category.id}" >修改</a>
                 <a href="" >删除</a>
             </th>
         </tr>

        </c:forEach>


    </table>



</head>
<body>




</body>
</html>
