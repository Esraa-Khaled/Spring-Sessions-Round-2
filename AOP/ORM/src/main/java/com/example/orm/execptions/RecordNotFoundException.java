package com.example.orm.execptions;

public class RecordNotFoundException extends RuntimeException{

    private String errorMessege;

    public RecordNotFoundException(String errorMessege) {
        this.errorMessege = errorMessege;
    }

    public RecordNotFoundException(String message, String errorMessege) {
        super(message);
        this.errorMessege = errorMessege;
    }
}
