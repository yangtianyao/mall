package com.chuhe.mall.mapper;

import com.chuhe.mall.model.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoMapperTest {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Test
    public void listAll() {
        List<ProductInfo> productInfoList = productInfoMapper.listAll();
        System.out.println(productInfoList);
    }
}