package com.qx.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.qx.controller", "com.qx.common", "com.qx.repository"})
public class GameServer203Application {

    public static void main(String[] args) {
        SpringApplication.run(GameServer203Application.class, args);
    }

}
