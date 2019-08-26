package com.boot.springbatch.springbatchexample.batch;

import com.boot.springbatch.springbatchexample.model.Employee;
import com.boot.springbatch.springbatchexample.repository.EmployeeRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> employee) throws Exception {

        System.out.println("Data Saved for Employees: " + employee);
        employeeRepository.saveAll(employee);

    }
}
