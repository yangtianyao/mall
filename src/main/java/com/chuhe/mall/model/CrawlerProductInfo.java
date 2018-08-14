package com.chuhe.mall.model;

import com.chuhe.mall.common.entity.BaseEntity;
import com.chuhe.mall.common.entity.CrawlerEntity;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class CrawlerProductInfo implements CrawlerEntity {
    @Id
    private Long id;
    private String sourceDataCode;
    private String sourceSiteCode;
    private String name;
    private Double price;
    private Integer stock;
    private Integer categoryId;
    private Integer salesStatus;
    private String coverUrl;
    private Date createTime;
    private Date updateTime;
    private Boolean isvalid;
}
