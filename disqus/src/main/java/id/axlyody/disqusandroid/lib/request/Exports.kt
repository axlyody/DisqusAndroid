package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.DisqusResponse
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface getExports {
    @FormUrlEncoded
    @POST("exports/exportForum.json")
    fun exportForum(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    ): Call<DisqusResponse<String>>
}