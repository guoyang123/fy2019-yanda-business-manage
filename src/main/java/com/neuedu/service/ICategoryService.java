package com.neuedu.service;

import com.neuedu.exception.MyException;
import com.neuedu.pojo.Category;

import java.util.List;

public interface ICategoryService {


    /**
     * 添加类别
     * */
    public int addCategory(Category category) throws MyException;
    /**
     * 删除类别
     * */
    public int deleteCategory(int categoryId) throws MyException;
    /**
     * 修改类别
     * */
    public int updateCategory(Category category) throws MyException;
    /**
     * 查询类别
     * */
    public List<Category> findAll() throws MyException;


    /**
     * 根据类别id查询类别信息
     * */

    public Category findCategoryById(int categoryId);
}
