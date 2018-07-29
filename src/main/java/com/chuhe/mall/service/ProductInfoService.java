package com.chuhe.mall.service;

import com.chuhe.mall.model.ProductInfo;

import java.util.List;

public interface ProductInfoService{
    /**
     * 按照产品类目查询
     * @param category
     * @return
     */
     List<ProductInfo> listByCategory(int category);
}
