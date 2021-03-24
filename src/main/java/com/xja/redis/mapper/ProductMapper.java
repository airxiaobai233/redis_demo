package com.xja.redis.mapper;

import com.xja.redis.entity.Product;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    //查找所有商品
    List<Product> findAll();
}