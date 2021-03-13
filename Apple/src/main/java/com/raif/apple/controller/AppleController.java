package com.raif.apple.controller;

import com.raif.apple.service.ServicePrototype;
import com.raif.apple.service.ServiceSingleton;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class AppleController {
    private final ApplicationContext applicationContext;

    @GetMapping("apple")
    public String test() {
        return "apple";
    }

    @GetMapping("prototype")
    public String prototype() {
        for (int i = 0; i < 10_000_000; i++) {
            ServicePrototype servicePrototype = applicationContext.getBean(ServicePrototype.class);

        }
        return "done";
    }

    @GetMapping("singleton")
    public String singleton() {
        for (int i = 0; i < 10_000_000; i++) {
            ServiceSingleton serviceSingleton = applicationContext.getBean(ServiceSingleton.class);
        }
        return "done";
    }
}
