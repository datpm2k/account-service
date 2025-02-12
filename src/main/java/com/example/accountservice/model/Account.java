package com.example.accountservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private String accountNo;
    private long availableBalance;
    private long actualBalance;
}
