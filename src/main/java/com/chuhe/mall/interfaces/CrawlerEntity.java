package com.chuhe.mall.interfaces;

public interface CrawlerEntity extends BaseEntity {
    void setSourceSiteCode(String sourceSiteCode);
    String getSourceSiteCode();
    void setSourceDataCode(String sourceDataCode);
    String getSourceDataCode();
}
