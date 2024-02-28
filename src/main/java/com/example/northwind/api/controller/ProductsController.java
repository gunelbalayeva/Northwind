package com.example.northwind.api.controller;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.core.results.DataResult;
import com.example.northwind.core.results.Result;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductService productSercice;

    @Autowired
    public ProductsController(ProductService productSercice) {
        this.productSercice = productSercice;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productSercice.getAll();
    }

    @PostMapping(name = "/add")
    public <product> Result add(@RequestBody Product product) {
        return this.productSercice.add(product);
    }
}
