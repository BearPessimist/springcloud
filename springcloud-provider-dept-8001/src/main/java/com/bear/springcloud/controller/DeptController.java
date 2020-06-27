package com.bear.springcloud.controller;

import com.bear.springcloud.pojo.Dept;
import com.bear.springcloud.service.DeptService;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//提供Restful服务
public class DeptController {

    @Autowired
    private DeptService deptService;
    //获取微服务信息

    @ResponseBody
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get{id}")
    public Dept get(@PathVariable Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }


}
