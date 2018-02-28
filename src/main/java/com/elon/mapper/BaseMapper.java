package com.elon.mapper;

import java.io.Serializable;

/**
 * 2017/2/8 10:10.
 * <p>
 * Email: cheerUpPing@163.com
 */
public interface BaseMapper<T,ID extends Serializable> {

    void insert(T t);

    void delete(ID id);

    void update(T t);

    void select(ID id);

}
