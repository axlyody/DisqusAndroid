package id.axlyody.disqusandroid.lib.model.threads

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import id.axlyody.disqusandroid.lib.model.users.UserDetails


data class Threads(
    @Expose
    @SerializedName("thread")
    var thread: String,
    @Expose
    @SerializedName("forum")
    var forum: String,
    @Expose
    @SerializedName("id")
    var id: String? = null,
    @Expose
    @SerializedName("parent")
    var parent: Long? = null,
    @Expose
    @SerializedName("editableUntil")
    var editableUntil: String,
    @Expose
    @SerializedName("createdAt")
    var createdAt: String,
    @Expose
    @SerializedName("author")
    var author: UserDetails,
    @Expose
    @SerializedName("message")
    var message: String,
    @Expose
    @SerializedName("raw_message")
    var raw_message: String,
    @Expose
    @SerializedName("likes")
    var likes: Int,
    @Expose
    @SerializedName("dislikes")
    var dislikes: Int,
    @Expose
    @SerializedName("isSpam")
    var isSpam: Boolean,
    @Expose
    @SerializedName("isDeletedByAuthor")
    var isDeletedByAuthor: Boolean,
    @Expose
    @SerializedName("isEdited")
    var isEdited: Boolean,
    @Expose
    @SerializedName("isApproved")
    var isApproved: Boolean,
    @Expose
    @SerializedName("isDeleted")
    var isDeleted: Boolean,
    @Expose
    @SerializedName("isFlagged")
    var isFlagged: Boolean,
    @Expose
    @SerializedName("canVote")
    var canVote: Boolean,
    @Expose
    @SerializedName("points")
    var points: Int
)
