package com.chuhe.mall.dao;

public interface IdentityDao<E> {
    E getById(Long id);

    E getById(E e);

    int updateById(Long id);
}
