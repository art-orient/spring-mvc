package com.itvdn.lessonFive.controllers;

import com.itvdn.lessonFive.UsersStorage;
import com.itvdn.lessonFive.dtos.PutUserRequest;
import com.itvdn.lessonFive.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidationController {
    private UsersStorage usersStorage;

    public ValidationController(UsersStorage usersStorage) {
        this.usersStorage = usersStorage;
    }

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public UserDTO getUserById (@RequestParam (value = "id") int id) {
        return usersStorage.getUserById(id);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public ResponseEntity putUser (@Validated @RequestBody PutUserRequest putUserRequest) {
        usersStorage.putUser(putUserRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
}
