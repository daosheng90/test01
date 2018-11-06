package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {




@RequestMapping("test")
    public  String test01(){
return  "test";
    }

}
