package com.razvan.Store.Store.Controllers;

import com.razvan.Store.Store.Model.Product;
import com.razvan.Store.Store.Repositories.ProductRepository;
import com.razvan.Store.Store.Service.ProductService;
import com.razvan.Store.Store.Service.ProductServiceImpl;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PreUpdate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ResponseBody Product getProductByName(@RequestParam(value = "productName") String productName) {
        return productService.getProductByName(productName);
    }

    @RequestMapping(value = "/color", method = RequestMethod.GET)
    @ResponseBody List<Product> getProductsByColor(@RequestParam(value = "color") String color) {
        return productService.getProductsByColor(color);
    }

//    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public Product getAvailableProducts(
//            @PathVariable Integer id,
//            @RequestParam(value = "isAvailable") boolean isAvailable) {
//        return productService.getProductById(id);
//    }




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

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    List<Product> getAllProducts() {
        return productService.listAllProducts();
    }



//    @RequestMapping(value = "/products", method = RequestMethod.DELETE)
//    String deleteAllEmpoyyes() {
//        productService.deleteAll();
//        return "SUCCES";
//    }

}
