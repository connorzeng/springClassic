package com.connor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ConnorController {



    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name){

        return "hello";
    }

}
