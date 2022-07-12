package com.springboot.restfull.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restfull.api.model.Department;
import com.springboot.restfull.api.model.Employee;
import com.springboot.restfull.api.service.MyEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	public MyEmployeeService myemployeeservice;
	
	 
		@PostMapping("emp/add") 
		public Department addEmpDetails(@RequestBody Department dept) 
		{ 
			return myemployeeservice.saveDept(dept,HttpStatus.CREATED); }
		
		//service to show the list of emp for the given department
		@GetMapping("emp/{dptId}")
		public Optional<Department> findEmpOfDept(@PathVariable (name="dptId") long id){
			 System.out.println("inside contrller" +id);
			return myemployeeservice.findEmpByDeptid(id);
		}
		
		@GetMapping("dept/emp")
		public List<Department> showAll() {
			return myemployeeservice.showAllDeptEmp();
		}
}
