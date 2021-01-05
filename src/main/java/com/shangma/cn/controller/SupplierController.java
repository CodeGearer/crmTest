package com.shangma.cn.controller;

import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Supplier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 10:29
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier, Long> {

}
