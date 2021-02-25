package com.itvdn.lesson6.controllers;

import com.itvdn.lesson6.dto.CreateBookRequest;
import com.itvdn.lesson6.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PutMapping("/books/create")
    public ResponseEntity putBook (@RequestBody CreateBookRequest createBookRequest) {
        bookService.createBook(createBookRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/books/numbers")
    public ResponseEntity getNumberOfBooks () {
        int numberOfBooks = bookService.getNumbersOfBooks();
        return new ResponseEntity(numberOfBooks, HttpStatus.OK);
    }
}
