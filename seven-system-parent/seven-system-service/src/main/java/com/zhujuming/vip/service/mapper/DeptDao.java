package com.zhujuming.vip.service.mapper;


import java.util.List;
import com.zhujuming.vip.common.model.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

