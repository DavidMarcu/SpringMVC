package com.springtutorial.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "showed-form";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        String result = "Hello " + name.toUpperCase() +"!";
        model.addAttribute("greeting", result);
        return "processed-form";
    }

    @RequestMapping("/processFormV2")
    public String processFormV2(@RequestParam(value = "studentName")String name, Model model){
        String result = "Hello from V2! " + name.toUpperCase() +"!";
        model.addAttribute("greeting", result);
        return "processed-form";
    }
}
