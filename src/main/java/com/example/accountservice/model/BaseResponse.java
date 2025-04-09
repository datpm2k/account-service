package com.example.accountservice.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseResponse<T> {
  private String code;
  private String message;
  private String timestamp;
  private T data;
}
