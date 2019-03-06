package com.cg.restH2app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.restH2app.entity.Department;
import com.cg.restH2app.entity.Employee;
import com.cg.restH2app.repository.IEmployeeRepo;

@Service
public class ServiceImpl implements IService {

	@Autowired
	IEmployeeRepo employeeRepo ;
	
	public void setEmployeeRepository(IEmployeeRepo employeeRepo) {
		  this.employeeRepo = employeeRepo;
		 }
/*
	@Override
	public void saveDepartment(Department department) {
		employeeRepo.save(department);
		for(Employee e: department.getEmployee())
		{
			System.out.println(e.getDept().getDepId());
		}
		
	}*/
	

	

	
		
		@Override
	
	public ResponseEntity<?> saveDepartment(Department department) {
		
		System.out.println("in service just before saving");
		
		return new ResponseEntity<>(employeeRepo.saveAndFlush(department),HttpStatus.CREATED);
		
	}
@Override
public List<Department> retrieveDepartment() {
	List<Department> dep = employeeRepo.findAll();
	
	
	return dep;
}






	
	/*@Override
	public List<Employee> retrieveEmployees() {
		
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		
		Optional<Employee> 	emp = employeeRepo.findById(employeeId);
		return emp.get();
	}

	@Override
	public void saveEmployee(Employee employee) {
		//employeeRepo.save(employee);
		
		System.out.println(employee.getName());
		System.out.println(employee.getId()+" "+employee.getDepartment());
		employeeRepo.saveAndFlush(employee);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepo.deleteById(employeeId);

	}

	@Override
	public void updateEmployee(Employee employee, Employee emp) {
			if(employee.getDepartment()!=null)
			emp.setDepartment(employee.getDepartment());
			if(employee.getName()!=null)
			emp.setName(employee.getName());
			if(employee.getSalary()!=null)
			emp.setSalary(emp.getSalary());
			//employeeRepo.save(employee);

	}*/
	
	
	

}
