package com.daixiaoyu.dailybook.controller;

import com.daixiaoyu.dailybook.common.RestResult;
import com.daixiaoyu.dailybook.entity.Bill;
import com.daixiaoyu.dailybook.entity.Categroy;
import com.daixiaoyu.dailybook.service.BillService;
import com.daixiaoyu.dailybook.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: java
 * @author: water76016
 * @description:
 * @version: v1.0.0
 * @create: 2024-10-13 13:34
 **/
@RestController
@RequestMapping("/daily-book/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @ApiOperation("添加分类")
    @PostMapping("/add")
    public RestResult addCategory(@RequestBody Categroy categroy){
        try {
            categoryService.addCategory(categroy);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("更新分类")
    @PostMapping("/update")
    public RestResult updateCategory(@RequestBody Categroy categroy){
        try {
            categoryService.updateCategory(categroy);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("删除分类")
    @PostMapping("/delete")
    public RestResult deleteCategory(@RequestBody Categroy categroy){
        try {
            long id = categroy.getId();
            categoryService.deleteCategory(id);
        }
        catch (Exception e){
            return RestResult.error();
        }
        return RestResult.success();
    }

    @ApiOperation("查询分类")
    @PostMapping("/query")
    public RestResult queryCategory(){
        try {
            List<Categroy> categroyList = categoryService.queryCategory();
            return RestResult.success(categroyList);
        }
        catch (Exception e){
            return RestResult.error();
        }
    }
}
