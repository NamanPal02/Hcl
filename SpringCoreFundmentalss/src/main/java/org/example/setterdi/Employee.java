package org.example.setterdi;

public class Employee {
    private Address address;



//    using setter here
    public void setAddress(Address address){
        this.address = address;
    }

    public void displayAddress(){
        address.getAddress();

    }
}
