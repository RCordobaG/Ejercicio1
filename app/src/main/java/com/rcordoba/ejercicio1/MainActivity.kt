package com.rcordoba.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val createToast = Toast.makeText(this,"metodo onCreate",Toast.LENGTH_SHORT)
        createToast.show()

        val urlButton = findViewById<Button>(R.id.goToURLBtn)
        val data1Button = findViewById<Button>(R.id.startToData1Btn)
        val data2Button = findViewById<Button>(R.id.startToData2Btn)


        urlButton.setOnClickListener{
            val urlIntent = Intent(this,URLActivity::class.java)
            startActivity(urlIntent)
        }

        data1Button.setOnClickListener{
            val data1Intent = Intent(this,DataActivity1::class.java)
            startActivity(data1Intent)
        }

        data2Button.setOnClickListener{
            val data2Intent = Intent(this,DataActivity2::class.java)
            startActivity(data2Intent)
        }



    }

    override fun onResume(){
        super.onResume()
        val resumeToast = Toast.makeText(this,"metodo onResume",Toast.LENGTH_SHORT)
        resumeToast.show()
    }

    override fun onPause(){
        super.onPause()
        val pauseToast = Toast.makeText(this,"metodo onPause",Toast.LENGTH_SHORT)
        pauseToast.show()
    }

    override fun onDestroy(){
        super.onDestroy()
        val destroyToast = Toast.makeText(this,"metodo onDestroy",Toast.LENGTH_SHORT)
        destroyToast.show()
    }

    override fun onStart(){
        super.onStart()
        val startToast = Toast.makeText(this,"metodo onStart",Toast.LENGTH_SHORT)
        startToast.show()
    }


}