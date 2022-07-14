/*
 * Created by RadenMas on 14/7/2022.
 * Copyright (c) 2022.
 */

package com.radenmas.smart_cctv

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        b.btnCapture.setOnClickListener {

        }

        b.btnStreaming.setOnClickListener {
            startActivity(Intent(this, StreamingActivity::class.java))
        }
    }

    private fun initView() {

    }
}