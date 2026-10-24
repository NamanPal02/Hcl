package com.example.hrmsdatabase.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.hrmsdatabase.model.Employee;
import com.example.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String msg(){
        return "<h2> Welcome to Springboot App Development</h2>";
    }
    @GetMapping("/addemp")
    public String addNewEmployee(){
        return employeeService.createNewEmployee();
    }
    @GetMapping ("findById/{empid}")
    public Employee getEmpById(@PathVariable long empid){

        return employeeService.getEmployeeById(empid);
    }

    @DeleteMapping("/dltById/{empid}")
    public String dltById(@PathVariable long empid) {
        return employeeService.dltById(empid);
    }
}
