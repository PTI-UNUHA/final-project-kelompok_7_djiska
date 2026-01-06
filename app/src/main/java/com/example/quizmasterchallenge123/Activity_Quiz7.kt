package com.example.quizmasterchallenge123

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizmasterchallenge123.Activity_StoryBoard8
import com.example.quizmasterchallenge123.R

class Activity_Quiz7 : AppCompatActivity() {

    private var life = 3
    private var score = 0

    lateinit var love1: ImageView
    lateinit var love2: ImageView
    lateinit var love3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz7) // GANTI sesuai nama XML kamu

        // LOVE
        love1 = findViewById(R.id.love1)
        love2 = findViewById(R.id.love2)
        love3 = findViewById(R.id.love3)

        // BUTTON
        val btnA = findViewById<Button>(R.id.btnA)
        val btnB = findViewById<Button>(R.id.btnB)
        val btnC = findViewById<Button>(R.id.btnC)
        val btnD = findViewById<Button>(R.id.btnD)
        val btnHome = findViewById<Button>(R.id.btnHome)

        // JAWABAN BENAR = C
        btnA.setOnClickListener { salah() }
        btnB.setOnClickListener { salah() }
        btnC.setOnClickListener { benar() }
        btnD.setOnClickListener { salah() }

        btnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun benar() {
        score += 10
        Toast.makeText(this, "Jawaban Benar! +10", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, Activity_StoryBoard8::class.java)
        intent.putExtra("score", score)
        startActivity(intent)
        finish()
    }

    private fun salah() {
        life--
        Toast.makeText(this, "Jawaban Salah!", Toast.LENGTH_SHORT).show()
        updateLife()

        if (life == 0) {
            Toast.makeText(this, "Game Over!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Activity_StoryBoard8::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }

    private fun updateLife() {
        when (life) {
            2 -> love3.setImageResource(R.drawable.ic_heart)
            1 -> love2.setImageResource(R.drawable.ic_heart)
            0 -> love1.setImageResource(R.drawable.ic_heart)
        }
    }
}
