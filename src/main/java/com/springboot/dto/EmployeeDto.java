package com.springboot.dto;

public class EmployeeDto {
	private Integer id;
	private String emp_Name;
	private String emp_Address;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmp_Name() {
		return emp_Name;
	}


	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}


	public String getEmp_Address() {
		return emp_Address;
	}


	public void setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
	}


	public EmployeeDto(Integer id, String emp_Name, String emp_Address) {
		super();
		this.id = id;
		this.emp_Name = emp_Name;
		this.emp_Address = emp_Address;
	}


	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeDto(String emp_Name, String emp_Address) {
		super();
		this.emp_Name = emp_Name;
		this.emp_Address = emp_Address;
	}


	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", emp_Name=" + emp_Name + ", emp_Address=" + emp_Address + "]";
	}
	
	

}
