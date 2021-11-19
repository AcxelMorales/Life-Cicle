package com.example.lifecicle

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnGoB)

        button.setOnClickListener {
            var intent = Intent(this, ActivityB::class.java)
            intent.putExtra("MESSAGE", "Hacia actividad B")
            startActivity(intent)
        }
    }

}
