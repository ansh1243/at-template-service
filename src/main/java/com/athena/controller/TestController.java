package com.athena.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by RAJ on 19-May-22.
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String testController() {
        return "Eureka Client application";
    }

}