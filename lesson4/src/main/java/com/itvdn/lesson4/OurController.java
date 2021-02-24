package com.itvdn.lesson4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OurController {
    @RequestMapping (path = "/getsmth", method = RequestMethod.GET)
    public String getSmth () {
        return "hello";
    }
}
