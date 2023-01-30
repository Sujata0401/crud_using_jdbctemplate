package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.EmployeeDto;
import com.springboot.service.EmployeeServiceDao;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

	@Autowired
	private EmployeeServiceDao employeeServiceDao;

	@GetMapping("/index")
	public Object Index() {
		return employeeServiceDao.getAllEmployeeUser();

	}

	@PostMapping("/save")
	public int Save(@Param("name") String name, @Param("address") String address) {
		return employeeServiceDao.insertEmployeeUser(name, address);
	}

	@PostMapping("/del/{id}")
	public int deleteById(@PathVariable("id") int id) {
		return employeeServiceDao.deleteEmployeById(id);

	}
	@PostMapping("/update/{id}")
	public int updateById(@PathVariable("id") int id,@Param("name") String name,@Param("address")String address) {
		return employeeServiceDao.updateEmpTableById(id,name,address);
		
	}
	@GetMapping("/index/{id}")
	public EmployeeDto getById(@PathVariable("id")Integer id) {
		return employeeServiceDao.getEmployeeById(id);
		
	}
}
