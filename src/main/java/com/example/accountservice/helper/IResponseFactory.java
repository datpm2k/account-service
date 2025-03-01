package com.example.accountservice.helper;

import com.example.accountservice.model.BaseResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public interface IResponseFactory {

    String SUCCESS_CODE = "00";
    String SUCCESS_MESSAGE = "Success";

    default <T> ResponseEntity<BaseResponse<T>> success(T data) {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BaseResponse.<T>builder()
                        .code(SUCCESS_CODE)
                        .message(SUCCESS_MESSAGE)
                        .data(data)
                        .build());
    }
}
