package net.kibotu.base.misc

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.webkit.WebSettings
import android.webkit.WebView

/**
 * Created by [Jan Rabe](https://about.me/janrabe).
 *
 *
 * http://matsuhilog.blogspot.jp/2013/05/performance-analytics-in-android.html
 * https://code.google.com/p/codenameone/issues/detail?id=294
 */
object DefaultUserAgent {

    fun getDefaultUserAgent(context: Context): String {
        var ua: String
        if (Build.VERSION.SDK_INT >= 17) {
            ua = getWebSettingsDefaultUserAgent(context)
        } else if (Build.VERSION.SDK_INT >= 16) {
            ua = getUserAgent(context)
        } else {
            try {
                val constructor = WebSettings::class.java.getDeclaredConstructor(
                        Context::class.java, WebView::class.java)
                constructor.isAccessible = true
                try {
                    val settings = constructor.newInstance(context, null)
                    ua = settings.userAgentString
                } finally {
                    constructor.isAccessible = false
                }
            } catch (e: Exception) {
                ua = WebView(context).settings.userAgentString
            }

        }
        return ua
    }

    @SuppressLint("NewApi")
    private fun getWebSettingsDefaultUserAgent(context: Context): String {
        return WebSettings.getDefaultUserAgent(context)
    }

    private fun getUserAgent(context: Context): String {
        var userAgent: String
        try {
            @SuppressWarnings("unchecked")
            val clz = Class.forName("android.webkit.WebSettingsClassic") as Class<out WebSettings>
            val constructor = clz.getDeclaredConstructor(
                    Context::class.java, Class.forName("android.webkit.WebViewClassic"))
            constructor.isAccessible = true
            try {
                val settings = constructor.newInstance(context, null)
                userAgent = settings.userAgentString
            } finally {
                constructor.isAccessible = false
            }
        } catch (e: Exception) {
            userAgent = WebView(context).settings.userAgentString
        }

        return userAgent
    }
}
