

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Products</title>
</head>
<body>

<h2>Product List</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
    </tr>

    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
