package com.daixiaoyu.dailybook.controller;

import com.daixiaoyu.dailybook.common.RestResult;
import com.daixiaoyu.dailybook.entity.Bill;
import com.daixiaoyu.dailybook.service.BillService;
import com.daixiaoyu.dailybook.entity.Condition;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: daily-book
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-05 15:01
 **/
@RestController
@RequestMapping("/daily-book/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @ApiOperation("添加账单")
    @PostMapping("/add")
    public RestResult addBill(@RequestBody Bill bill){
        try {
            billService.addBill(bill);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("更新账单")
    @PostMapping("/update")
    public RestResult updateBill(@RequestBody Bill bill){
        try {
            billService.updateBill(bill);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("删除账单")
    @PostMapping("/delete")
    public RestResult deleteBill(@RequestBody Bill bill){
        try {
            long id=bill.getId();
            billService.deleteBill(id);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("查询账单")
    @PostMapping("/query")
    public RestResult queryBill(@RequestBody Condition condition){
        try {
            List<Bill> billList = billService.queryBill(condition);
            if (billList == null){
                billList = new ArrayList<>();
            }
            return RestResult.success(billList);
        }
        catch (Exception e){
            return RestResult.error();
        }
    }
}
