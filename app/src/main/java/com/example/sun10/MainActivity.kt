package com.example.sun10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgUrl = "https://cdn.pixabay.com/photo/2018/04/22/19/16/marguerite-3342050_150.jpg"
        Glide.with(this)
                .load(imgUrl)
                .into(imageView1)
    }
}