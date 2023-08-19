package com.example.msingress15.service;

import com.example.msingress15.client.UserClient;
import com.example.msingress15.model.request.AccountRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static com.example.msingress15.mapper.UserMapper.buildUserRequest;
import static com.example.msingress15.model.constant.CurrencyConstant.eligibleCurrencies;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AsyncService asyncService;

    public void validateAccount(AccountRequest account) {
        if (!eligibleCurrencies.contains(account.getCurrency())) {
            throw new RuntimeException("NOT_ELIGIBLE_CURRENCY");
        }
        asyncService.saveUser();
    }
}
