package com.redowan

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class Cat3MoviePlugin: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Cat3MovieProvider())
    }
}