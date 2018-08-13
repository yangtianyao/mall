package com.chuhe.mall.dao;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface BaseDao<E> {
    List<E> getValidData(Example example);

    List<E> getValidData(E e);

    int updateByIdCurrentTime(E e);
}
