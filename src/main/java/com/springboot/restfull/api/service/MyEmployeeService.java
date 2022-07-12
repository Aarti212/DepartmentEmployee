package com.springboot.restfull.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import com.springboot.restfull.api.model.Department;
import com.springboot.restfull.api.model.Employee;

public interface MyEmployeeService {
	

		public Department saveDept(Department dept, HttpStatus created);
		public Optional<Department> findEmpByDeptid(long id);
		public List<Department> showAllDeptEmp();
}
