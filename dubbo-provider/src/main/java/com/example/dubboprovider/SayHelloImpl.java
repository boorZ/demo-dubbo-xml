package com.example.dubboprovider;

import org.springframework.stereotype.Service;

/**
 * 描 述: 请描述功能
 * 作 者: ZhouLin
 * 日 期: 创建时间: 2019/7/1 0001
 * 版 本: v1.0
 **/
@Service
public class SayHelloImpl implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}