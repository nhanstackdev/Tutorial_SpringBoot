package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("v1/api")
public class BaseController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello world !!!";
    }
}
