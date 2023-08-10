package com.example.orm.handler;

import com.example.orm.errors.Error;

public class ErrorResponse {

    private String errorKey;
    private String errorMsg;

    public ErrorResponse(){}
    public ErrorResponse(String errorKey, String errorMsg) {
        this.errorKey = errorKey;
        this.errorMsg = errorMsg;
    }

    public String getErrorKey() {
        return errorKey;
    }

    public void setErrorKey(String errorKey) {
        this.errorKey = errorKey;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
