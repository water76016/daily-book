package com.daixiaoyu.dailybook.service;

import com.daixiaoyu.dailybook.entity.AccountBook;

import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:32
 **/
public interface AccountBookService {
    void addAccountBook(AccountBook accountBook);

    void updateAccount(AccountBook accountBook);

    void deleteAccountBookById(long id);

    List<AccountBook> queryAccountBook();
}
