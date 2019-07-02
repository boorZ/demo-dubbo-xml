package com.example.demodubboxml

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object DemoDubboXmlApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(DemoDubboXmlApplication::class.java, *args)
    }

}
