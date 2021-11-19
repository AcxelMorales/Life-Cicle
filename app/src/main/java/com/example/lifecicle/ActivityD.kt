package com.example.lifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast

class ActivityD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        val message = intent.getStringExtra("MESSAGE")

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}
