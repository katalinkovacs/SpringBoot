package com.kati.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller1 {


    private String message = "Hello Kati!";

    @Value("${kati.message}")      //application.properties   --> kati.message
    private String message2;


    @Value("${kati.message.new}")
    private String messageNew;


    @RequestMapping("/")
    public String welcome(){

        return "Welcome my friend!";
    }


    @RequestMapping("/hello1")
     public String hello1(){

        return "Hello from hello1!";
    }


    @RequestMapping("/hello2")
    public String hello2(){

        return message;
    }



    @RequestMapping("/hello3")
    public String hello3(){

        return message2;
    }


    @RequestMapping("/hello4")
    public String hello4(){

        return messageNew;
    }



}
