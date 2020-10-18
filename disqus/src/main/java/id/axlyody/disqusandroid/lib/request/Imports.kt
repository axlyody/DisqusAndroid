package id.axlyody.disqusandroid.lib.request

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface getImports {

    @GET("imports/details.json")
    fun imports(
        @QueryMap params: HashMap<String, String>
    )

    @GET("imports/list.json")
    fun list(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )
}