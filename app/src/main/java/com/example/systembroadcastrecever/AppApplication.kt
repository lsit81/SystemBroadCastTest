package com.example.systembroadcastrecever

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager

/**
 * Created by seungtaek.lim on 2020/11/17.
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val br: BroadcastReceiver = MyBroadcastReceiver()
        val filter = IntentFilter(Intent.ACTION_PACKAGE_CHANGED)
            .apply { addDataScheme("package") }
        registerReceiver(br, filter)
    }
}