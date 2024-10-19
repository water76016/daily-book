package com.daixiaoyu.dailybook.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: daily-book
 * @author: water76016
 * @description: 分类
 * @version: v1.0.0
 * @create: 2024-10-05 14:58
 **/
@Data
public class Categroy {
    private long id;
    private String name;
    private String nature;
    private long parentId;
    private Date createTime;
    private Date updateTime;
}
