package com.springboot.utlis;

public interface ConstantSqlQueries {

	String SELECT_QUERY = "select * from emp_table";
	String INSERT_QUERY = "insert into emp_table(emp_name,emp_address) values(?,?)";
	String DELETE_QUERY = " delete from emp_table where id=?";
	String UPDATE_QUERY = "update emp_table set emp_address=?,emp_name=? where id=?";
	String GET_BY_ID = "select emp_name,emp_address from emp_table where id=?";

}
