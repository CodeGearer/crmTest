package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 18:22
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController {
    @Autowired
    private BrandService brandService;

//    @GetMapping
//    public AxiosResult<PageVo<Brand>> findPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize) {
//        PageHelper.startPage(currentPage, pageSize);
//        PageVo<Brand> page = brandService.findPage();
//        return AxiosResult.success(page);
//    }
    @PostMapping("searchPage")
    public AxiosResult<PageVo<Brand>> searchPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize,@RequestBody SearchPageDto searchPageDto) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page = brandService.searchPage(searchPageDto);
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable long id) {
        return AxiosResult.success(brandService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity) {
        return toAxios(brandService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity) {
        return toAxios(brandService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        return toAxios(brandService.batchDeleteEntity(ids));
    }
}
