package com.itvdn.lesson6.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataBase {
    private Map<Integer, BookDAO> database;

    public DataBase() {
        database = new HashMap<>();
    }

    public void putBook (BookDAO bookDAO) {
        if (database.isEmpty()) {
            database.put(1, bookDAO);
        } else {
            database.put(database.size() + 1, bookDAO);
        }
    }

    public int getNumberOfBooks() {
        return database.size();
    }
}
