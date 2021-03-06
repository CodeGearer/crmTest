package com.shangma.cn.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.shangma.cn.mapper.base.BaseMapper;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.utils.ReflectionUtils;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 12:19
 */
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {
    @Autowired
    private BaseMapper<T, ID> baseMapper;

//    public BaseMapper<T, ID> getBaseMapper() {
//        return baseMapper;
//    }

    @Override
    public PageVo<T> findPage() {
        return setPageVo(baseMapper.selectByExample(null));
    }

    @Override
    public PageVo<T> findPage(Object example) {

        return setPageVo(baseMapper.selectByExample(example));
    }

    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addEntity(T entity) {
        //给新添加的entity添加操作者和创建时间
        //使用反射
        Object setData = ReflectionUtils.invokeMethod(entity, "setData", null, null);
        return baseMapper.insert(entity);
    }

    @Override
    public int updateEntity(T entity) {
        Object setData = ReflectionUtils.invokeMethod(entity, "setData", null, null);
        return baseMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int deleteEntity(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int batchAddEntity(List<T> list) {
        list.forEach(item -> baseMapper.insert(item));
        return 1;
    }

    @Transactional
    @Override
    public int batchAUpdateEntity(List<T> list) {
        list.forEach(item -> baseMapper.updateByPrimaryKey(item));
        return 1;
    }

    @Transactional
    @Override
    public int batchDeleteEntity(List<ID> ids) {
        ids.forEach(item -> baseMapper.deleteByPrimaryKey(item));
        return 1;
    }

    @Override
    public PageVo<T> setPageVo(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setList(list);
        pageVo.setTotal(total);
        return pageVo;
    }

    @Override
    public BaseMapper<T, ID> getBaseMapper() {
        return baseMapper;
    }
}
