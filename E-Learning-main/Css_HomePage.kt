package com.yusuf_222003.e_learning.CSS

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusuf_222003.e_learning.HTML.Html_pengertian
import com.yusuf_222003.e_learning.R

class Css_HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_css_home_page)

        val view12 = findViewById<View>(R.id.view12)
        val textView34 = findViewById<View>(R.id.textView34)
        val view14 = findViewById<View>(R.id.view14)
        val textView35 = findViewById<View>(R.id.textView35)
        val textView36 = findViewById<View>(R.id.textView36)


        view12.setOnClickListener {
            startActivity(Intent(this, Css_desc::class.java))
        }

        textView34.setOnClickListener {
            startActivity(Intent(this, Css_desc::class.java))
        }

        view14.setOnClickListener{
            startActivity(Intent(this,Css_Selector::class.java))
        }

        textView35.setOnClickListener{
            startActivity(Intent(this,Css_Selector::class.java))
        }

        textView36.setOnClickListener{
            startActivity(Intent(this,Css_Selector::class.java))
        }


    }
}