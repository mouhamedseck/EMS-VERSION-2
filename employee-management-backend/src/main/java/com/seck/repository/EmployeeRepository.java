package com.seck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seck.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
