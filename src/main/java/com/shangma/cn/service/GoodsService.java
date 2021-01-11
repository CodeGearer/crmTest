package com.shangma.cn.service;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Goods;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author 刘士萱
 * @time 2021/1/9 - 23:02
 */
public interface GoodsService extends BaseService<Goods, Long> {
    PageVo<Goods> searchPage(SearchPageDto searchPageDto);
}

