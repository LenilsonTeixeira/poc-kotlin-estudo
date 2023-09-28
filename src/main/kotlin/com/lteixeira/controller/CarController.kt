package com.lteixeira.controller

import com.lteixeira.request.CarRequest
import com.lteixeira.response.CarResponse
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/cars")
@RestController
class CarController {

    @PostMapping
    fun saveCar(@RequestBody @Valid carRequest: CarRequest): CarResponse = CarResponse(carRequest.name, carRequest.color, carRequest.price)
}