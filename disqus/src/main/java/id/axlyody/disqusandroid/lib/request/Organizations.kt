package id.axlyody.disqusandroid.lib.request

import retrofit2.http.*

interface getOrganizations {

    @FormUrlEncoded
    @POST("organizations/addAdmin.json")
    fun addAdmin(
        @Field("organization") organization: String,
        @Field("user") user: String
    )

    @GET("organizations/listAdmins.json")
    fun listAdmins(
        @Query("organization") organization: String
    )

    @FormUrlEncoded
    @POST("organizations/removeAdmin.json")
    fun removeAdmin(
        @Field("organization") organization: String,
        @Field("user") user: String
    )

    @FormUrlEncoded
    @POST("organizations/setRole.json")
    fun setRole(
        @Field("user") user: String,
        @Field("organization") organization: String,
        @FieldMap params: HashMap<String, String>
    )
}