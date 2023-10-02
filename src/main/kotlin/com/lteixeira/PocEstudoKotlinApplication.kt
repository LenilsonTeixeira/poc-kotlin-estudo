package com.lteixeira

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.lteixeira.domain.StatusNO
import com.lteixeira.util.JsonString
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class PocEstudoKotlinApplication

fun main(args: Array<String>) {
	val mapper = jacksonObjectMapper()
	val status = mapper.readValue<StatusNO>(JsonString.toObject())
	println(status)
	runApplication<PocEstudoKotlinApplication>(*args)
}
