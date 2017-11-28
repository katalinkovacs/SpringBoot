package com.kati.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller3 {

    @RequestMapping("/html")
    public String html(){

        return "<!DOCTYPE html> <html> <body> <h1>HTML</h1> <p>My first paragraph.</p> </body> </html>";

    }

    @Value("${html.msg}")
    private String msg;

    @RequestMapping("/html2")
    public String html2(){

        return msg;
    }


}
