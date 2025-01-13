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

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        // Initialize views
        val nameInput = findViewById<EditText>(R.id.et_nama)
        val emailInput = findViewById<EditText>(R.id.et_email)
        val passwordInput = findViewById<EditText>(R.id.et_password)
        val registerButton = findViewById<Button>(R.id.btn_daftar)
        val rootView = findViewById<ConstraintLayout>(R.id.daftar)

        // Set onClickListener for the register button
        registerButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                val dbHelper = DatabaseHelper(this)
                dbHelper.insertUser(name, email, password)
                Toast.makeText(this, "Akun Berhasil Terekam", Toast.LENGTH_SHORT).show()
                // Clear input fields
                nameInput.text.clear()
                emailInput.text.clear()
                passwordInput.text.clear()

                // Move to the next activity (Login)
                startActivity(Intent(this, Login::class.java))
                finish() // Optional: close current activity if needed
            } else {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            }
        }

        // Menambahkan listener untuk mendeteksi ketukan di luar bidang teks
        rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                hideSoftKeyboard()
            }
            false
        }
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