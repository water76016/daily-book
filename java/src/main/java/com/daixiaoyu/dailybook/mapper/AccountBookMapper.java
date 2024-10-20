package com.daixiaoyu.dailybook.mapper;

import com.daixiaoyu.dailybook.controller.AccountBookController;
import com.daixiaoyu.dailybook.entity.AccountBook;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:24
 **/
@Mapper
public interface AccountBookMapper {
    void addAccountBook(@Param("accountBook") AccountBook accountBook);

    void updateAccount(@Param("accountBook") AccountBook accountBook);

    void deleteAccountBookById(@Param("id") long id);

    List<AccountBook> queryAccountBook();
}
