package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ping")
public class PingController {

    @GetMapping
    public String getPing(){
        return "OK";
    }
}
