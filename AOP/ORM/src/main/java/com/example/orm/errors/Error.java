package com.example.orm.errors;

public enum Error {

    GolabException("000", "Contact System Admin"),
    RecordNotFoundException("001", "Record Not Found");
    public String errorKey;
    public String errorMsg;

    Error() {
    }
    Error(String errorKey, String errorMsg) {
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
