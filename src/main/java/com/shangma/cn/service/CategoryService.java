package com.shangma.cn.service;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Category;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:13
 */
public interface CategoryService extends BaseService<Category, Long> {
    PageVo<Category> searchPage(SearchPageDto searchPageDto);
}
