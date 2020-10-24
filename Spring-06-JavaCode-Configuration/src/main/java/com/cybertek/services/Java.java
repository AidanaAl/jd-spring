package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java Weekly teaching hours: 20");
    }

    @Value("JD1")
    private String batch;

    @Value("${days}")
    private String[]days;

    @Value("${instructor")
    private String instructor;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", days=" + Arrays.toString(days) +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
