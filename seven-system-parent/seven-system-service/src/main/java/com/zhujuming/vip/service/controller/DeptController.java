package com.zhujuming.vip.service.controller;

import com.zhujuming.vip.common.model.Dept;
import com.zhujuming.vip.service.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSException;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "部门控制层")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    @ApiOperation(value = "/dept/add", httpMethod = "POST", notes = "添加部门信息")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "/dept/get/{id}", httpMethod = "GET", notes = "根据部门ID，查询部门信息")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        return dept;
    }

    @ApiOperation(value = "dept/list",httpMethod = "GET",notes = "获取所有部门信息")
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        List<Dept> list = deptService.list();
        return list;
    }

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("*****************:"+ list);

        List<ServiceInstance> instanceList = client.getInstances("SEVEN-SYSTEM-SERVICE-PROVIDER");
        for (ServiceInstance serviceInstance : instanceList) {
            System.out.println(serviceInstance.getServiceId()+"\t" +serviceInstance.getHost()+"\t"+
                    serviceInstance.getPort()+"\t"+serviceInstance.getUri());
        }
        return this.client;
    }
}
