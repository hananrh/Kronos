package com.ironsource.aura.kronos.config

import android.content.res.Resources
import com.ironsource.aura.kronos.utils.getAny
import com.ironsource.aura.kronos.utils.getLong
import com.ironsource.aura.kronos.utils.getStringSet

data class ResourcesResolver<T>(
        val resourcesGetter: Resources.(Int) -> T) {

    companion object {
        val Int = ResourcesResolver(Resources::getInteger)
        val Long = ResourcesResolver(Resources::getLong)
        val Float = ResourcesResolver(Resources::getFloat)
        val Boolean = ResourcesResolver(Resources::getBoolean)
        val String = ResourcesResolver(Resources::getString)
        val StringSet = ResourcesResolver(Resources::getStringSet)
        val Any = ResourcesResolver(Resources::getAny)
    }
}