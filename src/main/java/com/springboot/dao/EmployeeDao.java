package com.springboot.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.springboot.dto.EmployeeDto;
import com.springboot.utlis.ConstantSqlQueries;

@Component
public class EmployeeDao implements ConstantSqlQueries {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<EmployeeDto> getAllEmployees() {
		List<EmployeeDto> allemployees = jdbcTemplate.query(SELECT_QUERY, (rs,
				row_num) -> new EmployeeDto(rs.getInt("id"), rs.getString("emp_Name"), rs.getString("emp_Address")));
		System.out.println(allemployees);
		return allemployees;

	}

	public int insertAllEmployees(String name, String address) {
		// TODO Auto-generated method stub
		int insertedRows = jdbcTemplate.update(INSERT_QUERY, name, address);
		return insertedRows;
	}

	public int delEmployeeByid(int id) {
		// TODO Auto-generated method stub
		int deletedRows = jdbcTemplate.update(DELETE_QUERY,id);
		return deletedRows;
	}

	public int updateById(int id,String name, String address) {
		// TODO Auto-generated method stub
		int updatedRows=jdbcTemplate.update(UPDATE_QUERY,address,name,id);
		return updatedRows;
	}

	public EmployeeDto getEmpByID(Integer id) {
		// TODO Auto-generated method stub
		EmployeeDto employeeDto=jdbcTemplate.queryForObject(GET_BY_ID,new Object [] {id}, (rs,row_num)-> new EmployeeDto(rs.getString("emp_Name"),rs.getString("emp_Address")));
		System.out.println(employeeDto);
		return employeeDto;
	}

}
