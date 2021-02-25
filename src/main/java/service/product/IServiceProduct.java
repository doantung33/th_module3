package service.product;

import model.Product;

import java.util.List;

public interface IServiceProduct {
    List<Product> findAll();
    Product save (Product product);
    boolean edit(Product product);
    Product findById(int id);
    boolean delete(int id);
    List<Product> findByName(String name);
}
