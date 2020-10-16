package id.axlyody.disqusandroid.lib.request

import retrofit2.http.GET
import retrofit2.http.Query

interface ForumCategories {
    @GET("forumCategories/details.json")
    fun details(
        @Query("forumCategory") forumCategory: String
    )

    @GET("forumCategories/list.json")
    fun list(

    )
}