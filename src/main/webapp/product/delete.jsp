<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<h1>Delete  product</h1>
<form method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input name="name" value="${p.getName()}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input name="price" value="${p.getPrice()}"></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input name="quantity" value="${p.getQuantity()}"></td>
        </tr>
        <tr>
            <td>Color</td>
            <td><input name="color" value="${p.getColor()}"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input name="description" value="${p.getDescription()}"></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><input name="id_category" value="${p.getId_category()}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Delete"></td>
        </tr>
    </table>
</form>
</body>
</html>
