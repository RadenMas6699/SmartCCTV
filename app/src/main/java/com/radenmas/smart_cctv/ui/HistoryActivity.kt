/*
 * Created by RadenMas on 25/7/2022.
 * Copyright (c) 2022.
 */

package com.radenmas.smart_cctv.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.Query
import com.radenmas.smart_cctv.R
import com.radenmas.smart_cctv.adapter.FirebaseViewHolder
import com.radenmas.smart_cctv.adapter.History
import com.radenmas.smart_cctv.databinding.ActivityHistoryBinding
import java.text.SimpleDateFormat
import java.util.*

class HistoryActivity : AppCompatActivity() {
    private lateinit var b: ActivityHistoryBinding

    private lateinit var options: FirebaseRecyclerOptions<History>
    private lateinit var adapter: FirebaseRecyclerAdapter<History, FirebaseViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityHistoryBinding.inflate(layoutInflater)
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
        val reffFoto = FirebaseDatabase.getInstance().reference.child("Foto")
        val query: Query = reffFoto.orderByChild("timestamp")
        query.keepSynced(true)

        b.rvHistory.setHasFixedSize(true)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.reverseLayout = true
        linearLayoutManager.stackFromEnd = true
        b.rvHistory.layoutManager = linearLayoutManager

        options = FirebaseRecyclerOptions.Builder<History>()
            .setQuery(query, History::class.java)
            .build()

        adapter = object : FirebaseRecyclerAdapter<History, FirebaseViewHolder>(options) {
            override fun onBindViewHolder(
                holder: FirebaseViewHolder,
                i: Int,
                dataHistory: History
            ) {
                holder.image.loadUrl(dataHistory.image.toString())
                val timestamp = dataHistory.timestamp.toString().toLong()
                val time = timestamp * 1000

                val date = Date(time)
                val formatDate = SimpleDateFormat("dd MMM yyyy")
                val formatClock = SimpleDateFormat("HH:mm")

                holder.date.text = formatDate.format(date)
                holder.time.text = formatClock.format(date)
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirebaseViewHolder {
                return FirebaseViewHolder(
                    LayoutInflater.from(this@HistoryActivity)
                        .inflate(R.layout.list_history, parent, false)
                )
            }
        }

        b.rvHistory.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        adapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }
}