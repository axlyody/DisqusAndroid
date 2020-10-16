package id.axlyody.disqusandroid.lib

import com.google.gson.GsonBuilder
import id.axlyody.disqusandroid.lib.request.*
import io.reactivex.schedulers.Schedulers
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class Disqus {

    companion object {
        private var config = DisqusConfig
        private var base_url = "https://disqus.com/api/3.0/"

        fun Threads() = load(getThreads::class.java) as getThreads
        fun Users() = load(getUsers::class.java) as getUsers
        fun Aet(): getAet = load(getAet::class.java) as getAet
        fun Apotechary() = load(getApotechary::class.java) as getApotechary
        fun Applications() = load(getApplications::class.java) as getApplications
        fun Category() = load(getCategory::class.java) as getCategory
        fun Exports() = load(getExports::class.java) as getExports


        private fun load(T: Class<*>) = Retrofit.Builder()
            .baseUrl(base_url)
            .client(okhttp())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler((Schedulers.io())))
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().setLenient().create()
                )
            )
            .build()
            .create(T)

        private fun okhttp(): OkHttpClient {
            var HttpUrl: HttpUrl
            return OkHttpClient()
                .newBuilder()
                .addInterceptor { chain ->
                    val request = chain.request()
                        .apply {
                            HttpUrl = url.newBuilder().apply {
                                config.apiKey()?.let {
                                    addQueryParameter("api_key", it)
                                } ?: run {
                                    addQueryParameter(
                                        "api_key",
                                        config.context().getString(R.string.disqus_default_api_key)
                                    )
                                }
                                config.accessToken()?.let {
                                    addQueryParameter(
                                        "access_token",
                                        it
                                    )
                                }

                            }.build()
                        }
                        .newBuilder()
                        .url(HttpUrl)
                        .build()

                    chain.proceed(request)
                }
                .addInterceptor(
                    HttpLoggingInterceptor()
                        .setLevel(
                            config.logLevel()
                        )
                )
                .build()
        }


    }
}
