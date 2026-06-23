package com.kodegravity.httpdemo.controller;

import com.kodegravity.httpdemo.model.StudentResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/http")
public class StudentController {
    @GetMapping (value="/getAllStudents")
    public StudentResponse getAllStudents() throws URISyntaxException,
            IOException,InterruptedException{
        StudentController service = null;
        return service.getAllStudents();
    }



}
