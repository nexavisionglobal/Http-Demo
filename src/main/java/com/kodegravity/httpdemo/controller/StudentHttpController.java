package com.kodegravity.httpdemo.controller;

import com.kodegravity.httpdemo.model.StudentResponse;
import com.kodegravity.httpdemo.service.HttpStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/http")
@AllArgsConstructor
public class StudentHttpController {
    private final HttpStudentService service;

    @GetMapping(value="/getAllStudents")
    public StudentResponse getAllStudents() throws URISyntaxException,
            IOException, InterruptedException{
        return service.getAllStudents();
    }



}
