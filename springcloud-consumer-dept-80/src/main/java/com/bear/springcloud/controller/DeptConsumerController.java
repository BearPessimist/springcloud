package com.bear.springcloud.controller;

import com.bear.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    //消费者:不应该有service层
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/add" )
    public boolean add(Dept dept) {
                            //使用post方式请求对象
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

}
