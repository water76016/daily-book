package com.daixiaoyu.dailybook.mapper;

import com.daixiaoyu.dailybook.entity.Categroy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    void addCategory(@Param("category")Categroy categroy);

    void deleteCategory(@Param("id") long id);

    void updateCategory(@Param("category")Categroy categroy);

    List<Categroy> queryCategory();
}
