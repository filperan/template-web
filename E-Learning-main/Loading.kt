package com.yusuf_222003.e_learning

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Loading : AppCompatActivity() { // Ganti nama class menjadi LoadingActivity (sesuai konvensi)

    private val splashDuration = 3000 // 3 detik dalam milidetik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading) // Ganti dengan nama layout splash screen (biasanya activity_splash.xml)
        // Tampilkan layout splash screen

        // Tunda 3 detik sebelum membuka halaman utama
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java) // Ganti dengan nama kelas activity utama
            startActivity(intent)
            finish() // Akhiri activity splash screen
        }, splashDuration.toLong())
    }
}