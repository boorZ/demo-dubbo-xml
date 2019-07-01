package com.example.dubboconsumer;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

/**
 * 描 述: 请描述功能
 * 作 者: ZhouLin
 * 日 期: 创建时间: 2019/7/1 0001
 * 版 本: v1.0
 **/
@Component
public class SayService  {

    @Reference
    SayHello sayHello;

    public String say (String name) {

        return sayHello.sayHello(name);
    }

}