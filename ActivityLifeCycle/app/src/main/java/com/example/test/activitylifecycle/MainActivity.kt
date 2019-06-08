package com.example.test.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var buttontest : Button
    lateinit var textline : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("ClickButton测试")
        buttontest = findViewById(R.id.buttontest)
        textline = findViewById(R.id.textline)
        buttontest.setOnClickListener(){
            //Log.d("TAG","Button clicked!")
            textline.text = "Button Clicked!"

    }
    }

}
