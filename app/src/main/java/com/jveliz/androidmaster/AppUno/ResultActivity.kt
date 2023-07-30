package com.jveliz.androidmaster.AppUno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jveliz.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val textResult = findViewById<TextView>(R.id.textResult)
        val xName : String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        textResult.text ="Hola $xName"
    }
}