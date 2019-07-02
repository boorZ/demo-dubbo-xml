package com.example.dubboservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object DubboServiceApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(DubboServiceApplication::class.java, *args)
    }

}
