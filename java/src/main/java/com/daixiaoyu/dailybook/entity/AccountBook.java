package com.daixiaoyu.dailybook.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: daily-book
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-05 14:24
 **/
@Data
public class AccountBook {
    private long id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
