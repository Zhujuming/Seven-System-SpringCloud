package com.zhujuming.vip.fegin.controller;

import com.zhujuming.vip.common.model.Dept;
import com.zhujuming.vip.common.service.DeptClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DeptController_Consumer {

    @Resource
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.deptClientService.get(id);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> get(){
        return this.deptClientService.list();
    }
    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.deptClientService.add(dept);
    }
}
