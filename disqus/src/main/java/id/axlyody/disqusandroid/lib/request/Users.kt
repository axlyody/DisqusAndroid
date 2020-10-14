package id.axlyody.disqusandroid.lib.request

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
}