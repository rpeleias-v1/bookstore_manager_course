package com.rodrigopeleias.bookstoremanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends Exception {

    public BookNotFoundException(Long id) {
        super(String.format("Book with Id not found", id));
    }
}
