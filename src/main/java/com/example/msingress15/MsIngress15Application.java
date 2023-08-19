package com.example.msingress15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableFeignClients
@EnableAsync
public class MsIngress15Application {
    public static void main(String[] args) {
        SpringApplication.run(MsIngress15Application.class, args);

    }
}
