package com.springboot.restfull.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.restfull.api.model.Department;
import com.springboot.restfull.api.model.Employee;
import com.springboot.restfull.api.repositary.DepartmentRepository;
import com.springboot.restfull.api.repositary.EmployeeRepository;

@Service
public class MyEmployeeServiceImpl implements MyEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private DepartmentRepository departmentRepo;

	@Override
	public Department saveDept(Department dept, HttpStatus created) {
		return departmentRepo.save(dept);
	}

	@Override
	public Optional<Department> findEmpByDeptid(long id) {
		return departmentRepo.findById(id);
	}

	@Override
	public List<Department> showAllDeptEmp() {
		return departmentRepo.findAll();
	}
	 


}
