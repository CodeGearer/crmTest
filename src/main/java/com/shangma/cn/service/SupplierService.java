package com.shangma.cn.service;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 10:01
 */
public interface SupplierService extends BaseService<Supplier, Long> {
    PageVo<Supplier> searchPage(SearchPageDto searchPageDto);
//    /**
//     * 分页查询
//     * @return
//     */
//    List<Supplier> findPage();
//
//    /**
//     * 通过ID查询
//     * @param id
//     * @return
//     */
//    Supplier findById(Long id);
//
//    /**
//     * 修改操作
//     * @param supplier
//     * @return
//     */
//    int updateEntity(Supplier supplier);
//
//    /**
//     * 删除
//     * @param id
//     * @return
//     */
//    int deleteById(Long id);
//
//    /**
//     * 添加操作
//     * @param supplier
//     * @return
//     */
//    int addEntity(Supplier supplier);
}
