package com.razvan.Store.Store.Service;

import com.razvan.Store.Store.Model.Product;
import com.razvan.Store.Store.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.razvan.Store.Store.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return this.productRepository.findById(id).get();
    }

    @Override
    public Product getProductByName(String name) {
        return this.productRepository.findByProductName(name);
    }

    @Override
    public List<Product> getProductsByColor(String color) {
        return this.productRepository.findByColor(color);
    }

    public List<Product> getProductsByIsAvailable(boolean isAvailable) {
        return this.productRepository.findByIsAvailable(isAvailable);
    }

    public List<Product> getProductsByProductType(Integer productType) {
        return this.productRepository.findByProductType(productType);
    }

    public List<Product> getProductsByProductPrice(Double price) {
        return this.productRepository.findByProductPrice(price);
    }


    @Override
    public Product saveProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        this.productRepository.deleteById(id);
    }


}
