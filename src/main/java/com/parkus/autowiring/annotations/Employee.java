package com.parkus.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired(required = false)
    @Qualifier("address2")
    private Address address;

    public Address getAddress() 
    {
        return address;
    }

    @Override
    public String toString() 
    {
        return "Employee [address=" + address + "]";
    }

}
