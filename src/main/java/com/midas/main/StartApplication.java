package com.midas.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by UserEntity on 2017/9/11.
 */
@SpringBootApplication(scanBasePackages = "com.midas")//全局扫描
@EnableTransactionManagement//事务启动
@MapperScan(basePackages = "com.midas.**.mapper")//mapper 扫描
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
