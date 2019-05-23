package com.example.myproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_map : Button = findViewById(R.id.map_button)
        button_map.setOnClickListener{
            val intent = Intent(this, MapActivity :: class.java)
            startActivity(intent)
        }
    }
}
