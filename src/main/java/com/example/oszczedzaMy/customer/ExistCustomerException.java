package com.example.oszczedzaMy.customer;

public class ExistCustomerException extends RuntimeException {

    public ExistCustomerException(String message) {
        super(message);
    }
}
