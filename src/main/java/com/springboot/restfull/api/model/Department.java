package com.springboot.restfull.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long deptId;
	public String deptName;

	@OneToMany(targetEntity =Employee.class ,cascade =  CascadeType.ALL)
	@JoinColumn(name="department_fk_id", referencedColumnName = "deptId")
	private List<Employee> employee;
	
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department() {
		super();
	}

}

