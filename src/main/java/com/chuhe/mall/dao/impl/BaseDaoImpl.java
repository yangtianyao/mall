package com.chuhe.mall.dao.impl;

import com.chuhe.mall.dao.BaseDao;
import com.chuhe.mall.interfaces.BaseEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public abstract class BaseDaoImpl<M extends Mapper<E>, E extends BaseEntity>
        extends IdentityDaoImpl<M, E> implements BaseDao<E> {
        @Override
    public List<E> getValidData(Example example) {
        example.and().andEqualTo("isvalid",1);
        return mapper.selectByExample(example);
    }

    @Override
    public List<E> getValidData(E e) {
        e.setIsvalid(true);
        return mapper.select(e);
    }

    @Override
    public int updateByIdCurrentTime(E e) {
        e.setUpdateTime(null);
        return mapper.updateByPrimaryKey(e);
    }
}
