package com.jveliz.androidmaster.AppUno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.jveliz.androidmaster.R

class MimenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mimenu)

        val btnSaludApp = findViewById<AppCompatButton>(R.id.btnSaludApp)
        btnSaludApp.setOnClickListener { navigateToSaludApp() }

        val btnImcApp = findViewById<AppCompatButton>(R.id.btnImcApp)
        btnImcApp.setOnClickListener { navigateToImcApp() }
    }
    private fun navigateToSaludApp(){
        val intent = Intent(this,AppUnoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp(){

    }
}