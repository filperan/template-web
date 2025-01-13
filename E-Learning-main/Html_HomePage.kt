package com.yusuf_222003.e_learning.HTML

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusuf_222003.e_learning.R

class Html_HomePage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html_home_page)

        val view2 = findViewById<View>(R.id.view2)
        val textview14 = findViewById<TextView>(R.id.textView14)
        val view3 = findViewById<View>(R.id.view3)
        val textview15 = findViewById<TextView>(R.id.textView15)
        val textview16 = findViewById<TextView>(R.id.textView16)
        val view4 = findViewById<View>(R.id.view4)
        val textview17 = findViewById<TextView>(R.id.textView17)
        val textview18 = findViewById<TextView>(R.id.textView18)
        val view5 = findViewById<View>(R.id.view5)
        val textview19 = findViewById<TextView>(R.id.textView19)
        val textview20 = findViewById<TextView>(R.id.textView20)


        view2.setOnClickListener {
            // Ketika View di klik, buka halaman HTML
            startActivity(Intent(this, Html_pengertian::class.java))
        }

        textview14.setOnClickListener {
            // Ketika TextView di klik, buka halaman HTML
            startActivity(Intent(this, Html_pengertian::class.java))
        }

        view3.setOnClickListener{
            startActivity(Intent(this,Html_Tag::class.java))
        }

        textview15.setOnClickListener{
            startActivity(Intent(this,Html_Tag::class.java))
        }

        textview16.setOnClickListener{
            startActivity(Intent(this,Html_Tag::class.java))
        }

        view4.setOnClickListener{
            startActivity(Intent(this,Html_List::class.java))
        }

        textview17.setOnClickListener{
            startActivity(Intent(this,Html_List::class.java))
        }

        textview18.setOnClickListener{
            startActivity(Intent(this,Html_List::class.java))
        }

        view5.setOnClickListener{
            startActivity(Intent(this,Html_Link::class.java))
        }

        textview19.setOnClickListener{
            startActivity(Intent(this,Html_Link::class.java))
        }

        textview20.setOnClickListener{
            startActivity(Intent(this,Html_Link::class.java))
        }

    }
}