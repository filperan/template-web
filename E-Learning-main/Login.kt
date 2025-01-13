package com.yusuf_222003.e_learning

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailInput = findViewById<EditText>(R.id.et_email)
        val passwordInput = findViewById<EditText>(R.id.et_password)
        val loginButton = findViewById<Button>(R.id.btn_login)
        val belumPunyaAkunButton = findViewById<Button>(R.id.belum_punya_akun_button)
        val rootView = findViewById<ConstraintLayout>(R.id.login)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            // Pemeriksaan login
            if (validateLogin(email, password)) {
                // Jika login berhasil, beralih ke activity homepage
                startActivity(Intent(this, Homepage::class.java))
                finish() // Opsional: Tutup aktivitas saat ini jika diperlukan
            } else {
                // Jika login gagal, tampilkan pesan kesalahan
                Toast.makeText(this, "Login gagal, Email Atau Password Anda Salah.", Toast.LENGTH_SHORT).show()
            }
        }

        // Set onClickListener untuk tombol "Belum Punya Akun"
        belumPunyaAkunButton.setOnClickListener {
            startActivity(Intent(this, daftar::class.java))
        }

        // Menambahkan listener untuk mendeteksi ketukan di luar bidang teks
        rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                hideSoftKeyboard()
            }
            false
        }
    }

    private fun validateLogin(email: String, password: String): Boolean {
        val dbHelper = DatabaseHelper(this)
        val cursor = dbHelper.getUser(email, password)
        val count = cursor.count
        cursor.close()
        return count > 0
    }

    private fun hideSoftKeyboard() {
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }

    override fun onBackPressed() {
        // Keluar dari aplikasi saat tombol kembali ditekan
        finishAffinity()
    }
}