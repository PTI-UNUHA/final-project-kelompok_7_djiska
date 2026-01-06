package com.example.quizmasterchallenge123

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_Register1 : AppCompatActivity() {

    private lateinit var edtNama: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnDaftar: Button
    private lateinit var txtMasuk: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register1)

        // ✅ EDGE TO EDGE – BENAR
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnDaftar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        // ✅ HUBUNGKAN VIEW
        edtNama = findViewById(R.id.edtNama)
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnDaftar = findViewById(R.id.btnDaftar)
        txtMasuk = findViewById(R.id.txtMasuk)

        // ✅ TOMBOL DAFTAR
        btnDaftar.setOnClickListener {
            val nama = edtNama.text.toString().trim()
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua field wajib diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registrasi berhasil 🎉", Toast.LENGTH_SHORT).show()
            }
        }

        // ✅ TEKS LOGIN
        txtMasuk.setOnClickListener {
            Toast.makeText(this, "Menuju halaman Login", Toast.LENGTH_SHORT).show()
            // nanti tinggal pakai Intent ke Activity_Login2
        }
    }
}
