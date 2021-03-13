package com.raif.Banana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class BananaController {

    @GetMapping("banana")
    public String test() {
        return "banana";
    }
}
