package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.Response
import retrofit2.Call
import retrofit2.http.*

interface getAet {
    @FormUrlEncoded
    @POST("aet/anonymousSubscribe.json")
    fun anonymousSubscribe(
        @Field("email") email: String,
        @Field("forum") forum: String
    ): Call<Response<String>>

    @FormUrlEncoded
    @POST("aet/dismiss.json")
    fun dismiss(
        @Field("forum") forum: String
    ): Call<Response<String>>

    @FormUrlEncoded
    @POST("aet/export.json")
    fun export(
        @Field("forum") forum: String,
        @FieldMap params: HashMap<String, String>
    ): Call<Response<String>>

    @GET("aet/pendingExportInfo.json")
    fun pendingExportInfo(
        @Query("forum") forum: String
    ): Call<Response<String>>

    @FormUrlEncoded
    @POST("aet/subscribe.json")
    fun subscribe(
        @Query("forum") forum: String
    ): Call<Response<String>>

}