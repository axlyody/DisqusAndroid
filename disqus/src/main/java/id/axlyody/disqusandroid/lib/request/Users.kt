package id.axlyody.disqusandroid.lib.request

import id.axlyody.disqusandroid.lib.enums.UsersReport
import id.axlyody.disqusandroid.lib.model.DisqusResponse
import id.axlyody.disqusandroid.lib.model.users.UserDetails
import retrofit2.Call
import retrofit2.http.*

interface getUsers {
    @FormUrlEncoded
    @POST("users/checkUsername.json")
    fun checkUsername(
        @Field("username") username: String? = null
    ): Call<DisqusResponse<String>>

    @FormUrlEncoded
    @POST("users/details.json")
    fun details(
        @FieldMap params: HashMap<String, String>
    ): Call<UserDetails>

    @FormUrlEncoded
    @POST("users/follow.json")
    fun follow(
        @Field("target") target: Long
    ): Call<UserDetails>

    @FormUrlEncoded
    @POST("users/unfollow.json")
    fun unfollow(
        @Field("target") target: Long
    ): Call<UserDetails>

    @FormUrlEncoded
    @POST("users/updateProfile.json")
    fun updateProfile(
        @Field("about") about: String,
        @Field("name") name: String,
        @Field("location") location: String,
        @Field("url") url: String,
    ): Call<String>

    @GET("users/interestingUsers.json")
    fun interstingUsers(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listActivity.json")
    fun listActivity(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listFollowers.json")
    fun listFollowers(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listFollowing.json")
    fun listFollowing(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listFollowingChannels.json")
    fun listFollowingChannels(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listFollowingForums.json")
    fun listFollowingForums(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listForums.json")
    fun listForums(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listModeratedChannels.json")
    fun listModeratedChannels(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listMostActiveForums.json")
    fun listMostActiveForums(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listOwnedChannels.json")
    fun listOwnedChannels(
        @QueryMap params: HashMap<String, String>
    )

    @GET("users/listPosts.json")
    fun listsPosts(
        @QueryMap params: HashMap<String, String>
    )

    @FormUrlEncoded
    @POST("users/report.json")
    fun report(
        @Field("reason") reason: UsersReport,
        @Field("user") user: String
    )


}