package com.example.northwind.api.controller;

import com.example.northwind.business.abstracts.ProductSercice;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductSercice productSercice;

    @Autowired
    public ProductsController(ProductSercice productSercice) {
        this.productSercice = productSercice;
    }

    @GetMapping("/getall")
    public List<Product> getAll() {
        return this.productSercice.getAll();
    }
}
