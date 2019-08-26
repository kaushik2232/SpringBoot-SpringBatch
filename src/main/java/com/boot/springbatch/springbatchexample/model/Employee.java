package com.boot.springbatch.springbatchexample.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    private Integer id;
    private String Name;
    private String Dept;
    private Integer Salary;
    private Date Time;

    public Employee(Integer id, String name, String dept, Integer salary, Date time) {
        this.id = id;
        Name = name;
        Dept = dept;
        Salary = salary;
        Time = time;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(Name).append('\'');
        sb.append(", dept='").append(Dept).append('\'');
        sb.append(", salary=").append(Salary);
        sb.append('}');
        return sb.toString();
    }
}
