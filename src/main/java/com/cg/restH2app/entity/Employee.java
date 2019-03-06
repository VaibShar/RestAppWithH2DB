package com.cg.restH2app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private long id;
	  
	 @Column(name="EMPLOYEE_NAME")
	 private String name;
	  
	 @Column(name="EMPLOYEE_SALARY")
	 private int salary;
	  
/*	 @Column(name="DEPARTMENT")
	 private String department;*/
	 
	 
	 @ManyToOne
	// @JoinColumn(name = "dep_id")
	// @JsonBackReference
	 private Department department;
	 
	 
	public Employee() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return department;
	}

	public void setDept(Department department) {
		this.department = department;
	}

	public Employee( String name, Integer salary, Department department) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	/*public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	 */
	
	
	 
	 
	
	
}
