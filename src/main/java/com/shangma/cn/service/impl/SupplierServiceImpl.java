package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 10:07
 */
@Service//
@Transactional//开启事务
public class SupplierServiceImpl extends BaseServiceImpl<Supplier, Long> implements SupplierService {
//    @Autowired
//    private SupplierMapper supplierMapper;
//
//    @Override
//    public List<Supplier> findPage() {
//        return supplierMapper.selectByExample(null);
//    }
//
//    @Override
//    public Supplier findById(Long id) {
//        return supplierMapper.selectByPrimaryKey(id);
//    }
//
//    @Override
//    public int updateEntity(Supplier supplier) {
//        return supplierMapper.updateByPrimaryKey(supplier);
//    }
//
//    @Override
//    public int deleteById(Long id) {
//        return supplierMapper.deleteByPrimaryKey(id);
//    }
//
//    @Override
//    public int addEntity(Supplier supplier) {
//        return supplierMapper.insert(supplier);
//    }
}
