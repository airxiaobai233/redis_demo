package com.xja.redis.service.impl;

import com.xja.redis.entity.Product;
import com.xja.redis.mapper.ProductMapper;
import com.xja.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

}
