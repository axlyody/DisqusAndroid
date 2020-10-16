package id.axlyody.disqusandroid.lib.request

import retrofit2.http.*

interface Blacklist {
    @FormUrlEncoded
    @POST("blacklist/add.json")
    fun add(
        @Field("forum") forums: Forums,
        @FieldMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("blacklist/backfillCounters.json")
    fun backfillCounters(

    )

    @GET("blacklist/list.json")
    fun list(
        @Query("forum") forums: Forums,
        @FieldMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("blacklist/remove.json")
    fun remove(
        @Field("forum") forums: Forums,
        @FieldMap params: HashMap<String, String>
    )


}