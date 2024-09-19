package org.mumin.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.mumin.beans.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

  @Override
  public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
    Employee employee = new Employee();
    employee.setEmpId(rs.getInt("emp_id"));
    employee.setEmpName(rs.getString("emp_name"));
    employee.setEmpDesignation(rs.getString("emp_designation"));
    return employee;
  }
}
