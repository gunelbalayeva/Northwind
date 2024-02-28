package com.example.northwind.business.abstracts;

import com.example.northwind.core.results.DataResult;
import com.example.northwind.core.results.Result;
import com.example.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}