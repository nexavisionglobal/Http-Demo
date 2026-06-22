package com.kodegravity.httpdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class PostalCodesController1 {
    @RestController
    @RequestMapping("/postal")
    public class PostalCodesController {


        public String getPostalByPinCode() {
        String response = null;
        return response;
    }
}}
