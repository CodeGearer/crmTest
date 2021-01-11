package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Category;
import com.shangma.cn.entity.CategoryExample;
import com.shangma.cn.mapper.CategoryMapper;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:14
 */
@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public PageVo<Category> searchPage(SearchPageDto searchPageDto) {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria1 = categoryExample.createCriteria();
        CategoryExample.Criteria criteria2 = categoryExample.createCriteria();
        if(searchPageDto.getName() != null) {
            criteria1.andCategoryNameLike("%" + searchPageDto.getName() + "%");
        }
        if(searchPageDto.getName() != null) {
            criteria2.andCategoryDescLike("%" + searchPageDto.getName() + "%");
        }
        categoryExample.or(criteria1);
        categoryExample.or(criteria2);
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        return setPageVo(categories);
    }
}
