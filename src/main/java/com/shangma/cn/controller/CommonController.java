package com.shangma.cn.controller;

import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.common.json.JsonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 刘士萱
 * @time 2021/1/9 - 17:38
 */
@RestController
@RequestMapping("common")
public class CommonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{parentId}")
    public AxiosResult getProvinceOrCityOrAreaOrRoad(@PathVariable int parentId) {
        JsonVo str = restTemplate.getForObject("http://apis.juhe.cn/xzqh/query?key=8c5165d59abf38bf0d226b3b5114ef80&fid=" + parentId, JsonVo.class);
        System.out.println(str);
        return AxiosResult.success(str);
    }
}
