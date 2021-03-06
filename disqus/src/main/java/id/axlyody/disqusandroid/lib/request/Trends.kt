package id.axlyody.disqusandroid.lib.request

import retrofit2.http.GET
import retrofit2.http.QueryMap

interface getTrends {
    @GET("trends/listThreads.json")
    fun listThreads(
        @QueryMap params: HashMap<String, String>
    )
}