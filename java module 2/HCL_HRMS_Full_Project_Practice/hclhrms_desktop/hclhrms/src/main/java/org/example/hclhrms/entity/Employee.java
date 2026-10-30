package org.example.hclhrms.entity;

import org.springframework.boot.SpringBootVersion;

public class Employee {
    private long  emp_id;
    private String emp_name;
    private String designation;

    public Employee(long emp_id, String emp_name, String designation, String progStack) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.designation = designation;
        this.progStack = progStack;
    }

    private String progStack;

    public Long getEmp_id() {
        return emp_id;
    }

    public String getProgStack() {
        return progStack;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setProgStack(String progStack) {
        this.progStack = progStack;
    }
}
