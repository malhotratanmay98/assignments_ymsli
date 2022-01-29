package com.bookapp.model.exceptions;

public class BookNotFoundException extends RuntimeException {

	 
    public BookNotFoundException(String message) {
        super(message);
    }
	
}
