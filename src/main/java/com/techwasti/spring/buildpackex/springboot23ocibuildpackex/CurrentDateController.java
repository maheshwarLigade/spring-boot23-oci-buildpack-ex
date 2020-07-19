package com.techwasti.spring.buildpackex.springboot23ocibuildpackex;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentDateController{

    @GetMapping("/gettodaysdate")
     public String getTodaysDate(){
        return new Date().toString();
     }
}