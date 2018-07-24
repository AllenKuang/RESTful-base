package com.springboot.employeeapiboot;

import java.util.ArrayList;

public class EmployeeService {
    private ArrayList<Employee> employees;
    public EmployeeService(){
        this.employees=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void add(Employee employee){
        this.employees.add(employee);
    }
}
