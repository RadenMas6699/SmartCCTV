/*
 * Created by RadenMas on 14/7/2022.
 * Copyright (c) 2022.
 */

package com.radenmas.smart_cctv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.radenmas.smart_cctv.databinding.ActivityStreamingBinding

class StreamingActivity : AppCompatActivity() {
    private lateinit var b: ActivityStreamingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityStreamingBinding.inflate(layoutInflater)
        setContentView(b.root)

        initView()
        onClick()
    }

    private fun onClick() {
        b.imgBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun initView() {

    }
}