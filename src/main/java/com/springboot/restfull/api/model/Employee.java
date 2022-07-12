package com.springboot.restfull.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long EmpID;
	public String Name;	
	public String Job;
	public long Salary;
	
	/*
	 * @ManyToOne private Department department;
	 * 
	 * public Department getDepartment() { return department; }
	 */
	  
	  public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}