package id.axlyody.disqusandroid.sample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import id.axlyody.disqusandroid.sample.R
import id.axlyody.disqusandroid.sample.load
import id.axlyody.disqusandroid.lib.model.threads.Threads
import id.axlyody.disqusandroid.sample.markwon
import io.noties.markwon.Markwon
import io.noties.markwon.html.HtmlPlugin
import io.noties.markwon.image.ImagesPlugin
import kotlinx.android.synthetic.main.recycler_comments.view.*
import smartadapter.viewholder.SmartViewHolder

class AllComments(parentView: ViewGroup) : SmartViewHolder<Threads>(
    LayoutInflater.from(parentView.context)
        .inflate(R.layout.recycler_comments, parentView, false)
) {
    override fun bind(item: Threads) {
        itemView.apply {
            tx_name.text = item.author.name
            tx_message.markwon(this.context, item.message)
            iv_avatar.clipToOutline = false
            iv_avatar.load(item.author.avatar.permalink)
        }
    }

}