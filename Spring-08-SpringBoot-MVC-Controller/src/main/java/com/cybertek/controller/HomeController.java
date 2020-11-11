package com.cybertek.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/aidana")
    public String getRequestMapping2(){
        return "home";

    }
    @RequestMapping(method = RequestMethod.POST, value = "/aidana")
    public String getRequestMapping3(){
        return "home";

    }

    @GetMapping("/spring")
    public String getRequestMappingEx(){
        return "home";

    }
    @PostMapping("/spring")
    public String getRequestMappingEx2(){
        return "home";

    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("Name is: "+name);
        return "home";

    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("Course is: "+course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParam2(@RequestParam(value = "name", required = false, defaultValue = "Cybertek") String name){
        System.out.println("requestParam2 -> Name is: "+name);
        return "home";
    }

    @RequestMapping("/cybertek")
    public String getRequestMappingC(){
        return "cybertek";

    }

}
