package com.example.lifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        val message = intent.getStringExtra("MESSAGE")

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        val btnBackB = findViewById<Button>(R.id.backB)

        btnBackB.setOnClickListener {
            finish()
        }
    }

}
