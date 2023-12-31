package com.example.msingress15.service;

import com.example.msingress15.client.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static com.example.msingress15.mapper.UserMapper.buildUserRequest;

@Service
@RequiredArgsConstructor
public class AsyncService {

    private final UserClient userClient;

    @Async
    public void saveUser(){
        userClient.saveUser(buildUserRequest());
    }
}
