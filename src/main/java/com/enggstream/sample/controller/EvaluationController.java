package com.enggstream.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EvaluationController {

    @GetMapping
    public String getMessage(){
        return "hello welcome";
    }
}
