package com.lteixeira.controller

import com.lteixeira.BaseTest
import com.lteixeira.util.ReadFileUtil
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.hamcrest.Matchers.equalTo
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath

class CarControllerTest : BaseTest() {

    @Test
    fun test() {
        val mvcResult = mockMvc.perform(
            MockMvcRequestBuilders.post("/cars")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ReadFileUtil.read("__files/carRequest.json"))
        )
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(jsonPath("name", equalTo("ferrari")))
            .andExpect(jsonPath("color", equalTo("vermelho")))
            .andExpect(jsonPath("price", equalTo(1250000)))
            .andReturn()
    }
}