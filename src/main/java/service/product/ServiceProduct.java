package service.product;

import model.Product;
import service.Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceProduct implements IServiceProduct {
    private Connection connection= Sql.getConnection();
    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String quantity=resultSet.getString("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int id_category= resultSet.getInt("id_category");
                Product product = new Product(id, name, price, quantity,color, description,id_category);
                products.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public Product save(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into product(name, price, quantity, color, description, id_category) value (?,?,?,?,?,?) ;");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setString(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescription());
            preparedStatement.setInt(6,product.getId_category());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean edit(Product product) {
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update product set name= ?, price =?, quantity = ?, color =? , description =? ,id_category = ? where id = ?");
            preparedStatement.setInt(7, product.getId());
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setString(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescription());
            preparedStatement.setInt(6,product.getId_category());
            check = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select  * from product where id=? ");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String quantity = resultSet.getString("quantity");
                String color=resultSet.getString("color");
                String des = resultSet.getString("description");
                int id_categoty=resultSet.getInt("id_category");
                product = new Product(id, name, price,quantity,color,des,id_categoty);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean delete(int id) {
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from product where id= ?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            check = true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product where name like ?");
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name1 = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String quantity = resultSet.getString("quantity");
                String color=resultSet.getString("color");
                String des = resultSet.getString("description");
                int id_categoty=resultSet.getInt("id_category");
                products.add(new Product(name1, price,quantity,color, des,id_categoty));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }
}
