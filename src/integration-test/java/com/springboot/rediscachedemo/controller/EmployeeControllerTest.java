package com.springboot.rediscachedemo.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.rediscachedemo.dao.EmployeeDao;
import com.springboot.rediscachedemo.dto.Employee;
import com.springboot.rediscachedemo.service.EmployeeService;

@SpringBootTest(classes = { EmployeeController.class, EmployeeService.class, EmployeeDao.class })
public class EmployeeControllerTest {

	@Autowired
	private EmployeeController employeeController;

	@Test
	public void testGetById() {
		Employee actual = employeeController.getById(1);
		Assert.assertNotNull(actual);
	}

	@Test
	public void testGetAll() {
		List<Employee> actual = employeeController.getAll();
		Assert.assertNotNull(actual);
	}

	@Test
	public void testDeleteById() {
		employeeController.deleteById(1);
	}

	@Test
	public void testDeleteAll() {
		employeeController.deleteAll();
	}

	@Test
	public void testSaveOrUpdate() {
		employeeController.saveOrUpdate(new Employee(1, "Anil", 200D));
	}

}
