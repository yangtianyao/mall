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

    public List<ProductInfo> listByCategory(int categoryId) {
        Example example = new Example(ProductInfo.class);
        example.createCriteria().andEqualTo("categoryId", categoryId);
        return productInfoMapper.selectByExample(example);
    }
}
