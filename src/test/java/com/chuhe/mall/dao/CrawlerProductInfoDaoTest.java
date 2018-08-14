package com.chuhe.mall.dao;

import com.chuhe.mall.dao.impl.CrawlerProductInfoDaoImpl;
import com.chuhe.mall.model.CrawlerProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrawlerProductInfoDaoTest {
    @Autowired
    private CrawlerProductInfoDaoImpl crawlerProductInfoDao;

    @Test
    public void test() {
        crawlerProductInfoDao.getById(1l);
        System.out.println(1);
    }

    @Test
    public void test1() {
        CrawlerProductInfo crawlerProductInfo = new CrawlerProductInfo();
        crawlerProductInfo.setCategoryId(1);
        crawlerProductInfoDao.getValidData(crawlerProductInfo);
        System.out.println(1);
    }

    @Test
    public void test2() {
        Example example = Example.builder(CrawlerProductInfo.class)
                .where(WeekendSqls.<CrawlerProductInfo>custom().andEqualTo(CrawlerProductInfo::getCategoryId, 1))
                .build();
        crawlerProductInfoDao.getValidData(example);
        System.out.println(1);
    }
}