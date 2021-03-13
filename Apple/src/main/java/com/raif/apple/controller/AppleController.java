package com.raif.apple.controller;

import com.raif.apple.service.ServicePrototype;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class AppleController {
    private final ObjectFactory<ServicePrototype> prototypeBeanObjectFactory;

    @GetMapping("apple")
    public String test() {
        return "apple";
    }

    @GetMapping("objects")
    public String create_objects() {
        for (int i = 0; i < 10_000_000; i++) {
            prototypeBeanObjectFactory.getObject();
        }
        return "done";
    }
}
