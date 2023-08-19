package com.example.msingress15.mapper;

import com.example.msingress15.model.client.UserRequest;
import lombok.Builder;

public class UserMapper {
    public static UserRequest buildUserRequest(){
        return UserRequest.builder()
                .username("test-user")
                .age(18)
                .build();

    }
}
