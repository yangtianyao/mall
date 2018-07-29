package com.chuhe.mall.service.impl;

import com.chuhe.mall.dao.ProductInfoDao;
import com.chuhe.mall.model.ProductInfo;
import com.chuhe.mall.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> listByCategory(int categoryId) {
        return productInfoDao.listByCategory(categoryId);
    }
}
