<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creat Product</title>
</head>
<body>
<a href="/products">List Product</a>
<form method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" placeholder="nhập tên"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" placeholder="nhập giá"></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="text" name="quantity" placeholder="nhập số lượng"></td>
        </tr>
        <tr>
            <td>Color</td>
            <td><input type="text" name="color" placeholder="nhập màu sắc"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><input type="text" name="description" placeholder="nhập mô tả"></td>
        </tr>
        <tr>
            <td>Category</td>
            <td><input type="text" name="id_category" placeholder="nhập phân loại"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Create"></td>
        </tr>
    </table>
</form>
</body>
</html>
