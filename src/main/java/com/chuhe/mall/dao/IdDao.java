package com.chuhe.mall.dao;

public interface IdDao<E> {
    E getById(Long id);

    int updateById(Long id);
}
