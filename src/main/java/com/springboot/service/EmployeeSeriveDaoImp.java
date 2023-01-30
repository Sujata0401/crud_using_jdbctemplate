package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeDao;
import com.springboot.dto.EmployeeDto;

@Service
public class EmployeeSeriveDaoImp implements EmployeeServiceDao {

	@Autowired
	private EmployeeDao employeeDao;

	public Object getAllEmployeeUser() {
		return employeeDao.getAllEmployees();
	}

	public int insertEmployeeUser(String name, String address) {
		return employeeDao.insertAllEmployees(name, address);
	}

	public int deleteEmployeById(int id) {
		return employeeDao.delEmployeeByid(id);

	}

	public int updateEmpTableById(int id, String name, String address) {
		return employeeDao.updateById(id,name,address);

	}
	public EmployeeDto getEmployeeById(Integer id) {
		return employeeDao.getEmpByID(id);
		
	}

}
