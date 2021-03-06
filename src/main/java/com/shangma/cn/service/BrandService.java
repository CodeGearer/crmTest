package com.shangma.cn.service;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:08
 */
public interface BrandService extends BaseService<Brand, Long> {

    PageVo<Brand> searchPage(SearchPageDto searchPageDto);
}
