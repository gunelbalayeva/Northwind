package com.example.northwind.business.abstracts;

import com.example.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductSercice {
    List<Product> getAll();
}
