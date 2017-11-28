package com.kati.controller;

import com.kati.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller4 {

    @RequestMapping("/msg1")
    public String msg1(){

        return "Hello!";
    }


    @RequestMapping("/msg2")
    public String msg2(){

        User user = new User();
        user.setFirstName("Sebastian");
        user.setLastName("Kovacs");

        return "Hello " +user.getFirstName() +" " +user.getLastName();
    }

    @Value("${msg3.user}")
    private String user;

    @RequestMapping("/msg3")
    public String msg3(){

        return "Hello " +user;
    }
}
