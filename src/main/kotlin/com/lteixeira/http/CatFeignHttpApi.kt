package com.lteixeira.http

import com.lteixeira.response.FactResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "cat-client", url = "\${cat.api.url}", configuration = [CatFeignRequestInterceptor::class])
interface CatFeignHttpApi {
    @GetMapping("/facts")
    fun getFacts(): List<FactResponse>
}