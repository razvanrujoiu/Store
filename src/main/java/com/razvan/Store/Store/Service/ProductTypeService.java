package com.razvan.Store.Store.Service;

import com.razvan.Store.Store.Model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeService extends JpaRepository<ProductType, Integer> {
}
