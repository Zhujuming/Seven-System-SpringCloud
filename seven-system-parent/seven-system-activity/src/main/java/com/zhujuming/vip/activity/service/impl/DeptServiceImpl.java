package com.zhujuming.vip.activity.service.impl;

import com.zhujuming.vip.activity.mapper.DeptDao;
import com.zhujuming.vip.activity.service.DeptService;
import com.zhujuming.vip.common.model.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        boolean addDept = deptDao.addDept(dept);
        return addDept;
    }

    @Override
    public Dept get(Long id) {
        Dept dept = deptDao.findById(id);
        return dept;
    }

    @Override
    public List<Dept> list() {
        List<Dept> allDept = null;
        try {
            log.info("开始查询所有的部门信息");
            allDept = deptDao.findAll();
            log.info("所有部门信息为:{}",allDept);
        } catch (Exception e) {
            log.warn("查询所有部门信息失败！错误信息为:",e);
            e.printStackTrace();
        }
        return allDept;
    }
}
