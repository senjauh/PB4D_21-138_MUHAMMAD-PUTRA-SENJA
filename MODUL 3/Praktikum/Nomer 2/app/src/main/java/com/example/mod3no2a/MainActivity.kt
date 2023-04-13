package com.example.mod3no2a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLanjut = findViewById<Button>(com.example.mod3no2a.R.id.btnLanjut)

        btnLanjut.setOnClickListener(){
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }
    }
}