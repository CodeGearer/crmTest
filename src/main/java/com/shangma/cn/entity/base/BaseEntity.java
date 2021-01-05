package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @author 刘士萱
 * @time 2021/1/5 - 21:34
 */
@Data
public class BaseEntity {
    private Long id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}
