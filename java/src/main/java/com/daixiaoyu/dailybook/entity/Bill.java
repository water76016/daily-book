package com.daixiaoyu.dailybook.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: daily-book
 * @author: water76016
 * @description: 账单明细表
 * @version: v1.0.0
 * @create: 2024-10-05 14:45
 **/
@Data
public class Bill {
    private long id;
    private long accountBookId;
    private long categoryId;
    private long cost;
    private String remark;
    private Date createTime;
    private Date updateTime;

}
