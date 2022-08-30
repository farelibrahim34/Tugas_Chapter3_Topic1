package com.example.bmidannilaimhs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungNilaiMhs : AppCompatActivity() {
    lateinit var Nama : EditText
    lateinit var Nim : EditText
    lateinit var Uas : EditText
    lateinit var Uts : EditText
    lateinit var Tugas : EditText
    lateinit var hitung : Button
    lateinit var buttonRisetNilai : Button
    lateinit var Hasil : TextView
    lateinit var Output : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_nilai_mhs)

        Nama = findViewById(R.id.inputNama)
        Nim = findViewById(R.id.inputNim)
        Uas = findViewById(R.id.inputUas)
        Uts = findViewById(R.id.inputUts)
        Tugas = findViewById(R.id.inputTugas)
        hitung = findViewById(R.id.btnHitungNilaiMhs)
        buttonRisetNilai = findViewById(R.id.btnRisetNilai)
        Hasil = findViewById(R.id.hasilNilai)
        Output = findViewById(R.id.outputNilai)

        hitung.setOnClickListener {
            var nama = Nama.text.toString()
            var nim = Nim.text.toString()
            var uas = Uas.text.toString().toInt()
            var uts = Uts.text.toString().toInt()
            var tugas = Tugas.text.toString().toInt()
            var rata = ((uas+uts+tugas)/3)
            var jml = (uas+uts+tugas)

            if (rata<=60){
                if (rata>=0){
                    Output.text = "Nama Mahasiswa :$nama" +
                            "\nNIM :$nim" +
                            "\nUAS :$uas" +
                            "\nUTS :$uts" +
                            "\nTugas :$tugas" +
                            "\nTotal :$jml" +
                            "\nRata-Rata Nilai :$rata" +
                            "\nNilai Huruf : F" +
                            "\nStatus : Tidak Lulus"
                }
            }else if (rata<=70){
                if (rata>=61){
                    Output.text = "Nama Mahasiswa :$nama" +
                            "\nNIM :$nim" +
                            "\nUAS :$uas" +
                            "\nUTS :$uts" +
                            "\nTugas :$tugas" +
                            "\nTotal :$jml" +
                            "\nRata-Rata Nilai :$rata" +
                            "\nNilai Huruf : D" +
                            "\nStatus : Tidak Lulus"
                }
            }else if (rata<=80){
                if (rata>=71){
                    Output.text = "Nama Mahasiswa :$nama" +
                            "\nNIM :$nim" +
                            "\nUAS :$uas" +
                            "\nUTS :$uts" +
                            "\nTugas :$tugas" +
                            "\nTotal :$jml" +
                            "\nRata-Rata Nilai :$rata" +
                            "\nNilai Huruf : C" +
                            "\nStatus : Lulus"
                }
            }else if (rata<=90){
                if (rata>=81){
                    Output.text = "Nama Mahasiswa :$nama" +
                            "\nNIM :$nim" +
                            "\nUAS :$uas" +
                            "\nUTS :$uts" +
                            "\nTugas :$tugas" +
                            "\nTotal :$jml" +
                            "\nRata-Rata Nilai :$rata" +
                            "\nNilai Huruf : B" +
                            "\nStatus : Lulus"
                }
            }
            else if (rata<=100){
                if (rata>=91){
                    Output.text = "Nama Mahasiswa :$nama" +
                            "\nNIM :$nim" +
                            "\nUAS :$uas" +
                            "\nUTS :$uts" +
                            "\nTugas :$tugas" +
                            "\nTotal :$jml" +
                            "\nRata-Rata Nilai :$rata" +
                            "\nNilai Huruf : A" +
                            "\nStatus : Lulus"
                }
            }

        }

        buttonRisetNilai.setOnClickListener {
            risetNilai()

        }
    }
    fun risetNilai(){
        Nama.setText("")
        Uas.setText("")
        Uts.setText("")
        Nim.setText("")
        Tugas.setText("")
        Output.setText("")

    }
}