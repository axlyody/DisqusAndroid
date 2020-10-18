package id.axlyody.disqusandroid.lib.request

import retrofit2.http.Field
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface getTopics {
    @FormUrlEncoded
    @POST("topics/update.json")
    fun update(
        @Field("topic_name") topic_name: String,
        @FieldMap params: HashMap<String, String>
    )
}