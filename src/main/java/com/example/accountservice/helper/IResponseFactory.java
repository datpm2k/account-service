package com.example.accountservice.helper;

import com.example.accountservice.model.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface IResponseFactory {

  String SUCCESS_CODE = "00";
  String SUCCESS_MESSAGE = "Success";

  <T> ResponseEntity<BaseResponse<T>> success(T data);
}
