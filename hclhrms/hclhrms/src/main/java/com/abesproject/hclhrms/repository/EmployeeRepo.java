package com.abesproject.hclhrms.repository;


import com.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
     String addemp(Employee employee);

     String addEmpbulk(List<Employee> bulkEmp);
     List<Employee> getEmp();
     Employee getEmpById(long empid);
     String deleteById(long empid);

     String updateById(long emp, Employee updatedEmp);
}
