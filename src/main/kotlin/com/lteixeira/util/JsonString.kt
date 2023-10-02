package com.lteixeira.util

class JsonString {
    companion object {
        fun toObject(): String = """
                        {
                          "status": "APROVADO",
                          "descricao": "Aprovado sem restrições"
                        }
                   """.trimIndent()
    }
}