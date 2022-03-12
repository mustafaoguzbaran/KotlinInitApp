package com.mustafaoguzbaran.kotlininit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_push.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun push(view: View){
val intent = Intent(applicationContext, PushActivity::class.java)
        intent.putExtra("name", nameInput.text.toString())
        intent.putExtra("surname", surnameInput.text.toString())
        startActivity(intent)
    }
}