package com.ntg.caching.controllers;


import com.ntg.caching.entity.Product;
import com.ntg.caching.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class productController {

    @Autowired
    ProductService productService;


    @GetMapping("/getall")
    public Iterable<Product> getAllProducts() throws InterruptedException {
        return productService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) throws InterruptedException {
        return productService.getProductById(id);
    }

    public Product getAllProducts(@RequestBody Product product){
        return productService.add(product);
    }

}
