package com.lteixeira

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class PocEstudoKotlinApplication

fun main(args: Array<String>) {
	runApplication<PocEstudoKotlinApplication>(*args)
}
