package com.shangma.cn.controller;

import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 18:22
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand, Long> {
}
