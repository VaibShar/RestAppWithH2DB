package com.cg.restH2app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dep_id")
	private long depId;
	
	@Column(name="loc")
	private String loc;
	
	@OneToMany(mappedBy = "department", cascade= CascadeType.ALL)
	private Set<Employee> employee  = new HashSet<Employee>();
	
	public Department() {

	}

	public Department(String loc) {
		this.loc = loc;
		
	}
	public long getDepId() {
		return depId;
	}

	public void setDepId(long depId) {
		this.depId = depId;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	public void addEmployee(Employee e)
	{
		employee.add(e);
		e.setDept(this);
	}
	

}
