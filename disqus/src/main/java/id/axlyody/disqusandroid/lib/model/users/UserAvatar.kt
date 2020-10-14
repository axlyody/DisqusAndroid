package id.axlyody.disqusandroid.lib.model.users

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserAvatar(
    @Expose
    @SerializedName("permalink")
    var permalink: String,
    @Expose
    @SerializedName("cache")
    var cache: String
)