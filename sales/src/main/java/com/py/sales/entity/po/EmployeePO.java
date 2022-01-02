package com.py.sales.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


import java.util.Date;

@Data
@TableName("employee")
public class EmployeePO {
    private Long id;
    private String name;
    private Integer age;
    private String parentId;
    private Date createTime;
    private Date updateTime;
}
