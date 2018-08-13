package com.chuhe.mall.dao;

public interface IdEntityDao<E> {
    E getById(Long id);

    int updateById(Long id);
}
