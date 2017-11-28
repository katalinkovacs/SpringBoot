package com.kati.controller;

import com.kati.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller2 {

    @RequestMapping("/method1")
    public String method1(){

        User user1 = new User();
        user1.setFirstName("Sebastian");
        user1.setLastName("Kovacs");

        return user1.getFirstName() ;

    }


    @RequestMapping("/method2")
    public String method2(){

        User user1 = new User("Sebastian", "Kovacs");


        return user1.getFirstName() + " " +user1.getLastName();


    }

    @Value("${sebi.user}")
    private String user;

    @RequestMapping("/method3")
    public String method3(){

        return user;
    }


}
