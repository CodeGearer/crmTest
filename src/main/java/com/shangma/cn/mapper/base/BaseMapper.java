package com.shangma.cn.mapper.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 11:32
 *
 * 泛型一般五个字母：T K V E ID
 */
public interface BaseMapper<T, ID> {
    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
