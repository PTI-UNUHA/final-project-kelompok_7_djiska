package com.example.quizmasterchallenge123

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.quizmasterchallenge123.Activity_Quiz7
import com.example.quizmasterchallenge123.Activity_StoryBoard8

class Activity_halamanutama3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // HUBUNGKAN DENGAN XML
        setContentView(R.layout.activity_halamanutama3)

        // AMBIL BUTTON DARI XML
        val btnMulaiQuiz = findViewById<Button>(R.id.btnMulaiQuiz)
        val btnPengertian = findViewById<Button>(R.id.btnPengertian)
        val btnRiwayat = findViewById<Button>(R.id.btnRiwayat)

        // AKSI BUTTON "MULAI QUIZ"
        btnMulaiQuiz.setOnClickListener {
            val intent = Intent(this, Activity_IsiMateri5::class.java)
            startActivity(intent)
        }

        // AKSI BUTTON "PENGERTIAN C++"
        btnPengertian.setOnClickListener {
            val intent = Intent(this, Activity_IsiMateri5::class.java)
            startActivity(intent)
        }

        // AKSI BUTTON "RIWAYAT SKOR"
        btnRiwayat.setOnClickListener {
            val intent = Intent(this, Activity_StoryBoard8::class.java)
            startActivity(intent)
        }
    }
}
