package com.ironsource.aura.kronos.config.type.util

import com.ironsource.aura.kronos.utils.Response
import java.lang.reflect.Type

interface JsonConverter {
    fun toJson(obj: Any?): String?

    fun <T> fromJson(json: String?, clazz: Class<T>): Response<T, JsonException>

    fun <T> fromJson(json: String?, type: Type): Response<T, JsonException>
}

class JsonException(cause: Throwable) : Exception(cause)