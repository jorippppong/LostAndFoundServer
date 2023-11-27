package com.lostandfound.global.uniformApi.code;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public class ErrorReasonDto {
    private Boolean isSuccess;
    private String code;
    private String message;
    private HttpStatus httpStatus;
}
