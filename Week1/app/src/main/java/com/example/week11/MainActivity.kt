package com.example.week11

import android.graphics.Paint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //취소선 만들기
        val text1 = findViewById<TextView>(R.id.cost1)
        val text2 = findViewById<TextView>(R.id.cost2)
        text1.paintFlags = text1.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        text2.paintFlags = text2.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG


    }
}