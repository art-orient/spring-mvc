package com.itvdn.lesson6.services;

import com.itvdn.lesson6.domain.BookDAO;
import com.itvdn.lesson6.domain.DataBase;
import com.itvdn.lesson6.dto.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private DataBase dataBase;

    public void createBook (CreateBookRequest createBookRequest) {
        BookDAO bookDAO = new BookDAO(createBookRequest.getName(), createBookRequest.getAuthor());
        dataBase.putBook(bookDAO);
    }

    public int getNumbersOfBooks() {
        return dataBase.getNumberOfBooks();
    }
}
