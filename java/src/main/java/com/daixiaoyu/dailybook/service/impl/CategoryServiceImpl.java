package com.daixiaoyu.dailybook.service.impl;

import com.daixiaoyu.dailybook.entity.Categroy;
import com.daixiaoyu.dailybook.mapper.CategoryMapper;
import com.daixiaoyu.dailybook.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:33
 **/
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void addCategory(Categroy categroy) {
        categoryMapper.addCategory(categroy);
    }

    @Override
    public void deleteCategory(long id) {
        categoryMapper.deleteCategory(id);
    }

    @Override
    public void updateCategory(Categroy categroy) {
        categoryMapper.updateCategory(categroy);
    }

    @Override
    public List<Categroy> queryCategory() {
        return categoryMapper.queryCategory();
    }
}
