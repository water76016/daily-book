package com.daixiaoyu.dailybook.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: daily-book
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-05 15:08
 **/
@Component // 必须要有这个注解,否则无法在其他地方自动注入
@ConfigurationProperties(prefix="spring.datasource")//此处表示只读取application.yml中spring下面的datasource下面的属性
@Data
public class DBProperties {

    //各个属性名称和application.yml中spring.datasource下面的各个属性key一一对应
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private String initialSize;
    private String minIdle;
    private String maxActive;
    private String maxWait;
    private String showsql;


}
