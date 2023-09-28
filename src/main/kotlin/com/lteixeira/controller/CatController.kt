package com.lteixeira.controller

import com.lteixeira.http.CatFeignHttpApi
import com.lteixeira.response.FactResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CatController(private val catFeignHttpApi: CatFeignHttpApi) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/facts")
    fun getFacts(): List<FactResponse> = catFeignHttpApi.getFacts()
}