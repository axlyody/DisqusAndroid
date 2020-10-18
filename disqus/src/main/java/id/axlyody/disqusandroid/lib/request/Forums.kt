package id.axlyody.disqusandroid.lib.request

import retrofit2.http.*

interface getForums {
    @FormUrlEncoded
    @POST("forums/addModerator.json")
    fun addModerator(
        @Field("forum") forum: String,
        @Field("user") user: String,
        @FieldMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("forums/create.json")
    fun create(
        @Field("name") name: String,
        @Field("short_name") short_name: String,
        @FieldMap params: HashMap<String, String>
    )

    @GET("forums/get.json")
    fun get(
        @Query("forum") forum: String,
        @QueryMap(encoded = true) params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("forums/disableAds.json")
    fun disableAds(
        @Field("forum") forum: String
    )

    @GET("forums/fixFaviconsForClassifiedForums.json")
    fun fixFaviconsForClassifiedForums(

    )

    @FormUrlEncoded
    @POST("forums/follow.json")
    fun follow(
        @Field("target") target: String
    )

    @GET("forums/generateInterestingContent.json")
    fun generateInterestingContent(

    )

    @GET("forums/interestingForums.json")
    fun interestingForums(
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listCategories.json")
    fun listCategories(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listFollowers.json")
    fun listFollowers(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listModerators.json")
    fun listModerators(
        @Query("forum") forum: String,
    )

    @GET("forums/listMostActiveUsers.json")
    fun listMostActiveUsers(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listMostLikedUsers.json")
    fun listMostLikedUsers(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listPosts.json")
    fun listPosts(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listThreads.json")
    fun listThreads(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/listUserModerationHistory.json")
    fun listUserModerationHistory(
        @Query("forum") forum: String,
        @Query("user") user: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/removeDefaultAvatar.json")
    fun removeDefaultAvatar(
        @Query("forum") forum: String
    )

    @FormUrlEncoded
    @POST("forums/removeModerator.json")
    fun removeModerator(
        @FieldMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("forums/unfollow.json")
    fun unfollow(
        @Field("target") target: String
    )

    @GET("forums/validate.json")
    fun validate(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @GET("forums/behindClick/details.json")
    fun behindClickDetails(
        @Query("forum") forum: String
    )

    @GET("forums/behindClick/update.json")
    fun behindClickUpdate(
        @Query("forum") forum: String,
        @QueryMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("forums/block/banPostAuthor.json")
    fun blockBanPostAuthor(
        @Field("post") post: String,
        @FieldMap params: HashMap<String, String>
    )


}