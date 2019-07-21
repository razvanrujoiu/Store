package com.razvan.Store.Store.Repositories;

import com.razvan.Store.Store.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByProductName(String name);

    List<Product> findByColor(String color);

    List<Product> findByIsAvailable(Boolean isAvailable);

    List<Product> findByProductType(Integer productType);

    List<Product> findByProductPrice(Double price);
}
