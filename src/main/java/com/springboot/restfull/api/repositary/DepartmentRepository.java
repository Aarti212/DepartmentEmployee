package com.springboot.restfull.api.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restfull.api.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	

}
