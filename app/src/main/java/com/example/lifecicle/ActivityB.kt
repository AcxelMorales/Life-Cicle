package com.example.lifecicle

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.widget.Button
import android.widget.Toast

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val btnGoC = findViewById<Button>(R.id.btnGoC)
        val btnGoD = findViewById<Button>(R.id.btnGoD)

        val message = intent.getStringExtra("MESSAGE")

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        btnGoC.setOnClickListener {
            var intent = Intent(this, ActivityC::class.java)
            intent.putExtra("MESSAGE", "Hacia actividad C")
            startActivity(intent)
        }

        btnGoD.setOnClickListener {
            var intent = Intent(this, ActivityD::class.java)
            intent.putExtra("MESSAGE", "Hacia actividad D")
            startActivity(intent)
        }
    }

}
