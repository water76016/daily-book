package com.daixiaoyu.dailybook.service.impl;

import com.daixiaoyu.dailybook.entity.Bill;
import com.daixiaoyu.dailybook.mapper.BillMapper;
import com.daixiaoyu.dailybook.service.BillService;
import com.daixiaoyu.dailybook.entity.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:33
 **/
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billMapper;

    @Override
    public void addBill(Bill bill) {
        billMapper.addBill(bill);
    }

    @Override
    public void deleteBill(long billId) {
        billMapper.deleteBill(billId);
    }

    @Override
    public void updateBill(Bill bill) {
        billMapper.updateBill(bill);
    }

    @Override
    public List<Bill> queryBill(Condition condition) {
        List<Bill> result = billMapper.queryBill(condition);
        if (result == null){
            return new ArrayList<>();
        }
        return result;
    }
}
