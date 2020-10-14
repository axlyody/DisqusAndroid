package id.axlyody.disqusandroid.lib.model.posts

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import id.axlyody.disqusandroid.lib.model.users.UserDetails
import java.util.*


data class Post(
    @Expose
    @SerializedName("isHighlighted")
    var isHighlighted: Boolean,
    @Expose
    @SerializedName("isFlagged")
    var isFlagged: Boolean,
    @Expose
    @SerializedName("forum")
    var forum: String,
    @Expose
    @SerializedName("parent")
    var parent: Long,
    @Expose
    @SerializedName("thread")
    var thread: String? = null,
    @Expose
    @SerializedName("author")
    var author: UserDetails? = null,
    @Expose
    @SerializedName("raw_message")
    var rawMessage: String? = null,
    @Expose
    @SerializedName("message")
    var message: String? = null,
    @Expose
    @SerializedName("likes")
    var likes: Int,
    @Expose
    @SerializedName("dislikes")
    var dislikes: Int,
    @Expose
    @SerializedName("points")
    var points: Int,
    @Expose
    @SerializedName("numReports")
    var numReports: Int,
    @Expose
    @SerializedName("userScore")
    var userScore: Int,
    @Expose
    @SerializedName("isSpam")
    var isSpam: Boolean,
    @Expose
    @SerializedName("isApproved")
    var isApproved: Boolean,
    @Expose
    @SerializedName("isDeleted")
    var isDeleted: Boolean,
    @Expose
    @SerializedName("isEdited")
    var isEdited: Boolean,
    @Expose
    @SerializedName("id")
    var id: Long,
    @Expose
    @SerializedName("createdAt")
    var createdAt: Date? = null
)
