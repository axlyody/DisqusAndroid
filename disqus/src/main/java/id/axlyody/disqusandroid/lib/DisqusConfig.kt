package id.axlyody.disqusandroid.lib

import android.content.Context
import okhttp3.logging.HttpLoggingInterceptor

class DisqusConfig {

    companion object {
        private var _init: Context? = null
        private var _api_key: String? = null
        private var _api_secret: String? = null
        private var _access_token: String? = null
        private var _oauth_callback: String? = null
        private var _log_level: HttpLoggingInterceptor.Level = HttpLoggingInterceptor.Level.NONE

        fun init(context: Context) {
            this._init = context
        }

        fun setApiKey(api_key: String) {
            this._api_key = api_key
        }

        fun setApiSecret(api_secret: String) {
            this._api_secret = api_secret
        }

        fun setAccessToken(access_token: String) {
            this._access_token = access_token

        }

        fun setOAuthCallback(oauth_callback: String) {
            this._oauth_callback = oauth_callback

        }

        fun setLogLevel(log_level: HttpLoggingInterceptor.Level) {
            this._log_level = log_level
        }

        fun apiKey() = _api_key
        fun apiSecret() = _api_secret
        fun accessToken() = _access_token
        fun oauthCallback() = _oauth_callback
        fun logLevel() = _log_level
        fun context() = _init ?: throw Exception("Initialize DisqusConfig.init() first")
    }
}