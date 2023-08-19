package com.example.msingress15.client;

import com.example.msingress15.model.client.UserRequest;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "!default")
@Service
public class UserClientMock implements UserClient{
    @Override
    public void saveUser(UserRequest user) {
        System.out.println("Assume everything is okay");
    }
}
