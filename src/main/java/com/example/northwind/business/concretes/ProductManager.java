package com.example.northwind.business.concretes;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.core.results.DataResult;
import com.example.northwind.core.results.Result;
import com.example.northwind.core.results.SuccessDataResult;
import com.example.northwind.core.results.SuccessResult;
import com.example.northwind.dataaccess.abstracts.ProductDao;
import com.example.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Urun eklendi");
    }
}
