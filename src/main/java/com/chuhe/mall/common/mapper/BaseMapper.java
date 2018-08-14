package com.chuhe.mall.common.mapper;

import com.chuhe.mall.common.entity.Identity;
import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<E extends Identity> extends Mapper<E> {
}
