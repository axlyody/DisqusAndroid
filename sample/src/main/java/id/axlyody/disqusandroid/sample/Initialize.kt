package id.axlyody.disqusandroid.sample

import android.app.Application
import id.axlyody.disqusandroid.lib.DisqusConfig
import okhttp3.logging.HttpLoggingInterceptor

class Initialize : Application() {
    override fun onCreate() {
        super.onCreate()
        DisqusConfig.apply {
            init(this@Initialize)
            setLogLevel(HttpLoggingInterceptor.Level.BODY)
        }
    }
}