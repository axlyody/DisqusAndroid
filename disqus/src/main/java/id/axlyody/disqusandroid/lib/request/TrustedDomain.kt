package id.axlyody.disqusandroid.lib.request

import retrofit2.http.*

interface getTrustedDomain {
    @FormUrlEncoded
    @POST("trustedDomain/create.json")
    fun create(
        @Field("forum") forum: String,
        @Field("domainName") domainName: String
    )

    @FormUrlEncoded
    @POST("trustedDomain/kill.json")
    fun kill(
        @Field("domain") domain: String,
        @FieldMap params: HashMap<String, String>
    )

    @GET("trustedDomain/list.json")
    fun list(
        @Query("forum") forum: String
    )
}