package id.axlyody.disqusandroid.lib.request

import retrofit2.http.*

interface Whitelists {

    @FormUrlEncoded
    @POST("whitelists/add.json")
    fun add(
        @Field("forum") forum: String,
        @FieldMap params: HashMap<String, String>
    )

    @GET("whitelists/list.json")
    fun list(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("whitelists/remove.json")
    fun remove(
        @Field("forum") forum: String,
        @FieldMap params: HashMap<String, String>
    )
}