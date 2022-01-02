package com.py.sales.entity.vo;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeVO {
    private Long id;
    private String name;
    private Integer age;
    private String parentId;
    private Date createTime;
    private Date updateTime;
}
