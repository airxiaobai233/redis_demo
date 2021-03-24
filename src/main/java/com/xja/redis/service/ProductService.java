package com.xja.redis.service;

import com.xja.redis.entity.Product;

import java.util.List;

public interface ProductService {
    //获取所有的商品
    List<Product> findAll();
}
