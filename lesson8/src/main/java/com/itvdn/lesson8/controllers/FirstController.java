package com.itvdn.lesson8.controllers;

import com.itvdn.lesson8.exception.FirstTestException;
import com.itvdn.lesson8.exception.SecondException;
import com.itvdn.lesson8.exception.ThirdException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/first")
    public void firstTest() throws FirstTestException {
        throw new FirstTestException();
    }

    @GetMapping("/second")
    public void secondTest() throws SecondException {
        throw new SecondException();
    }

    @GetMapping("/third")
    public void thirdTest() throws ThirdException {
        throw new ThirdException();
    }
}

