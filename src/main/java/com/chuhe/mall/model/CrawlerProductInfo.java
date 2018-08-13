package com.chuhe.mall.model;

import com.chuhe.mall.interfaces.BaseEntity;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class CrawlerProductInfo implements BaseEntity {
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
