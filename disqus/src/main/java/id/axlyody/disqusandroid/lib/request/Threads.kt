package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.Response
import id.axlyody.disqusandroid.lib.model.threads.Threads
import retrofit2.Call
import retrofit2.http.*

interface getThreads {
    @GET("threads/listPosts.json")
    fun listPosts(
        @Query("thread") thread: Long,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<Response<List<Threads>>>

    @FormUrlEncoded
    @POST("threads/open.json")
    fun open(
        @Field("thread") thread: Long
    ): Call<Response<Threads>>

    @FormUrlEncoded
    @POST("threads/close.json")
    fun close(
        @Field("thread") thread: Long
    ): Call<Response<Threads>>

    @FormUrlEncoded
    @POST("threads/details.json")
    fun details(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    ): Call<Response<Threads>>

    @POST("threads/create.json")
    fun create(
        @Query("forum") forum: String,
        @Query("title") title: String,
    ): Call<Response<Threads>>

    @FormUrlEncoded
    @POST("threads/remove.json")
    fun remove(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    ): Call<Response<Threads>>

    @FormUrlEncoded
    @POST("threads/vote.json")
    fun vote(
        @Field("vote") vote: Int,
        @Field("thread") thread: Int,
        @FieldMap params: HashMap<String, String>
    ): Call<Response<Threads>>

    @FormUrlEncoded
    @POST("threads/restore.json")
    fun restore(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    ): Call<Response<Threads>>

}
