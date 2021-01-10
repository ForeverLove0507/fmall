package com.example.fmall.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisServiceTest{

    @Autowired
    RedisService redisService;

    @Test
    public void set() {
        redisService.set("123", "111");
        String s = redisService.get("123");
        System.out.println(s);
    }

}