package com.example.myapplication121

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Main1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val countries = arrayOf("India", "USA", "Australia", "UK", "Italy", "Ireland", "Africa")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        val autoComp = findViewById<AutoCompleteTextView>(R.id.autoComplete)
        autoComp.setAdapter(adapter)


        val btn = findViewById<Button>(R.id.btn)
        val textView = findViewById<TextView>(R.id.text)

        btn.setOnClickListener{
            var textauto = autoComp.text.toString()

            Intent(this, Main3Activity::class.java).also {
                it.putExtra("Extra nilaiDepan", textauto )
                startActivity(it)
            }
        }

    }
}

