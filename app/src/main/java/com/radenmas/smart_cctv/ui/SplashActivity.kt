/*
 * Created by RadenMas on 25/7/2022.
 * Copyright (c) 2022.
 */

package com.radenmas.smart_cctv.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.radenmas.smart_cctv.R
import com.radenmas.smart_cctv.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var b: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(b.root)

        val versionName = packageManager.getPackageInfo(packageName, 0).versionName
        b.tvAppVersion.text = resources.getString(R.string.app_version, versionName)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1500)
    }
}