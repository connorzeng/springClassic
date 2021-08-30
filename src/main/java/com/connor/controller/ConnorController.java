package com.connor.controller;


import com.connor.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class ConnorController {



    @Autowired
    private ApplicationContext applicationContext;

    @Autowired(required = false)
    private UserDTO userDTO;

    @RequestMapping("/hello.do")
    @ResponseBody
    public Map<String,String> hello(){

        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name","connor");

        return objectObjectHashMap;
    }

}
