package com.chuhe.mall.dao;

import com.chuhe.mall.mapper.ProductInfoMapper;
import com.chuhe.mall.model.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Repository
public class ProductInfoDao {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    List<ProductInfo> listByCategory(int category) {
        Example example = new Example(ProductInfo.class);
        example.createCriteria().andEqualTo("category", category);
        return productInfoMapper.selectByExample(example);
    }
}
