package com.razvan.Store.Store.Repositories;

import com.razvan.Store.Store.Model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
}
