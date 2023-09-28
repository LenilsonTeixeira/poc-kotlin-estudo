package com.lteixeira.http

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class CatFeignRequestInterceptor : RequestInterceptor {

    @Value("\${rapid-api.authorization.key}")
    private val rapidApiKey: String? = null

    override fun apply(template: RequestTemplate?) {
        template?.header("X-RapidAPI-Key", rapidApiKey);
    }

}