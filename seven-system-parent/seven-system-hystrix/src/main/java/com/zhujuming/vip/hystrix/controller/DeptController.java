package com.zhujuming.vip.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhujuming.vip.common.model.Dept;
import com.zhujuming.vip.hystrix.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "部门控制层")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService = null;

    /**
     *  @HystrixCommand(fallbackMethod = "processHystrix_Get")
     *  一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand
     *  标注好的fallbackMethod调用类中的指定方法
     */
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "/dept/get/{id}", httpMethod = "GET", notes = "根据部门ID，查询部门信息")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID:" + id + "没有对应的部门信息！");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("该ID:" + id + "没有对应的部门信息，--null @HystrixCommand").setDb_source("No this adabase in MySQL");
    }


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    @ApiOperation(value = "/dept/add", httpMethod = "POST", notes = "添加部门信息")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }


    @ApiOperation(value = "dept/list", httpMethod = "GET", notes = "获取所有部门信息")
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        List<Dept> list = deptService.list();
        return list;
    }


}
