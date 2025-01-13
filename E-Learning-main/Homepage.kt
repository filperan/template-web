package com.yusuf_222003.e_learning

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import com.yusuf_222003.e_learning.CSS.Css_HomePage
import com.yusuf_222003.e_learning.HTML.Html_HomePage

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        // Inisialisasi SearchView
        val searchView = findViewById<SearchView>(R.id.searchView)

        // Mendapatkan EditText dari SearchView
        val searchEditText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)

        // Mengatur warna teks pada EditText
        searchEditText.setTextColor(ContextCompat.getColor(this, R.color.black))

        // Menambahkan onClickListener ke View dan TextView
        val view4 = findViewById<View>(R.id.view4)
        val textView6 = findViewById<TextView>(R.id.textView6)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val view5 = findViewById<View>(R.id.view5)
        val textView8 = findViewById<TextView>(R.id.textView8)
        val textView9 = findViewById<TextView>(R.id.textView9)

        view4.setOnClickListener {
            // Ketika View di klik, buka halaman HTML
            startActivity(Intent(this, Html_HomePage::class.java))
        }

        textView6.setOnClickListener {
            // Ketika TextView di klik, buka halaman HTML
            startActivity(Intent(this, Html_HomePage::class.java))
        }

        textView7.setOnClickListener {
            // Ketika TextView di klik, buka halaman HTML
            startActivity(Intent(this, Html_HomePage::class.java))
        }

        view5.setOnClickListener {
            // Ketika View di klik, buka halaman HTML
            startActivity(Intent(this, Css_HomePage::class.java))
        }
        textView8.setOnClickListener {
            // Ketika View di klik, buka halaman HTML
            startActivity(Intent(this, Css_HomePage::class.java))
        }
        textView9.setOnClickListener {
            // Ketika View di klik, buka halaman HTML
            startActivity(Intent(this, Css_HomePage::class.java))
        }
    }
}