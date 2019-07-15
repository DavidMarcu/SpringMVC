package com.springtutorial.springmvc.controller;

import com.springtutorial.springmvc.data.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(method = RequestMethod.GET)
    public String getStudentForm(Model model){
        model.addAttribute("student", new Student());
        return "student_form";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postStudentForm(@Valid @ModelAttribute Student student, Errors errors){
        if(errors.hasErrors()){
            return "student_form";
        }
        return "welcome_page";
    }
}
