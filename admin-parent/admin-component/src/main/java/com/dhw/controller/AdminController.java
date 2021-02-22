package com.dhw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/ssm.html")
    public String test(Model model){
        System.out.println("---------------");
        model.addAttribute("name","张三");
        return "test";
    }


}
