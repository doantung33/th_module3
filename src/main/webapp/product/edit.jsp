<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/25/2021
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit product</h1>
<form method="post">
    <a href="/products">List product</a>
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${p.getName()}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" value="${p.getPrice()}"></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="text" name="quantity" value="${p.getQuantity()}"></td>
        </tr>
        <tr>
            <td>Color</td>
            <td><input type="text" name="color" value="${p.getColor()}"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" value="${p.getDescription()}"></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><input type="text" name="id_category" value="${p.getId_category()}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Edit"></td>
        </tr>
    </table>
</form>
</body>
</html>
