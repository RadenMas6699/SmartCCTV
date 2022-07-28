package com.radenmas.smart_cctv.adapter

import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.radenmas.smart_cctv.R

class FirebaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image: WebView
//    var image: ImageView
    var date: TextView
    var time: TextView

    init {
        image = itemView.findViewById(R.id.imgCapture)
//        image = itemView.findViewById(R.id.imgCapture)
        date = itemView.findViewById(R.id.tvDate)
        time = itemView.findViewById(R.id.tvTime)
    }
}