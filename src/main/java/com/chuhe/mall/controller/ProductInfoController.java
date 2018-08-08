package com.chuhe.mall.controller;

import com.chuhe.mall.dto.ResponseResult;
import com.chuhe.mall.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product_info")
@Slf4j
public class ProductInfoController {
    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/category/get/{categoryId}")
    public ResponseResult listByCategory(@PathVariable(name = "categoryId") Integer categoryId) {
        try {
            return ResponseResult.success(productInfoService.listByCategory(categoryId));
        } catch (Exception e) {
            log.error("产品请求异常", e);
        }
        return ResponseResult.fail();
    }
}
