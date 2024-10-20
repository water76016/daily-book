package com.daixiaoyu.dailybook.entity;

import lombok.Data;

import java.text.SimpleDateFormat;
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
    private Date occurTime;
    private String occurTimeStr;
    private Date createTime;
    private Date updateTime;
    private String accountBookName;
    private String categoryName;

    public String getOccurTimeStr() {
        if (occurTime != null){
            // 创建SimpleDateFormat对象，并设置日期格式和时区
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            // 如果需要指定时区，可以使用setTimeZone方法，例如：sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));

            // 格式化日期
            occurTimeStr = sdf.format(occurTime);
        }
        return occurTimeStr;
    }
}
