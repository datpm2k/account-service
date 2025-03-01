package com.example.accountservice.service.impl;

import com.example.accountservice.config.AppProperties;
import com.example.accountservice.model.Account;
import com.example.accountservice.service.IAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private final AppProperties appProperties;

    @Override
    public List<Account> getAccounts() {
        List<Account> accountEntities = new ArrayList<>();
        accountEntities.add(
                Account.builder()
                        .accountNo("86868686")
                        .accountName("PHUNG MINH DAT")
                        .availableBalance(1000000)
                        .actualBalance(1000000)
                        .accountStatus("A")
                        .build()
        );
        accountEntities.add(
                Account.builder()
                        .accountNo("8888888")
                        .accountName("PHUNG MINH DAT")
                        .availableBalance(2500000)
                        .actualBalance(2500000)
                        .accountStatus("C")
                        .build()
        );
        return accountEntities;
    }
}
