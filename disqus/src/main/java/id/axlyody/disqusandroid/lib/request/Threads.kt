package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.DisqusResponse
import id.axlyody.disqusandroid.lib.model.threads.Threads
import retrofit2.Call
import retrofit2.http.*

interface getThreads {
    @FormUrlEncoded
    @POST("threads/approve.json")
    fun approve(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    )

    @GET("threads/listUsersVotedThread.json")
    fun listUsersVotedThread(
        @Query("thread") thread: Long,
        @QueryMap(encoded = true) params: HashMap<String, String>
    )

    @GET("threads/listHot.json")
    fun listHot(
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<DisqusResponse<List<Threads>>>

    @GET("threads/listPopular.json")
    fun listPopular(
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<DisqusResponse<List<Threads>>>


    @GET("threads/listPosts.json")
    fun listPosts(
        @Query("thread") thread: Long,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<DisqusResponse<List<Threads>>>


    @FormUrlEncoded
    @POST("threads/open.json")
    fun open(
        @Field("thread") thread: Long
    ): Call<DisqusResponse<Threads>>

    @FormUrlEncoded
    @POST("threads/close.json")
    fun close(
        @Field("thread") thread: Long
    ): Call<DisqusResponse<Threads>>

    @FormUrlEncoded
    @POST("threads/details.json")
    fun details(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    ): Call<DisqusResponse<Threads>>

    @POST("threads/create.json")
    fun create(
        @Field("forum") forum: String,
        @Field("title") title: String,
    ): Call<DisqusResponse<Threads>>

    @FormUrlEncoded
    @POST("threads/remove.json")
    fun remove(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    ): Call<DisqusResponse<Threads>>

    @FormUrlEncoded
    @POST("threads/vote.json")
    fun vote(
        @Field("vote") vote: Int,
        @Field("thread") thread: Int,
        @FieldMap params: HashMap<String, String>
    ): Call<DisqusResponse<Threads>>

    @FormUrlEncoded
    @POST("threads/restore.json")
    fun restore(
        @Field("thread") thread: Long,
        @FieldMap params: HashMap<String, String>
    ): Call<DisqusResponse<Threads>>

    @GET("threads/ratingsSummary.json")
    fun ratingsSummary(
        @Query("thread") thread: Long,
    )

    @GET("threads/set.json")
    fun set(
        @Query("thread") thread: String,
        @QueryMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("threads/spam.json")
    fun spam(
        @Field("thread") thread: String,
        @FieldMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("threads/subscribe.json")
    fun subscrive(
        @Field("thread") thread: String,
    )

    @FormUrlEncoded
    @POST("threads/unsubscribe.json")
    fun unsubscribe(
        @Field("thread") thread: String,
    )

    @FormUrlEncoded
    @POST("threads/update.json")
    fun update(
        @Field("thread") thread: String,
        @FieldMap params: HashMap<String, String>
    )


}
