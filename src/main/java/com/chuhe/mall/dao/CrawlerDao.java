package com.chuhe.mall.dao;

import com.chuhe.mall.common.entity.CrawlerEntity;

public interface CrawlerDao<E extends CrawlerEntity> extends BaseDao<E> {
    E listBySource(String sourceDataCode, String sourceSiteCode);
}
