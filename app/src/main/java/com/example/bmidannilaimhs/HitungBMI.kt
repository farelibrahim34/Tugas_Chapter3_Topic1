package com.example.bmidannilaimhs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungBMI : AppCompatActivity() {
    lateinit var Umur : EditText
    lateinit var Tb : EditText
    lateinit var Bb : EditText
    lateinit var buttonHitung : Button
    lateinit var buttonRiset : Button
    lateinit var hasilAkhir : TextView
    lateinit var kondisi : TextView





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bmi)

        Umur = findViewById(R.id.inputumur)
        Tb = findViewById(R.id.inputTb)
        Bb = findViewById(R.id.inputBb)
        buttonHitung = findViewById(R.id.btnhitung)
        buttonRiset = findViewById(R.id.btnRiset)
        hasilAkhir = findViewById(R.id.hasilBmi)
        kondisi = findViewById(R.id.output)

        buttonHitung.setOnClickListener{
            var umur = Umur.text.toString().toInt()
            var tb = Tb.text.toString().toDouble()
            var bb = Bb.text.toString().toDouble()
            var hasilBmi = bb/((tb)/100*(tb)/100)

            if (hasilBmi>=40){
                kondisi.text = "Umur Anda :$umur tahun"+
                        "\nTinggi :${tb.toInt()} cm"+
                        "\nBerat Badan :${bb.toInt()} kg"+
                        "\nBMI Anda :$hasilBmi"+
                        "\nKategori : Obesitas Kelas III"
            }else if (hasilBmi>=35){
                if (hasilBmi<40){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Obesitas Kelas II"
                }
            }else if (hasilBmi>=30){
                if (hasilBmi<35){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Obesitas Kelas I"
                }
            }else if (hasilBmi>=25){
                if (hasilBmi<30){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Gemuk"
                }
            }else if (hasilBmi>=18.5){
                if (hasilBmi<25){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Normal"
                }
            }else if (hasilBmi>=17){
                if (hasilBmi<18.5){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Sedikit Kurus"
                }
            }else if (hasilBmi>=16){
                if (hasilBmi<17){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Cukup Kurus"
                }
            }else if (hasilBmi>0){
                if (hasilBmi<16){
                    kondisi.text = "Umur Anda :$umur tahun"+
                            "\nTinggi :${tb.toInt()} cm"+
                            "\nBerat Badan :${bb.toInt()} kg"+
                            "\nBMI Anda :$hasilBmi"+
                            "\nKategori : Terlalu Kurus"
                }
            }
    }
        buttonRiset.setOnClickListener {
            risetData()
        }
    }
    fun risetData(){
        Umur.setText("")
        Bb.setText("")
        Tb.setText("")

    }
}