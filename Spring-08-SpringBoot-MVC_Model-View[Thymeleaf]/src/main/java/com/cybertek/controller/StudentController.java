package com.cybertek.controller;

import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){
        System.out.println("Student class -> homePage method is running.");

        //carry the data to view we use interface: Model model
        //data carries from homePage -> "student/welcome"
        model.addAttribute("name", "Aidana");
        model.addAttribute("course", "Java");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        //create some student ID(0-1000) and show it in UI
        int studentId = new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        ///////////////////////////////////////
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        model.addAttribute("numbers", numbers);

        //print your birthday
        LocalDate birthday = LocalDate.now().minusYears(33).minusMonths(6).plusDays(17);
        model.addAttribute("birthday", birthday);

        //create an object from the pojo class "Student" and transfer this object to UI
        Student student = new Student(1,"Mike", "Smith");
        model.addAttribute("student", student);




        return "student/welcome";
    }

}
