package com.crudthymleaf.thymleaf.controller;

import com.crudthymleaf.thymleaf.model.Student;
import com.crudthymleaf.thymleaf.service.StudentService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getListOfStudent(Model model) {

        model.addAttribute("students", service.getStudentList());

        return "list";

    }
}
