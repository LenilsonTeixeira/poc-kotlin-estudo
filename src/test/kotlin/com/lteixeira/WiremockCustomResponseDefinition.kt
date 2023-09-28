package com.lteixeira

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

class WiremockCustomResponseDefinition {
    companion object {
        fun response(body: String, status: Int): ResponseDefinitionBuilder {
            return WireMock
                .aResponse()
                .withStatus(status)
                .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .withBodyFile(body);
        }
    }
}