package com.jveliz.androidmaster.imccalculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.jveliz.androidmaster.R

class ImcCalculatorActivity : AppCompatActivity() {
// se declaran fuera del metodo onCreate para poder acceder a ellos desde cualquierr otro metodo dentro del activity
//    banderas para saber si se pulso un boton o cardview para cambiar el color
    private var isMaleSelected : Boolean = true
    private var isFemaleSelected : Boolean = false
    private var isSelected : Boolean=true

//  declaramos las variables de inicializacion tipo cardView
    private lateinit var viewMale:CardView
    private lateinit var viewFemale: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        //initComponent()
        //initListener()
    }
   /* // calculate funciones
    private fun initComponent(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }
    private  fun initListener(){
//        cuando se hace click se cambia el color del cardView
        viewMale.setOnClickListener { setGenderColor() }
        viewFemale.setOnClickListener { setGenderColor() }
    }

    private fun setGenderColor(){
        //aqui cambiamos los colores del cardView
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))


    }

    private fun getBackgroundColor(isViewSelected:Boolean):Int{

        // si esta seleccionado el componente y obtenemos el color para el seleccionado para male

        val colorReference = if (isViewSelected){
            R.color.background_component_selected // referencia al color
        }else{
            R.color.background_component
        }

        return ContextCompat.getColor(this,colorReference)
        //contextcompat aqui se obtienen el color

    }*/
}