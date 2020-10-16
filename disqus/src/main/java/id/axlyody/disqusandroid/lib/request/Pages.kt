package id.axlyody.disqusandroid.lib.request

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface Pages {
    @GET("pages/list.json")
    fun list(
        @Query("category") category: String,
        @QueryMap params: HashMap<String, String>
    )
}