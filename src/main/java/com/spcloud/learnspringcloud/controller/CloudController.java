package com.spcloud.learnspringcloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CloudController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello()
    {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
