package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.model.Response
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
    ): Call<Response<Category>>

    @GET("category/details.json")
    fun details(
        @Query("category") category: Int,
    ): Call<Response<Category>>

    @GET("category/list.json")
    fun list(
        @Query("forum") forum: String,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<Response<Category>>


    @GET("category/listPosts.json")
    fun listPost(
        @Query("category") category: Int,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<Response<List<Post>>>

    @GET("category/listThreads.json")
    fun listThreads(
        @Query("category") category: Int,
        @QueryMap(encoded = true) params: HashMap<String, String>
    ): Call<Response<List<Post>>>

}