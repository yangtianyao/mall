package com.chuhe.mall.dao;

import com.chuhe.mall.common.entity.Identity;

public interface IdentityDao<E extends Identity> {
    E getById(Long id);

    E getById(E e);

    int updateById(Long id);
}
