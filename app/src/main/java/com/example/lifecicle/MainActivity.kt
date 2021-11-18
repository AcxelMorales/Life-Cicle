package com.example.lifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var name = "Java"
    val NAME = "Name"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        //Toast.makeText(this, name, Toast.LENGTH_SHORT).show()

        button.setOnClickListener {
            this.name = "Kotlin"
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        this.name = savedInstanceState.getString(this.NAME)!!

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(this.NAME, this.name)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "En transiciòn", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "App visible", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "App oculta", Toast.LENGTH_SHORT).show()
    }

}
