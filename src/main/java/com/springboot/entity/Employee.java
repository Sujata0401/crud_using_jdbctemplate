package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empTable")
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "emp_Name")
	private String empName;

	@Column(name = "emp_Address")
	private String empAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}

	public Employee(Integer id, String empName, String empAddress) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
