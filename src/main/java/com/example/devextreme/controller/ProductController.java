package com.example.devextreme.controller;

import com.example.devextreme.model.Product;
import com.example.devextreme.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController
{
    @Autowired
    private ProductRepository productRepository;
    @PostMapping
    public Product createProduct(@RequestBody Product product)
    {
        return productRepository.save(product);
    }
    @GetMapping
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
}