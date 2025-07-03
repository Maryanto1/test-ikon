package com.test.mark.test_mark.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ProcessException extends RuntimeException {
    private final HttpStatus httpStatus;
    private final String code;
    private final String responseMessage;

    public ProcessException(String code, String responseMessage) {

        this.responseMessage = responseMessage;
        this.httpStatus = HttpStatus.BAD_REQUEST;
        this.code = code;
    }

}
