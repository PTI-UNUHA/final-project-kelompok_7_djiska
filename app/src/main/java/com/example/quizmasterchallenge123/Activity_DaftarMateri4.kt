package com.example.quizmasterchallenge123

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity_DaftarMateri4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_materi4)

        val btnPengertian = findViewById<Button>(R.id.btnPengertian)
        val btnKelas = findViewById<Button>(R.id.btnKelas)

        btnPengertian.setOnClickListener {
            startActivity(
                Intent(this, Activity_IsiMateri5::class.java)
            )
        }

        btnKelas.setOnClickListener {
            startActivity(
                Intent(this, Activity_IsiMateri6::class.java)
            )
        }
    }
}
