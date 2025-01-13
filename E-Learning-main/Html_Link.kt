package com.yusuf_222003.e_learning.HTML

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusuf_222003.e_learning.R

class Html_Link : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html_link)
        val backButton: ImageButton = findViewById(R.id.imageButton2)
        backButton.setOnClickListener {
            val intent = Intent(this, Html_HomePage::class.java)
            startActivity(intent)
            finish()
        }
    }
}