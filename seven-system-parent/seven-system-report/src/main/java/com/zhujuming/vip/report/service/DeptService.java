package com.zhujuming.vip.report.service;

import com.zhujuming.vip.common.model.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
