package com.cg.restH2app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.restH2app.entity.Department;
import com.cg.restH2app.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Department, Long>{
	

}
