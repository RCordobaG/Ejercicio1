package com.rcordoba.ejercicio1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class URLActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urlactivity)

        val urlButton = findViewById<Button>(R.id.goToURLBtn)
        val toStartBtn = findViewById<Button>(R.id.urlToStartBtn)
        val toData1Btn = findViewById<Button>(R.id.urlToData1Btn)
        val toData2Btn = findViewById<Button>(R.id.urlToData2Btn)


        urlButton.setOnClickListener {
            val urlIntent = Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.didthanoskill.me"))
            startActivity(urlIntent)
        }

        toStartBtn.setOnClickListener {
            val startIntent = Intent(this,MainActivity::class.java)
            startActivity(startIntent)
        }

        toData1Btn.setOnClickListener {
            val data1Intent = Intent(this,DataActivity1::class.java)
            startActivity(data1Intent)
        }

        toData2Btn.setOnClickListener {
            val data2Intent = Intent(this,DataActivity2::class.java)
            startActivity(data2Intent)
        }
    }

}