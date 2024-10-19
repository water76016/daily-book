package com.daixiaoyu.dailybook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableTransactionManagement
//@MapperScan("com.daixiaoyu.dailybook.mapper")
public class DailyBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyBookApplication.class, args);
    }

}
