package com.bear.springcloud.service;

import com.bear.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    //根据实体类添加,返回为布尔值
    boolean addDept(Dept dept);
    //根据id查询,返回Dept对象类型
    Dept queryById(Long id);
    //查询所有
    List<Dept> queryAll();
}
