package com.test.mark.test_mark.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class InvalidRequestException extends RuntimeException{
    private String message;
    private String code;
}
