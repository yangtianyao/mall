package com.chuhe.mall.dao.impl;

import com.chuhe.mall.common.entity.BaseEntity;
import com.chuhe.mall.common.mapper.BaseMapper;
import com.chuhe.mall.dao.BaseDao;

public class BaseDaoImpl<M extends BaseMapper<E>, E extends BaseEntity>
        extends IdentityDaoImpl<M, E> implements BaseDao<E> {
}
