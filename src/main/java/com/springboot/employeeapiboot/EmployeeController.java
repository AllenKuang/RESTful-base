package com.springboot.employeeapiboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class EmployeeController{
//    List<Employee> employees=new ArrayList<>();
//    Employee employee1=new Employee(0,"小明",20,"男");
//    employees.add(employee1);
    @RequestMapping("/hello")
    public String showHello(){
        return "hello";
    }
    @GetMapping("/employee")
    public Employee showEmployee(){
        Employee employee1=new Employee(0,"小明",20,"男");
        return employee1;
    }
    @GetMapping("/employees")
    public ArrayList<Employee> showEmployees(){
        Employee employee1=new Employee(0,"小明",20,"男");
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(employee1);
        return employees;
    }

    @PostMapping("/employees")
    public void postEmployee(){
        
    }
}
