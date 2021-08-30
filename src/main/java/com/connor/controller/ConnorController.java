package com.connor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ConnorController {



    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,String> hello(String name){

        Map<String,String> result = new HashMap<>();
        result.put("name","connor");

        return result;
    }

}
