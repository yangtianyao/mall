package com.chuhe.mall.mapper;

import com.chuhe.mall.model.ProductInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductInfoMapper extends Mapper<ProductInfo> {
    List<ProductInfo> listAll();
}
