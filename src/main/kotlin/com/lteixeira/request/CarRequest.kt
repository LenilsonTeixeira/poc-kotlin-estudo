package com.lteixeira.request

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

data class CarRequest(
                      @get:NotEmpty
                      val name: String,
                      @field:NotEmpty
                      val color: String,
                      @field:Min(0)
                      @field:NotNull
                      val price: BigDecimal)
