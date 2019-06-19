package com.zhujuming.vip.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor //创建一个无参构造函数
@Accessors(chain = true) //使用链式设置属性，set方法返回的是this对象。
@SuppressWarnings("serial") //取消序列化警告
public class Dept implements Serializable {

    private Integer deptno;
    private String dname;
    private String db_source;

}
