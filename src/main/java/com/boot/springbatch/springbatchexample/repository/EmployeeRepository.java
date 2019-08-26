package com.boot.springbatch.springbatchexample.repository;

import com.boot.springbatch.springbatchexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
