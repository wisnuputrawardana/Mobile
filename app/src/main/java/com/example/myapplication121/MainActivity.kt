package com.example.myapplication121

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text = findViewById<TextView>(R.id.text1)
//        text.text = "Hello"

        val editText = findViewById<EditText>(R.id.EditText1)
        editText.setText("Ini EditText")

        val countries = arrayOf("India", "USA", "Australia", "UK", "Italy", "Ireland", "Africa")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        val autoComp = findViewById<AutoCompleteTextView>(R.id.autoComplete1)
        autoComp.setAdapter(adapter)

        val button = findViewById<Button>(R.id.btn1)
        button.text = "Add"


        button.setOnClickListener(View.OnClickListener {
            // Do something in response to button click
        })

        fun addOperation(view: View?) {
            // Do something in response to the button click
        }

        val imgbtn = findViewById<ImageButton>(R.id.imgbtn1)
        imgbtn.setImageResource(com.google.android.material.R.drawable.ic_arrow_back_black_24)

        val tglbtn = findViewById<ToggleButton>(R.id.tglbtn1)
        tglbtn.textOff = "OFF"
        tglbtn.textOn = "ON"
        tglbtn.isChecked = false;

        tglbtn.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The toggle is enabled
            } else {
                // The toggle is disabled
            }
        })

        val check = findViewById<CheckBox>(R.id.chck1)
        check.text = "Check Box"
        check.isChecked = true;

        check.setOnClickListener(View.OnClickListener() {
           var checked = check.isChecked
            if (checked) {
                text.text = "True"
            } else {
                text.text = "False"
            }
        })

        val radioGroup = findViewById<RadioGroup>(R.id.myRadioGroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radio_button1)
        val radioButton2 = findViewById<RadioButton>(R.id.radio_button2)

        radioButton1.isChecked = true

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            // Do something with the selected radio button
        }

        val ratingBar = findViewById<RatingBar>(R.id.ratingbar1)
        val noofstars: Int = ratingBar.numStars
        val getrating: Float = ratingBar.rating
        text.text = "Rating: $getrating/$noofstars"



        val switch = findViewById<Switch>(R.id.Switch1)

        switch.text = "Switch"
        switch.textOff = "OFF"
        switch.textOn = "ON"
        switch.isChecked = true;

        switch.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The toggle is enabled
            } else {
                // The toggle is disabled
            }
        })

    }
}