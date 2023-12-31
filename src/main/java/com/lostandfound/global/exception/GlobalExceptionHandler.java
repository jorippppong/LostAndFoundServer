package com.lostandfound.global.exception;

import com.lostandfound.global.uniformApi.ApiResponse;
import com.lostandfound.global.uniformApi.code.status.ErrorStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({CustomException.class})
    protected ApiResponse<String> handleMemberException(CustomException ex){
        return ApiResponse.onFailure(ex.getErrorStatus(), null);
    }

    @ExceptionHandler({Exception.class})
    protected ApiResponse<String> handleServerException(){
        return ApiResponse.onFailure(ErrorStatus._INTERNAL_SERVER_ERROR, null);
    }
}
