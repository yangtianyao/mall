package com.chuhe.mall.dao.impl;

import com.chuhe.mall.common.entity.Identity;
import com.chuhe.mall.dao.IdentityDao;
import com.chuhe.mall.exception.ChuheException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

@Slf4j
public class IdentityDaoImpl<M extends Mapper<E>, E extends Identity> implements IdentityDao<E> {
    @Autowired
    protected M mapper;

    @Override
    public E getById(Long id) {
        E e = getEntity();
        e.setId(id);
        return getById(e);
    }

    @Override
    public E getById(E e) {
        if (Objects.isNull(e.getId()))
            log.error("Id为null");
        return mapper.selectByPrimaryKey(e);
    }

    @Override
    public int updateById(Long id) {
        E e = getEntity();
        e.setId(id);
        return mapper.updateByPrimaryKey(e);
    }

    protected E getEntity() {
        try {
            return getClazz().newInstance();
        } catch (Exception e) {
            throw new ChuheException("创建实例失败", e);
        }
    }

    protected Class<E> getClazz() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class clazz = (Class<E>) type.getActualTypeArguments()[1];
        return clazz;
    }
}
