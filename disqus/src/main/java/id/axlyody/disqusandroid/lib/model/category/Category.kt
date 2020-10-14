package id.axlyody.disqusandroid.lib.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Category(
    @Expose
    @SerializedName("id")
    var id: String,
    @Expose
    @SerializedName("forum")
    var forum: String,
    @Expose
    @SerializedName("title")
    var title: String,
    @Expose
    @SerializedName("order")
    var order: Int,
    @Expose
    @SerializedName("isDefault")
    var isDefault: Boolean
)