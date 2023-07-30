package com.jveliz.androidmaster.AppUno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.jveliz.androidmaster.R

class AppUnoActivity : AppCompatActivity() {

    //override es la funcion prinncipal , corre al arrancar la app
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView es la pantalla inicial
        setContentView(R.layout.activity_app_uno)

        val btnClick = findViewById<AppCompatButton>(R.id.btnClick)
        val ediText = findViewById<AppCompatEditText>(R.id.Editexto)


        btnClick.setOnClickListener {

            val textIn = ediText.text.toString()

            if (textIn.isNotEmpty()){
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",textIn)
                startActivity(intent)
            }

        }



    }
}