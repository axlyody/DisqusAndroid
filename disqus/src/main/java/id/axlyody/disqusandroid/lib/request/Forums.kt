package id.axlyody.disqusandroid.lib.request

import retrofit2.http.Field
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Forums {
    @FormUrlEncoded
    @POST("forums/addModerator.json")
    fun addModerator(
        @Field("forum") forum: String,
        @Field("user") user: String,
        @FieldMap params: HashMap<String, String>
    )


}