package com.springboot.rediscachedemo.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.rediscachedemo.dto.Employee;

@SpringBootTest(classes = { EmployeeDao.class })
public class EmployeeDaoTest {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	public void testGetById() {
		Employee actual = employeeDao.getById(1);
		Assert.assertNotNull(actual);
	}

	@Test
	public void testGetAll() {
		List<Employee> actual = employeeDao.getAll();
		Assert.assertNotNull(actual);
	}

	@Test
	public void testDeleteById() {
		employeeDao.deleteById(1);
	}

	@Test
	public void testDeleteAll() {
		employeeDao.deleteAll();
	}

	@Test
	public void testSaveOrUpdate() {
		employeeDao.saveOrUpdate(new Employee(1, "Anil", 200D));
	}
}
