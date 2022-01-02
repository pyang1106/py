package com.py.sales;

import com.py.sales.entity.po.EmployeePO;
import com.py.sales.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SalesApplicationTests {

	@Autowired
	private EmployeeMapper employeeMapper;
	@Test
	void mybatisPlusTest() {
		List<EmployeePO> employeePOS = employeeMapper.selectList(null);
		employeePOS.stream().forEach(System.out::println);
		System.out.println(employeePOS.size());
	}


}
