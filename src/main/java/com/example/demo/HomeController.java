package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/")
    public String loadPage() {


        int myNumber;
        double myOtherNumber;


        myNumber = 2;
        myOtherNumber = 1.7938;

        System.out.println("myNumber = 2");
        System.out.println("myOtherNumber = 1.7938");
        return "confirm";
    }


}








