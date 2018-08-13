package com.chuhe.mall.dao;

import com.chuhe.mall.exception.ChuheException;
import com.chuhe.mall.interfaces.IdEntity;
import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.common.Mapper;

import java.lang.reflect.ParameterizedType;

@Slf4j
public class IdEntityDaoImpl<M extends Mapper<E>, E extends IdEntity> implements IdEntityDao<E> {
    protected M mapper;

    public E getById(Long id) {
        E e = getEntity();
        e.setId(id);
        return mapper.selectByPrimaryKey(e);
    }

    public int updateById(Long id) {
        E e = getEntity();
        e.setId(id);
        return mapper.updateByPrimaryKey(e);
    }

    public E getEntity() {
        try {
            ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class clazz = (Class<E>) type.getActualTypeArguments()[0];
            return (E) clazz.newInstance();
        } catch (Exception e) {
            throw new ChuheException("创建实例失败", e);
        }
    }
}
