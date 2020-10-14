package id.axlyody.disqusandroid.lib

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_authenticate.*

class DisqusAuthenticate : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticate)


        /**
         *  For security reasons we don't use secret key to authenticate
         *  you muse implement your own OAuth web authentication callback.
         *  This activity just receive token response from callback that you made earlier
         */

        webview.apply {

        }
    }
}