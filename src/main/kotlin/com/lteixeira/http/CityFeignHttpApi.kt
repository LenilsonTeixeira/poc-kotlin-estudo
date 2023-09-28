package com.lteixeira.http

import com.lteixeira.response.CityResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "city-client", url = "\${city.api.url}")
interface CityFeignHttpApi {

    @GetMapping("/v3/81d77d34-f29d-4bb3-93de-6d30e557beb6")
    fun getCity() : CityResponse

}