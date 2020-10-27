package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {


    @Override
    public void teachingHours() {
        System.out.println("Java weekly hours: 20");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing Post Construct method");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing Pre Destroy method");
    }
}
