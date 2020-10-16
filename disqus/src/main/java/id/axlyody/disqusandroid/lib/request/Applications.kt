package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.DisqusResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap
import java.util.*

interface getApplications {
    @GET("applications/listUsage.json")
    fun listUsage(
        @QueryMap params: HashMap<String, String>
    ): Call<DisqusResponse<HashMap<Date, Int>>>
}