package com.jveliz.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.jveliz.androidmaster.AppUno.AppUnoActivity
import com.jveliz.androidmaster.AppUno.MimenuActivity
import com.jveliz.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnOpenGreet = findViewById<AppCompatButton>(R.id.btnOpenGreet)
        btnOpenGreet.setOnClickListener { navigateOnGreet() }

        val btnOpenImc = findViewById<AppCompatButton>(R.id.btnOpenImc)
        btnOpenImc.setOnClickListener { navigateOnImc() }
    }

    private fun navigateOnGreet(){
        val intent = Intent(this, AppUnoActivity::class.java)
        startActivity(intent)
    }
    private fun navigateOnImc(){
        val intent = Intent(this,ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
}