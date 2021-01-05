package com.shangma.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 刘士萱
 * @time 2021/1/2 - 23:11
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages="com.shangma.cn.mapper")
public class CrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class);
    }
}
