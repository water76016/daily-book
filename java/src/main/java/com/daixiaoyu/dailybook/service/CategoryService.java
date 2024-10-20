package com.daixiaoyu.dailybook.service;

import com.daixiaoyu.dailybook.entity.Categroy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryService {
    void addCategory(Categroy categroy);

    void deleteCategory(long id);

    void updateCategory(Categroy categroy);

    List<Categroy> queryCategory();
}
