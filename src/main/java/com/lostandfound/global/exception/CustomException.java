package com.lostandfound.global.exception;


import com.lostandfound.global.uniformApi.code.status.ErrorStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CustomException extends RuntimeException{
    private final ErrorStatus errorStatus;
}
