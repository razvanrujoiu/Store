package com.razvan.Store.Store.Service;

import com.razvan.Store.Store.Model.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product getProductByName(String name);

    List<Product> getProductsByColor(String color);

    List<Product> getProductsByIsAvailable(boolean isAvailable);

    List<Product> getProductsByProductType(Integer productType);

    List<Product> getProductsByProductPrice(Double price);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
