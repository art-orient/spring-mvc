package com.itvdn.lesson7.controllers;

import com.itvdn.lesson7.dto.RequestBodyDTO;
import com.itvdn.lesson7.services.RequestBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {
    @Autowired
    private RequestBodyService requestBodyService;

    @GetMapping("/body")
    public ResponseEntity doSmthWithRequestBody(@RequestBody RequestBodyDTO requestBodyDTO) {
        return new ResponseEntity(requestBodyService.doSmth(requestBodyDTO), HttpStatus.OK);
    }
}
