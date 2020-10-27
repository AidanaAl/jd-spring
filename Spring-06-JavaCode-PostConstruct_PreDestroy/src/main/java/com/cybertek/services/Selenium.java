package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Selenium implements Course {

    @Override
    public void teachingHours() {
        System.out.println("Selenium weekly hours: 10");
    }

}
