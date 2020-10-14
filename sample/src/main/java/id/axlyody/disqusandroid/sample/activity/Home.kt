package id.axlyody.disqusandroid.sample.activity

import android.os.Bundle
import id.axlyody.disqusandroid.lib.Disqus
import id.axlyody.disqusandroid.lib.model.threads.Threads
import id.axlyody.disqusandroid.sample.AppActivity
import id.axlyody.disqusandroid.sample.R
import id.axlyody.disqusandroid.sample.adapter.AllComments
import kotlinx.android.synthetic.main.activity_home.*
import retrofit2.Call
import retrofit2.Callback
import smartadapter.SmartRecyclerAdapter

class Home : AppActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        Disqus.Threads().listPosts(7619421325, HashMap())
            .enqueue(object : Callback<id.axlyody.disqusandroid.lib.model.Response<List<Threads>>> {
                override fun onResponse(
                    call: Call<id.axlyody.disqusandroid.lib.model.Response<List<Threads>>>,
                    response: Response<id.axlyody.disqusandroid.lib.model.Response<List<Threads>>>
                ) {

                    response.body().apply {
                        data.let {
                            SmartRecyclerAdapter.items(it)
                                .map(Threads::class, AllComments::class)
                                .into<SmartRecyclerAdapter>(rv_comments)
                        }
                    }

                }

                override fun onFailure(
                    call: Call<id.axlyody.disqusandroid.lib.model.Response<List<Threads>>>,
                    t: Throwable
                ) {
                }

            })


    }
}