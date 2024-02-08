package com.rcordoba.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date

class DataActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_2)

        val toStartBtn = findViewById<Button>(R.id.data2ToStartBtn)
        val toData1Btn = findViewById<Button>(R.id.data2ToData1Btn)



        toStartBtn.setOnClickListener {
            val startIntent = Intent(this,MainActivity::class.java)
            startActivity(startIntent)
        }

        val formato = SimpleDateFormat("HH:mm:ss")
        val date = Date()
        val currentDate = formato.format(date)

        toData1Btn.setOnClickListener{
            val data1Intent = Intent(this,DataActivity1::class.java).apply{
                putExtra("data2","Hola actividad 1")
                putExtra("date2",currentDate)
            }
            startActivity(data1Intent)
        }
    }

    override fun onStart(){
        super.onStart()
        val data2Text = findViewById<TextView>(R.id.data2Text)
        val data2Date = findViewById<TextView>(R.id.data2Date)
        data2Text.text = intent.getStringExtra("data1")
        data2Date.text = intent.getStringExtra("date1")
    }
}