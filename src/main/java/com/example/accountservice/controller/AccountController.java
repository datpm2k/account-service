package com.example.accountservice.controller;

import com.example.accountservice.model.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping
public class AccountController {

    private static final List<Account> accounts;

    private final Environment environment;

    static {
        accounts = new ArrayList<>();
        accounts.add(
                Account.builder()
                        .accountNo("86868686")
                        .accountName("PHUNG MINH DAT")
                        .availableBalance(1000000)
                        .actualBalance(1000000)
                        .build()
        );
        accounts.add(
                Account.builder()
                        .accountNo("8888888")
                        .accountName("PHUNG MINH DAT")
                        .availableBalance(2500000)
                        .actualBalance(2500000)
                        .build()
        );
    }

    @GetMapping(path = "/accounts")
    public ResponseEntity<List<Account>> getAccounts() {
        log.info("environments: {}", Arrays.toString(environment.getActiveProfiles()));
        return ResponseEntity.ok(accounts);
    }
}
