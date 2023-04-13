package com.example.latihan4

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLanjut = findViewById<Button>(com.example.latihan4.R.id.btnLanjut)
        val btnInsta = findViewById<Button>(com.example.latihan4.R.id.btnInsta)


        btnInsta.setOnClickListener(){
            intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"))
            startActivity(intent)

        }

        btnLanjut.setOnClickListener(){
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }

        }

        val btnUnggah = findViewById<Button>(R.id.button2)

        btnUnggah.setOnClickListener{
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it,0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0){
            val url = data?.data
            val img = findViewById<ImageView>(R.id.imageView)
            img.setImageURI(url)
        }
    }


}