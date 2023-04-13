package com.example.latihan4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnLanjut = findViewById<Button>(R.id.btnBack)

        btnLanjut.setOnClickListener(){
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }

        }
    }
}