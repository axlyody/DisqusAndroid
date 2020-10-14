package id.axlyody.disqusandroid.sample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import io.noties.markwon.Markwon
import io.noties.markwon.html.HtmlPlugin
import io.noties.markwon.image.ImagesPlugin

fun ImageView.load(url: Any) {
    try {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(this)
    } catch (e: Exception) {
    }
}

fun TextView.markwon(context: Context, text: String) {
    val markwon = Markwon.builder(context)
        .usePlugin(HtmlPlugin.create())
        .usePlugin(ImagesPlugin.create())
        .build()

    markwon.setMarkdown(this, text)
}

fun Activity.start(T: Class<*>) {
    startActivity(Intent(this, T))
}
