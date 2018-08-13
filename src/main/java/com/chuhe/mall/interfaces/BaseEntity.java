package com.chuhe.mall.interfaces;

import java.util.Date;

public interface BaseEntity extends Identity {
    void setUpdateTime(Date updateTime);
    Date getUpdateTime();
    void setIsvalid(Boolean isvalid);
    Boolean getIsvalid();
}
