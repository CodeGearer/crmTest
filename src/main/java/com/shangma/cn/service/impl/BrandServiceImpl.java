package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Brand;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:12
 */
@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand, Long> implements BrandService {
}
