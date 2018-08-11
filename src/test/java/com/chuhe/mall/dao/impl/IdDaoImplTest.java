package com.chuhe.mall.dao.impl;

import com.chuhe.mall.dao.CrawlerProductInfoDaoImpl;
import com.chuhe.mall.model.CrawlerProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdDaoImplTest {
    @Autowired
    private CrawlerProductInfoDaoImpl idDao;

    @Test
    public void getById() {
        CrawlerProductInfo crawlerProductInfo = idDao.getById(1l);
        System.out.println(crawlerProductInfo);
    }
}