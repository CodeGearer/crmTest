package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @author 刘士萱
 * @time 2021/1/5 - 21:34
 */
@Data
public class BaseEntity {
    private long id;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    //定义一个设置添加修改时间和添加人修改人的方法
    public void setData() {
        if(id == 0) {
            //如果ID是0，没有entity就是添加
            this.addTime = new Date();
            //这里的ID先留着，从登录用户拿
            this.creatorId = 1L;
        } else {
            //如果ID不是0，说明有entity，就是修改
            this.updateTime = new Date();
            this.updateId = 2L;
        }
    }
}
