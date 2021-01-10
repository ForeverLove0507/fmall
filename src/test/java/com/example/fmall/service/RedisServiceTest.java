package com.example.fmall.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisServiceTest{

    @Autowired
    RedisService redisService;

    @Test
    void set() {
        redisService.set("123", "111");
        String s = redisService.get("123");
        System.out.println(s);
    }

    @Test
    void get() {
    }

    @Test
    void expire() {
    }

    @Test
    void remove() {
    }

    @Test
    void increment() {
    }
}