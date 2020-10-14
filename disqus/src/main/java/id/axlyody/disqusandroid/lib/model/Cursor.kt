package id.axlyody.disqusandroid.lib.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cursor(
    @Expose
    @SerializedName("prev")
    var prev: String? = null,
    @Expose
    @SerializedName("hasNext")
    var hasNext: Boolean,
    @Expose
    @SerializedName("next")
    var next: String,
    @Expose
    @SerializedName("total")
    var total: Int? = null,
    @Expose
    @SerializedName("id")
    var id: String,
    @Expose
    @SerializedName("more")
    var more: Boolean
)