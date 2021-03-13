package com.raif.apple.service;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Data
@Service
@Scope("prototype")
public class ServicePrototype {
    private String test;
}
