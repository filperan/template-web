package com.yusuf_222003.e_learning

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPage1: Button = findViewById(R.id.btn_login)
        btnPage1.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish() // Opsional: Menutup aktivitas halaman dua setelah pindah ke halaman satu
        }

        val btnPage2: Button = findViewById(R.id.btn_register)
        btnPage2.setOnClickListener {
            val intent = Intent(this, daftar::class.java)
            startActivity(intent)
            finish() // Opsional: Menutup aktivitas halaman dua setelah pindah ke halaman satu
        }
    }
}