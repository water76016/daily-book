package com.daixiaoyu.dailybook.controller;

import cn.hutool.core.util.StrUtil;
import com.daixiaoyu.dailybook.common.RestResult;
import com.daixiaoyu.dailybook.entity.AccountBook;
import com.daixiaoyu.dailybook.service.AccountBookService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:33
 **/
@RestController(value = "/daily-book/account-book")
public class AccountBookController {
    @Autowired
    private AccountBookService accountBookService;

    @ApiOperation("添加账本")
    @PostMapping("/add")
    public RestResult addAccountBook(@RequestBody @ApiParam("用户对象")AccountBook accountBook){
        try {
            accountBookService.addAccountBook(accountBook);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("更新账本")
    @PostMapping("/update")
    public RestResult updateAccount(@RequestBody @ApiParam("用户对象")AccountBook accountBook){
        try {
            accountBookService.updateAccount(accountBook);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("删除账本")
    @PostMapping("/delete")
    public RestResult deleteAccountBookById(@RequestBody @ApiParam("用户对象")AccountBook accountBook){
        try {
            long id=accountBook.getId();
            accountBookService.deleteAccountBookById(id);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("查询账本")
    @PostMapping("/query")
    public RestResult queryAccountBook(){
        try {
            List<AccountBook> accountBookList = accountBookService.queryAccountBook();
            return RestResult.success(accountBookList);
        }
        catch (Exception e){
            return RestResult.error();
        }
    }
}
