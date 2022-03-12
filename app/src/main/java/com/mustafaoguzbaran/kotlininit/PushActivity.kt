package com.mustafaoguzbaran.kotlininit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_push.*

class PushActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_push)
        //get intent
        val intent = intent
        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        nameTextView.text = "Name: ${name}"
        surnameTextView.text = "Surname: ${surname}"
    }
}