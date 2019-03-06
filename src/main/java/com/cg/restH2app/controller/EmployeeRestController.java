package com.cg.restH2app.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.restH2app.entity.Department;
import com.cg.restH2app.entity.Employee;
import com.cg.restH2app.service.IService;

@RestController
public class EmployeeRestController {
	
	
	@Autowired
	IService service;

	public void setService(IService service) {
		this.service = service;
	}
	
	@PostMapping("/api/department")
	 public void saveEmployee( @RequestBody Department department){
		
		Set<Employee> emp=department.getEmployee();
		for (Employee employee : emp) {
			department.addEmployee(employee);
			
		}
		
		
		service.saveDepartment(department);
		  System.out.println("Department as well as Employee Saved Successfully");
		 }
	
	
	@GetMapping("/api/department")
	public List<Department> getEmployees(){
		List<Department> employees = service.retrieveDepartment();
		return employees;
		
	}
	
	/*
	@GetMapping("/api/employees")
	public List<Employee> getEmployees(){
		List<Employee> employees = service.retrieveEmployees();
		return employees;
		
	}
	
	@GetMapping("/api/employees/getById")
	@ResponseBody
	public Employee getEmployee(@RequestParam(name = "employeeId") Long employeeId){		
		return service.getEmployee(employeeId);
	}
	
	@PostMapping("/api/employees")
	 public void saveEmployee( @RequestBody Employee  employee){
		  service.saveEmployee(employee);
		  System.out.println("Employee Saved Successfully");
		 }
	
	 
	  
	 @DeleteMapping("/api/employees/{employeeId}")
	  public void deleteEmployee(@PathVariable(name="employeeId")Long employeeId){
	   service.deleteEmployee(employeeId);
	   System.out.println("Employee Deleted Successfully");
	  }	 
	 
	@PutMapping("/api/employees/{employeeId}")
	 public void updateEmployee(@RequestBody Employee employee, @PathVariable(name="employeeId")Long employeeId){
	  Employee emp = service.getEmployee(employeeId);
	  if(emp != null){
		  System.out.println(employee.getDepartment() + " " + employee.getName());
	   service.updateEmployee(employee,emp);
	  }
	  
	  	}
	  */
	  
	
	
	   
	 
}
