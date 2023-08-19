package com.example.msingress15.controller;

import com.example.msingress15.model.request.AccountRequest;
import com.example.msingress15.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @PostMapping("/validate")
    public void validateAccount(@RequestBody AccountRequest account){
        accountService.validateAccount(account);
    }

}
