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


//
//    @RequestMapping(value = "/productType", method = RequestMethod.PUT)
//    ProductType productType(@RequestBody ProductType productType) {
//        ProductType updatedProductType = productTypeRepository.save(productType);
//        return updatedProductType;
//    }

//    @RequestMapping(value = "/productType", method = RequestMethod.DELETE)
//    Map deleteProductType(@RequestParam Integer id) {
//        productTypeRepository.delete(id);
//
//    }
//
//    @RequestMapping(valie = "")

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    List<ProductType> getAllProductTypes() {
        return productTypeRepository.findAll();
    }

//    @RequestMapping(value = "/productTypes", method = RequestMethod.POST)
//    String addAllProductTypes(@RequestBody List<ProductType> productTypeList) {
//        productTypeService.save(productTypeList);
//        return "SUCCESS";
//    }
}
