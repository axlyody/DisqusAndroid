package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface getApotechary {
    @GET("apothecary/suggest.json")
    fun suggest(
        @Query("posts") post: String
    ): Call<Response<String>>
}