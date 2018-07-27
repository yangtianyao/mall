package com.chuhe.mall.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@Data
public class ProductInfo {
    @Id
    private Integer id;
    private String productCode;
    private String name;
    private Double price;
    private Integer stock;
    private Integer category;
    private Integer salesStatus;
    private String coverUrl;
    private Date createTime;
    private Date updateTime;
}
