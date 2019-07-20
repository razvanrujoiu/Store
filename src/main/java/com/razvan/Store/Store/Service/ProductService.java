package com.razvan.Store.Store.Service;

import com.razvan.Store.Store.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductService extends JpaRepository<Product, Integer> {
}
