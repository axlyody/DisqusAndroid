package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.DisqusResponse
import id.axlyody.disqusandroid.lib.model.category.Category
import id.axlyody.disqusandroid.lib.model.posts.Post
import retrofit2.Call
import retrofit2.http.*

interface getCategory {
    @FormUrlEncoded
    @POST("category/create.json")
    fun create(
        @Field("forum") forum: String,
        @Field("title") title: String
    ): Call<DisqusResponse<Category>>

    @GET("category/details.json")
    fun details(
        @Query("category") category: Int,
    ): Call<DisqusResponse<Category>>

    @GET("category/list.json")
    fun list(
        @Query("forum") forum: String,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<DisqusResponse<Category>>


    @GET("category/listPosts.json")
    fun listPost(
        @Query("category") category: Int,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<DisqusResponse<List<Post>>>

    @GET("category/listThreads.json")
    fun listThreads(
        @Query("category") category: Int,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<DisqusResponse<List<Post>>>

}