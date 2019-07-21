package com.razvan.Store.Store.Controllers;

import com.razvan.Store.Store.Model.Product;
import com.razvan.Store.Store.Model.ProductType;
import com.razvan.Store.Store.Repositories.ProductTypeRepository;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/productTypes")
public class ProductTypeController {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    ProductType getProductType(@PathVariable Integer id) {
        return productTypeRepository.findById(id).get();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    List<ProductType> getAllProductTypes() {
        return productTypeRepository.findAll();
    }

    @RequestMapping(value = "/addProductType", method = RequestMethod.POST)
    String addProductType(@RequestBody ProductType productType) {
        ProductType savedProductType = productTypeRepository.save(productType);
        return "SUCCESS";
    }


    @RequestMapping(value = "/updateProductType", method = RequestMethod.PUT)
    ProductType productType(@RequestBody ProductType productType) {
        ProductType updatedProductType = productTypeRepository.save(productType);
        return updatedProductType;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    String deleteProductType(@PathVariable Integer id) {
        productTypeRepository.deleteById(id);
        return "SUCCESS";
    }






}
