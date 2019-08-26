package com.boot.springbatch.springbatchexample.batch;

import com.boot.springbatch.springbatchexample.model.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("10", "Technology");
        DEPT_NAMES.put("20", "Operations");
        DEPT_NAMES.put("30", "Accounts");
    }

    @Override
    public Employee process(Employee employee) throws Exception {
        String deptCode = employee.getDept();
        String Dept = DEPT_NAMES.get(deptCode);
        employee.setDept(Dept);
        employee.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, Dept));
        return employee;
    }
}
