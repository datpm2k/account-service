package com.example.accountservice.service;

import com.example.accountservice.model.Account;
import java.util.List;

public interface IAccountService {

  List<Account> getAccounts();
}
