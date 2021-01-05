package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Category;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:14
 */
@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {
}
