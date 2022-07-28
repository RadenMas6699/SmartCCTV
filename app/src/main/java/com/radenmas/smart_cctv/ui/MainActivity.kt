/*
 * Created by RadenMas on 25/7/2022.
 * Copyright (c) 2022.
 */

package com.radenmas.smart_cctv.ui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging
import com.radenmas.smart_cctv.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        initView()
        onClick()
    }

    private fun onClick() {
        b.imgHistory.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }
    }

    private fun initView() {
        Firebase.messaging.subscribeToTopic("user")

        FirebaseDatabase.getInstance().reference.child("ipAddress")
            .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        val ipAddr = snapshot.value.toString()
                        val settings: WebSettings = b.webView.settings
                        settings.javaScriptEnabled = true
                        settings.databaseEnabled = true
                        settings.userAgentString =
                            "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0"
                        settings.domStorageEnabled = true
                        settings.setGeolocationEnabled(true)
                        settings.loadsImagesAutomatically = true
                        settings.setAppCacheEnabled(true)
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            settings.safeBrowsingEnabled = true
                        }

                        b.webView.webViewClient = WebViewClient()
                        b.webView.webChromeClient = WebChromeClient()

                        b.webView.loadUrl(ipAddr)
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                }
            })
    }
}