package com.example.mod3no2a

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


// Mendapatkan referensi untuk button di layout
        val openLensButton = findViewById<Button>(R.id.btnLanjut2)

// Menambahkan listener untuk button
        openLensButton.setOnClickListener {
            // Mendefinisikan Intent untuk membuka Google Lens
            val intent = packageManager.getLaunchIntentForPackage("com.spotify.music")

            // Memeriksa apakah Google Lens telah diinstal di perangkat
            if (intent != null) {
                // Jika Google Lens telah diinstal, membuka aplikasi
                startActivity(intent)
            } else {
                // Jika Google Lens belum diinstal, membuka halaman di Google Play untuk mengunduh aplikasi
                val playStoreIntent = Intent(Intent.ACTION_VIEW)
                playStoreIntent.data =
                    Uri.parse("https://play.google.com/store/apps/details?id=com.spotify.music")
                startActivity(playStoreIntent)
            }
        }
    }
}