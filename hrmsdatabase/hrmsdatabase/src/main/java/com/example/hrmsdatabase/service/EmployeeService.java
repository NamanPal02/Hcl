package com.example.hrmsdatabase.service;

import com.example.hrmsdatabase.model.Employee;
import com.example.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;
    public String createNewEmployee(){
        Employee emp1 = new Employee(200l, "Ram", "JAVA FSD", "developer");
        employeeRepository.save(emp1);
        return "Employee is added successfully";
    }
    public Employee getEmployeeById(long empid){
        return employeeRepository.findById(empid).orElse(null);
    }
    public String dltById(long empid) {
        if (employeeRepository.existsById(empid)) {
            employeeRepository.deleteById(empid);
            return "Employee deleted successfully";
        }
        return "Employee not found with ID: " + empid;
    }
}
