package com.springboot.rediscachedemo.service;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.rediscachedemo.dao.EmployeeDao;
import com.springboot.rediscachedemo.dto.Employee;

@SpringBootTest(classes = { EmployeeService.class, EmployeeDao.class })
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testGetById() {
		Employee actual = employeeService.getById(1);
		Assert.assertNotNull(actual);
	}

	@Test
	public void testGetAll() {
		List<Employee> actual = employeeService.getAll();
		Assert.assertNotNull(actual);
	}

	@Test
	public void testDeleteById() {
		employeeService.deleteById(1);
	}

	@Test
	public void testDeleteAll() {
		employeeService.deleteAll();
	}

	@Test
	public void testSaveOrUpdate() {
		employeeService.saveOrUpdate(new Employee(1, "Anil", 200D));
	}
}
