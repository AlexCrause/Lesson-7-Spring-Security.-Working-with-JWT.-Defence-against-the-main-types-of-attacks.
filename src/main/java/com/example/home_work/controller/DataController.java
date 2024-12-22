package com.example.home_work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DataController {

    @GetMapping("/private-data")
    public String privateData() {
        return "This is private data accessible only to ADMIN.";
    }

    @GetMapping("/public-data")
    public String publicData() {
        return "This is public data accessible to all authenticated users.";
    }

}