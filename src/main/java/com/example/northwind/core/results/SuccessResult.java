package com.example.northwind.core.results;

public class SuccessResult extends Result {

    public SuccessResult(boolean success) {
        super(success);
    }

    public SuccessResult(String message) {
        super(true, message);
    }
}
