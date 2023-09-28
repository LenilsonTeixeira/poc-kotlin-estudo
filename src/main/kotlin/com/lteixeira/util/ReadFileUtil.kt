package com.lteixeira.util

import org.springframework.core.io.ClassPathResource
import org.springframework.util.FileCopyUtils
import java.io.InputStream

class ReadFileUtil {
    companion object {
        fun read(file: String): ByteArray {
            try {
                val inputStream: InputStream = ClassPathResource(file).inputStream
                return FileCopyUtils.copyToByteArray(inputStream)
            } catch (e: Exception) {
                throw RuntimeException("Erro ao processar ${file}")
            }
        }
    }
}