package com.example.bmidannilaimhs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi : Button
    lateinit var btnNilai : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intentkeBMI()
        intentkeHitungNilai()
    }
    fun intentkeBMI(){
        btnBmi = findViewById(R.id.btnkebmi)

        btnBmi.setOnClickListener {
            var pindahBMI = Intent(this, HitungBMI::class.java)
            startActivity(pindahBMI)
        }
    }
    fun intentkeHitungNilai(){
        btnNilai = findViewById(R.id.btnkenilai)

        btnNilai.setOnClickListener {
            var pindahNilai = Intent(this, HitungNilaiMhs::class.java)
            startActivity(pindahNilai)
        }
    }
}