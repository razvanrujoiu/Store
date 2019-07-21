package com.razvan.Store.Store.Service;

import com.razvan.Store.Store.Model.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product getProductByName(String name);

    List<Product> getProductsByColor(String color);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
