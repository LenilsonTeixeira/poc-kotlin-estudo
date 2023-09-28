package com.lteixeira.controller

import com.lteixeira.http.CityFeignHttpApi
import com.lteixeira.response.GeolocationResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("geolocation")
class GeolocationApiController {

    @Autowired
    lateinit var cityFeignHttpApi: CityFeignHttpApi

    @GetMapping
    fun execute(): GeolocationResponse {
        val response = cityFeignHttpApi.getCity()
        return GeolocationResponse(city = response.city, country = response.country, status = response.status, ip = "192.168.0.0")
    }
}