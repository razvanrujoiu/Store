package com.razvan.Store.Store.Controllers;

import com.razvan.Store.Store.Model.Product;
import com.razvan.Store.Store.Service.ProductService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getHelloMessage() {
        return "Hello world";
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    Optional<Product> getProduct(@RequestParam(value = "id", required = true) Integer id) {
        return productService.findById(id);
    }
//
//    @RequestMapping(value = "/product", method = RequestMethod.POST)
//    String addProduct(@RequestBody Product product) {
//        Product savedProduct = productService.save(product);
//        return "SUCCESS";
//    }

//    @RequestMapping(value = "/product", method = RequestMethod.PUT)
//    Product updateProduct(@RequestBody Product product) {
//        Product updatedProduct = productService.save(product);
//        return updatedProduct;
//    }

//    @RequestMapping(value = "/employee", method = RequestMethod.DELETE)
//    Map deleteProduct(@RequestParam Integer id) {
//        productService.delete(id);
//    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> getAllProducts() {
        return productService.findAll();
    }

//    @RequestMapping(value = "/employees", method = RequestMethod.POST)
//    String addAllProducts(@RequestBody List<Product> productList) {
//        productService.save(productList);
//        return "SUCCESS";
//    }

//    @RequestMapping(value = "/products", method = RequestMethod.DELETE)
//    String deleteAllEmpoyyes() {
//        productService.deleteAll();
//        return "SUCCES";
//    }

}
