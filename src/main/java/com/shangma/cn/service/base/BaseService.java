package com.shangma.cn.service.base;

import com.shangma.cn.mapper.base.BaseMapper;
import com.shangma.cn.vo.PageVo;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 12:07
 */
public interface BaseService<T, ID> {

    /**
     * 分页查询
     * @return
     */
    PageVo<T> findPage();

    /**
     * 条件查询
     * @param example
     * @return
     */
    PageVo<T> findPage(Object example);

    /**
     * 按ID查询
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * 添加
     * @param entity
     * @return
     */
    int addEntity(T entity);

    /**
     * 修改
     * @param entity
     * @return
     */
    int updateEntity(T entity);

    /**
     * 删除操作
     * @param id
     * @return
     */
    int deleteEntity(ID id);

    /**
     * 批量添加
     * @param list
     * @return
     */
    int batchAddEntity(List<T> list);

    /**
     * 批量修改
     * @param list
     * @return
     */
    int batchAUpdateEntity(List<T> list);

    /**
     * 批量删除
     * @param
     * @return
     */
    int batchDeleteEntity(List<ID> ids);

    /**
     * 封装分页数据
     * @param list
     * @return
     */
    PageVo<T> setPageVo(List<T> list);

    BaseMapper<T, ID> getBaseMapper();

}
