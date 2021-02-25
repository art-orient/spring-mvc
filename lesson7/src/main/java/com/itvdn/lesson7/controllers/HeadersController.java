package com.itvdn.lesson7.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeadersController {

    @GetMapping("/headers")
    public ResponseEntity doSmthWithHeader(@RequestHeader("TEST") String header) {
        return new ResponseEntity(header + "rendered", HttpStatus.OK);
    }
}
