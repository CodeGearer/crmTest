package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.BrandExample;
import com.shangma.cn.mapper.BrandMapper;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:12
 */
@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand, Long> implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageVo<Brand> searchPage(SearchPageDto searchPageDto) {
        BrandExample brandExample = new BrandExample();
        BrandExample.Criteria criteria1 = brandExample.createCriteria();
        BrandExample.Criteria criteria2 = brandExample.createCriteria();
        BrandExample.Criteria criteria3 = brandExample.createCriteria();

        if(searchPageDto.getName() != null) {
            criteria1.andBrandNameLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria2.andBrandDescLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria2.andBrandSiteLike("%" + searchPageDto.getName() + "%");
        }
        brandExample.or(criteria1);
        brandExample.or(criteria2);
        brandExample.or(criteria3);
        List<Brand> brands = brandMapper.selectByExample(brandExample);
        return setPageVo(brands);
    }
}
