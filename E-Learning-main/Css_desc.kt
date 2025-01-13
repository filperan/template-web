package com.yusuf_222003.e_learning.CSS

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusuf_222003.e_learning.HTML.Html_HomePage
import com.yusuf_222003.e_learning.R

class Css_desc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_css_desc)

        val backButton: ImageButton = findViewById(R.id.imageButton3)
        backButton.setOnClickListener {
            val intent = Intent(this, Html_HomePage::class.java)
            startActivity(intent)
            finish()
        }
    }
}