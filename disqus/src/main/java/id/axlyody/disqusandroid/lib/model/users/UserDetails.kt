package id.axlyody.disqusandroid.lib.model.users

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserDetails (
    @Expose
    @SerializedName("id")
    var id: String,
    @Expose
    @SerializedName("username")
    var username: String,
    @Expose
    @SerializedName("name")
    var name: String,
    @Expose
    @SerializedName("about")
    var about: String,
    @Expose
    @SerializedName("url")
    var url: String,
    @Expose
    @SerializedName("email")
    var email: String,
    @Expose
    @SerializedName("avatar")
    var avatar: UserAvatar,
    @Expose
    @SerializedName("isFollowing")
    var isFollowing: Boolean,
    @Expose
    @SerializedName("isFollowedBy")
    var isFollowedBy: Boolean,
    @Expose
    @SerializedName("proflileUrl")
    var profileUrl: String,
    @Expose
    @SerializedName("isAnonymous")
    var isAnonymous: Boolean
)