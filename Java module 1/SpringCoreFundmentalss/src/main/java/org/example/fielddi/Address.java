package org.example.fielddi;

import org.springframework.stereotype.Component;

@Component // creates the object of the class automatically and creates java bean , also manages its lifecycle automatically
public class Address {
    public String getAddress(){
        return "Crossing Republic, Ghaziabad";
    }
}
