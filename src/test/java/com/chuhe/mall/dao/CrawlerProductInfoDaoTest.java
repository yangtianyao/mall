package com.chuhe.mall.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrawlerProductInfoDaoTest {
    @Autowired
    private CrawlerProductInfoDao crawlerProductInfoDao;

    @Test
    public void test() {
        crawlerProductInfoDao.getById(1l);
        System.out.println(1);
    }

    @Test
    public void test1() {
        crawlerProductInfoDao.listBySource("12", "ppw");
        System.out.println(1);
    }
}