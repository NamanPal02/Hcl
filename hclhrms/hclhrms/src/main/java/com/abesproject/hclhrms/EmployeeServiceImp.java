package com.abesproject.hclhrms;


import com.abesproject.hclhrms.entity.Employee;
import com.abesproject.hclhrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp {
    @Autowired
    private EmpRepoImp emprepo;
    public String addEmp(){
        Employee emp1 = new Employee("Rahul", 200, "FSD", "Java", "npal0202@gmail.com");
        return emprepo.addemp(emp1);
    }
    public List<Employee> getEmp(){
        return emprepo.getEmp();
    }

    public Employee getEmpById(long empid){
        emprepo.getEmpById(2000);
    }
}
