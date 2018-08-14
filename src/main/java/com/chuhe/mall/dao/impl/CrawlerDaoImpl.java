package com.chuhe.mall.dao.impl;

import com.chuhe.mall.common.entity.CrawlerEntity;
import com.chuhe.mall.common.mapper.CrawlerMapper;
import com.chuhe.mall.dao.CrawlerDao;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import java.util.List;

public class CrawlerDaoImpl<M extends CrawlerMapper<E>, E extends CrawlerEntity>
        extends BaseDaoImpl<M, E> implements CrawlerDao<E> {
    @Override
    public E listBySource(String sourceDataCode, String sourceSiteCode) {
        Example example = Example.builder(getClazz())
                .where(WeekendSqls.<E>custom()
                        .andEqualTo(E::getSourceDataCode, sourceDataCode)
                        .andEqualTo(E::getSourceSiteCode, sourceSiteCode))
                .build();
        List<E> result = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(result))
            return null;
        return result.get(0);
    }
}
