package org.example.constructorDI;

public class Employee {
    private Address address;
//    creating a constructor
    public Employee(Address address){
        this.address = address;
    }
    public void getAddress(){
        address.getAddress();
    }
}
