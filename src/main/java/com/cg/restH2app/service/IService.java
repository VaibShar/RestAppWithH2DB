package com.cg.restH2app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.restH2app.entity.Department;
import com.cg.restH2app.entity.Employee;

public interface IService {

	
	/*public List<Employee> retrieveEmployees();
	  
	 public Employee getEmployee(Long employeeId);
	  
	 public void saveEmployee(Employee employee);
	  
	 public void deleteEmployee(Long employeeId);
	  
	// public void updateEmployee(Employee employee);

	 public void updateEmployee(Employee employee, Employee emp);*/

     public ResponseEntity<?> saveDepartment(Department department);
	// public void saveDepartment(Department department);
     public List<Department> retrieveDepartment();
}
