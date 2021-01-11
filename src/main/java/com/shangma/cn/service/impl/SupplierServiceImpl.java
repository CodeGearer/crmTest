package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.entity.SupplierExample;
import com.shangma.cn.mapper.SupplierMapper;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 10:07
 */
@Service//
@Transactional//开启事务
public class SupplierServiceImpl extends BaseServiceImpl<Supplier, Long> implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public PageVo<Supplier> searchPage(SearchPageDto searchPageDto) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        SupplierExample.Criteria criteria2 = supplierExample.createCriteria();
        SupplierExample.Criteria criteria3 = supplierExample.createCriteria();
        SupplierExample.Criteria criteria4 = supplierExample.createCriteria();
        SupplierExample.Criteria criteria5 = supplierExample.createCriteria();
        SupplierExample.Criteria criteria6 = supplierExample.createCriteria();
        if(searchPageDto.getName() != null) {
            criteria.andSupplierNameLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria2.andSupplierAddressLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria3.andSupplierBrankLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria4.andSupplierContactLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria5.andSupplierEmailLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria6.andSupplierPhoneLike("%" + searchPageDto.getName() + "%");
        }
        supplierExample.or(criteria);
        supplierExample.or(criteria2);
        supplierExample.or(criteria3);
        supplierExample.or(criteria4);
        supplierExample.or(criteria5);
        supplierExample.or(criteria6);

        List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);
        return setPageVo(suppliers);
    }
}
