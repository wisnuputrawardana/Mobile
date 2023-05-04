package com.example.myapplication121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val textView = findViewById<TextView>(R.id.TextView)

        val nilaidepan = intent.getStringExtra("Extra nilaiDepan")
        textView.text = "$nilaidepan"
    }
}