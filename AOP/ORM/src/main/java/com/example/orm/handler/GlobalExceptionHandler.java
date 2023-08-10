package com.example.orm.handler;

import com.example.orm.errors.Error;
import com.example.orm.execptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<?> RecordNotFoundException () {
        return new ResponseEntity<>(
                new ErrorResponse(Error.RecordNotFoundException.getErrorKey(), Error.RecordNotFoundException.getErrorMsg()), HttpStatus.NOT_FOUND);
    }


}
