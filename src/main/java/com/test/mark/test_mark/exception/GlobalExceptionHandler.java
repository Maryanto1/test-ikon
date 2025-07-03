package com.test.mark.test_mark.exception;

import com.test.mark.test_mark.dto.base.BaseResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ProcessException.class)
    public ResponseEntity<Object> handleProcessException(ProcessException e) {

        var responseCode = e.getHttpStatus().value() + e.getCode() ;

        var baseResponseDTO = BaseResponseDto.builder()
                .responseCode(responseCode)
                .responseMessage(e.getResponseMessage())
                .build();

        return new ResponseEntity<>(baseResponseDTO, e.getHttpStatus());
    }

}
