package com.abes.hrms.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo {
//    declaring two methods
    double squareroot(double d);
    String empData();
    public int add(int a , int b);
}
