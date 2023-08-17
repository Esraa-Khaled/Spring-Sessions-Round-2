package com.ntg.caching.service;

import com.ntg.caching.entity.Product;
import com.ntg.caching.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    RestTemplate restTemplate;

//    @Cacheable(value = "products", key = "#root.methodName")
    public Iterable<Product> getAll() throws InterruptedException {
        Thread.sleep(2);
        System.out.println( Thread.currentThread().getName() + " >> getAllProducts");
        System.out.println("Fetch Products");
        return productRepo.findAll();
    }

//    @Cacheable(value = "product_info", key = "{#root.methodName}")
    public Optional<Product> getProductById(Long id) throws InterruptedException {
        Thread.sleep(2);
        Optional<Product> product = productRepo.findById(id);
        System.out.println( Thread.currentThread().getName() + " >> getProductById" + id);
        if(product.isPresent()) {
            Product p =product.get();
            //Notify
            //http://localhost:8080/notify/product1
            restTemplate.getForEntity( "http://localhost:9090/notify/" + p.getName(), String.class);

        }


        return product;
    }

    @CacheEvict(value = {"product_info", "products"}, allEntries = true)
    public Product add(Product product) {
        return productRepo.save(product);
    }


}
