package id.axlyody.disqusandroid.lib.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class DisqusResponse<T> {
    @Expose
    @SerializedName("cursor")
    var cursor: Cursor? = null
    @Expose
    @SerializedName("code")
    var code = 0
    @SerializedName("response")
    var data: T? = null
}