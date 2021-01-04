package com.shangma.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 12:08
 */
@Data
public class PageVo<T> {
    private Long total;
    private List<T> list;
}
