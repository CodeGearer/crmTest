package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Category;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author 刘士萱
 * @time 2021/1/3 - 18:30
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {
    @Autowired
    public CategoryService categoryService;

    @PostMapping("searchPage")
    public AxiosResult<PageVo<Category>> searchPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize,@RequestBody SearchPageDto searchPageDto) {
        System.out.println(searchPageDto.getName());
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Category> page = categoryService.searchPage(searchPageDto);
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable long id) {
        return AxiosResult.success(categoryService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity) {
        return toAxios(categoryService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity) {
        return toAxios(categoryService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        return toAxios(categoryService.batchDeleteEntity(ids));
    }
}
