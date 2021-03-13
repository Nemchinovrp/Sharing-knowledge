package com.raif.apple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppleController {

    @GetMapping("apple")
    public String test() {
        return "apple";
    }
}
