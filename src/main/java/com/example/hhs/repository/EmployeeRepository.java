package com.example.hhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hhs.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
