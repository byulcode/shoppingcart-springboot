package com.study.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "hello world";
    }
}
