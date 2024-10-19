package com.daixiaoyu.dailybook.service.impl;

import com.daixiaoyu.dailybook.entity.AccountBook;
import com.daixiaoyu.dailybook.mapper.AccountBookMapper;
import com.daixiaoyu.dailybook.service.AccountBookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:32
 **/
@Service
public class AccountBookServiceImpl implements AccountBookService {
    @Autowired
    private AccountBookMapper accountBookMapper;

    @Override
    public void addAccountBook(AccountBook accountBook) {
        accountBookMapper.addAccountBook(accountBook);
    }

    @Override
    public void updateAccount(AccountBook accountBook) {
        accountBookMapper.updateAccount(accountBook);
    }

    @Override
    public void deleteAccountBookById(long id) {
        accountBookMapper.deleteAccountBookById(id);
    }

    @Override
    public List<AccountBook> queryAccountBook() {
        return accountBookMapper.queryAccountBook();
    }
}
