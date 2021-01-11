package com.shangma.cn.dto;

/**
 * @author 刘士萱
 * @time 2021/1/8 - 21:29
 */
public class SearchPageDto {

    private String name;

    public SearchPageDto() {
    }

    public SearchPageDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
