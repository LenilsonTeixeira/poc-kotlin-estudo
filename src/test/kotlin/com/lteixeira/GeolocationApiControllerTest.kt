package com.lteixeira

import com.fasterxml.jackson.module.kotlin.readValue
import com.github.tomakehurst.wiremock.client.WireMock
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.lteixeira.response.GeolocationResponse
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@WireMockTest(httpPort = 1111)
class GeolocationApiControllerTest : BaseTest(){

    @Test
    fun test_something_with_wiremock() {

        stubFor(get(WireMock.urlPathMatching("/v3/81d77d34-f29d-4bb3-93de-6d30e557beb6"))
            .willReturn(WiremockCustomResponseDefinition.response("response.json", HttpStatus.OK.value())))

        val mvcResult = mockMvc.perform(
            MockMvcRequestBuilders.get("/geolocation")
                .contentType(MediaType.APPLICATION_JSON)
        )
            .andExpect(status().isOk())
            .andReturn()

         val geolocationResponse : GeolocationResponse = mapper.readValue(mvcResult.getResponse().getContentAsString())

        Assertions.assertEquals("success", geolocationResponse.status)
        Assertions.assertEquals("Brazil", geolocationResponse.country)
        Assertions.assertEquals("Campinas", geolocationResponse.city)
        Assertions.assertEquals("192.168.0.0", geolocationResponse.ip)

    }
}