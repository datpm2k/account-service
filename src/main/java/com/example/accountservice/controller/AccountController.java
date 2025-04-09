package com.example.accountservice.controller;

import com.example.accountservice.helper.IResponseFactory;
import com.example.accountservice.model.Account;
import com.example.accountservice.model.BaseResponse;
import com.example.accountservice.service.IAccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

  private final IResponseFactory iResponseFactory;
  private final IAccountService iAccountService;

  @GetMapping
  public ResponseEntity<BaseResponse<List<Account>>> getAccounts() {
    return iResponseFactory.success(iAccountService.getAccounts());
  }
}
