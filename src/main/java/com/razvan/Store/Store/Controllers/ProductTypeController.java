package com.razvan.Store.Store.Controllers;

import com.razvan.Store.Store.Model.Product;
import com.razvan.Store.Store.Model.ProductType;
import com.razvan.Store.Store.Service.ProductTypeService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @RequestMapping(value = "/productType", method = RequestMethod.GET)
    Optional<ProductType> getProductType(@RequestParam Integer id) {
        return productTypeService.findById(id);
    }

//    @RequestMapping(value = "/productType", method = RequestMethod.POST)
//    String addProductType(@RequestBody ProductType productType) {
//        ProductType savedProductType = productTypeService.save(productType);
//        return "SUCCESS";
//    }

    @RequestMapping(value = "/productType", method = RequestMethod.PUT)
    ProductType productType(@RequestBody ProductType productType) {
        ProductType updatedProductType = productTypeService.save(productType);
        return updatedProductType;
    }

//    @RequestMapping(value = "/productType", method = RequestMethod.DELETE)
//    Map deleteProductType(@RequestParam Integer id) {
//        productTypeService.delete(id);
//
//    }
//
//    @RequestMapping(valie = "")

    @RequestMapping(value = "/productTypes", method = RequestMethod.GET)
    List<ProductType> getAllProductTypes() {
        return productTypeService.findAll();
    }

//    @RequestMapping(value = "/productTypes", method = RequestMethod.POST)
//    String addAllProductTypes(@RequestBody List<ProductType> productTypeList) {
//        productTypeService.save(productTypeList);
//        return "SUCCESS";
//    }
}
