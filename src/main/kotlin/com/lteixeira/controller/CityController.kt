package com.lteixeira.controller

import com.lteixeira.http.CityFeignHttpApi
import com.lteixeira.response.CityResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CityController(private val cityFeignHttpApi: CityFeignHttpApi) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/cities")
    fun getCity(): CityResponse = cityFeignHttpApi.getCity()
}