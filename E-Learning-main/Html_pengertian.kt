package com.yusuf_222003.e_learning.HTML

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusuf_222003.e_learning.R

class Html_pengertian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html_pengertian)
        val backButton: ImageButton = findViewById(R.id.my_image_button)
        backButton.setOnClickListener {
            val intent = Intent(this, Html_HomePage::class.java)
            startActivity(intent)
            finish()
        }
    }
}