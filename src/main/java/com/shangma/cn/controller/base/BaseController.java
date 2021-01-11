package com.shangma.cn.controller.base;
import com.shangma.cn.common.http.AxiosResult;

/**
 * @author 刘士萱
 * @time 2021/1/5 - 21:21
 */
public class BaseController {
    //抽取公共方法
    public AxiosResult<Void> toAxios(int row) {
        return row>0?AxiosResult.success():AxiosResult.error();
    }
}
