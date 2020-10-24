package com.cybertek.services;

import com.cybertek.interfaces.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Java implements Course {

    //Field Injection
    @Autowired
    private OfficeHours officeHours;

    /*//Constractor Injection
    @Autowired // autowired annotation on top of the constractor
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    /*/Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }*/


    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching: "+(30+ officeHours.getHours()));
    }
}
