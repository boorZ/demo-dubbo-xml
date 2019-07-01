package com.example.dubboprovidertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider-two.xml"})
public class DubboProviderTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderTwoApplication.class, args);
    }

}
