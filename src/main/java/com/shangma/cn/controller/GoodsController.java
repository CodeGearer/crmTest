package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Goods;

import com.shangma.cn.service.GoodsService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/9 - 23:01
 */
@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController {
    
    @Autowired
    private GoodsService goodsService;
    
    @GetMapping("{id}")
    public AxiosResult<Goods> findById(@PathVariable long id) {
        return AxiosResult.success(goodsService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Goods entity) {
        return toAxios(goodsService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Goods entity) {
        return toAxios(goodsService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        return toAxios(goodsService.batchDeleteEntity(ids));
    }

    @PostMapping("searchPage")
    public AxiosResult<PageVo<Goods>> searchPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize, @RequestBody SearchPageDto searchPageDto) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Goods> page = goodsService.searchPage(searchPageDto);
        return AxiosResult.success(page);
    }
}
