package com.springboot.service;

import com.springboot.dto.EmployeeDto;

public interface EmployeeServiceDao {
	
	public Object getAllEmployeeUser();

	public int insertEmployeeUser(String name, String address);

	public int deleteEmployeById(int id);

	public int updateEmpTableById(int id, String name, String address);

	public EmployeeDto getEmployeeById(Integer id);


	
	
	
}
