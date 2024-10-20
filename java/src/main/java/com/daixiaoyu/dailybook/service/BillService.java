package com.daixiaoyu.dailybook.service;

import com.daixiaoyu.dailybook.entity.Bill;
import com.daixiaoyu.dailybook.entity.Condition;

import java.util.List;

public interface BillService {
    void addBill(Bill bill);

    void deleteBill(long billId);

    void updateBill(Bill bill);

    List<Bill> queryBill(Condition condition);
}
