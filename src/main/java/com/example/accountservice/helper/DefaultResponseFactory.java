package com.example.accountservice.helper;

import com.example.accountservice.model.BaseResponse;
import java.time.LocalDateTime;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class DefaultResponseFactory implements IResponseFactory {

  @Override
  public <T> ResponseEntity<BaseResponse<T>> success(T data) {
    return ResponseEntity.ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(
            BaseResponse.<T>builder()
                .code(SUCCESS_CODE)
                .message(SUCCESS_MESSAGE)
                .timestamp(LocalDateTime.now().toString())
                .data(data)
                .build());
  }
}
