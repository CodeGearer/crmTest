package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Goods;
import com.shangma.cn.entity.GoodsExample;
import com.shangma.cn.mapper.GoodsMapper;
import com.shangma.cn.service.GoodsService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/9 - 23:02
 */
@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods, Long> implements GoodsService {
    @Autowired
    private GoodsMapper goodMapper;

    @Override
    public PageVo<Goods> searchPage(SearchPageDto searchPageDto) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        GoodsExample.Criteria criteria2 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria3 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria4 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria5 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria6 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria7 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria8 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria9 = goodsExample.createCriteria();
        GoodsExample.Criteria criteria10 = goodsExample.createCriteria();

        if(searchPageDto.getName() != null) {
            criteria.andBaseBrandLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria2.andBaseCategoryLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria3.andBaseColorLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria4.andBaseDistributionLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria5.andBaseModelLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria6.andBasePurchaseLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria7.andBaseStandbyLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria8.andGoodCategoryLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria9.andGoodNameLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria10.andPurchaseMoudleLike("%" + searchPageDto.getName() + "%");
        }

//        goodsExample.or(criteria);
        goodsExample.or(criteria);
        goodsExample.or(criteria2);
        goodsExample.or(criteria3);
        goodsExample.or(criteria4);
        goodsExample.or(criteria5);
        goodsExample.or(criteria6);
        goodsExample.or(criteria7);
        goodsExample.or(criteria8);
        goodsExample.or(criteria9);
        goodsExample.or(criteria10);

        List<Goods> goods = goodMapper.selectByExample(goodsExample);
        return setPageVo(goods);
    }
}
