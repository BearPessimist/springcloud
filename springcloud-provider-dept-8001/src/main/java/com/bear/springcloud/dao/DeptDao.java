package com.bear.springcloud.dao;

import com.bear.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    //根据实体类添加,返回为布尔值
    boolean addDept(Dept dept);
    //根据id查询,返回Dept对象类型
    Dept queryById(Long id);
    //查询所有
    List<Dept> queryAll();
}
