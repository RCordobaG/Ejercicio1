package com.rcordoba.ejercicio1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date

class DataActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_1)

        val toStartBtn = findViewById<Button>(R.id.data1ToStartBtn)
        val toData2Btn = findViewById<Button>(R.id.data1ToData2Btn)



        toStartBtn.setOnClickListener {
            val startIntent = Intent(this,MainActivity::class.java)
            startActivity(startIntent)
        }

        val formato = SimpleDateFormat("HH:mm:ss")
        val date = Date()
        val currentDate = formato.format(date)


        toData2Btn.setOnClickListener{
            val data2Intent = Intent(this,DataActivity2::class.java).apply{
                putExtra("data1","Hola actividad 2")
                putExtra("date1",currentDate)
            }
            startActivity(data2Intent)
        }

    }

    override fun onStart(){
        super.onStart()
        val data1Text = findViewById<TextView>(R.id.data1Text)
        val data1Date = findViewById<TextView>(R.id.data1Date)
        data1Text.text = intent.getStringExtra("data2")
        data1Date.text = intent.getStringExtra("date2")
    }
}