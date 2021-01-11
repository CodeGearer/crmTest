package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.SearchPageDto;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author 刘士萱
 * @time 2021/1/3 - 10:29
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController {
    
    @Autowired
    public SupplierService supplierService;

    @PostMapping("searchPage")
    public AxiosResult<PageVo<Supplier>> searchPage(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "5") int pageSize, @RequestBody SearchPageDto searchPageDto) {
        System.out.println(searchPageDto.getName());
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Supplier> page = supplierService.searchPage(searchPageDto);
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable long id) {
        return AxiosResult.success(supplierService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier entity) {
        return toAxios(supplierService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier entity) {
        return toAxios(supplierService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteEntity(@PathVariable List<Long> ids) {
        return toAxios(supplierService.batchDeleteEntity(ids));
    }
}
