package com.gpc.jodhpur.gym.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gym")
public class TestController {

    @GetMapping(value = "/ping")
    public String test() {
        return "Hey buddy!! I am working fine.";
    }
}
