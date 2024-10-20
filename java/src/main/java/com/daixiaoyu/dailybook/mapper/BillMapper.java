package com.daixiaoyu.dailybook.mapper;

import com.daixiaoyu.dailybook.entity.Bill;
import com.daixiaoyu.dailybook.entity.Condition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: daily-book
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-05 16:39
 **/
@Mapper
public interface BillMapper {
    void addBill(@Param("bill")Bill bill);

    void deleteBill(@Param("id") long id);

    void updateBill(@Param("bill") Bill bill);

    List<Bill> queryBill(@Param("condition") Condition condition);
}
