package com.uabc.edu.calculadora.basica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uabc.edu.calculadora.basica.`interface`.Operaciones
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Operaciones,View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suma.setOnClickListener(this)
        resta.setOnClickListener(this)
        mult.setOnClickListener(this)
        division.setOnClickListener(this)
        porc.setOnClickListener(this)
    }

    override fun onClick(origen: View?) {

       /*Modo conocido tipo IF/ELSE

       if(origen==suma){
            resultado.text=suma( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
        }else if(origen==mult){
            resultado.text=multiplicacion( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()

        }else if(origen==division){
            resultado.text=division( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()


        }else if(origen==porc){

            resultado.text=porcentaje( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()

        }else if(origen==resta){
            resultado.text=resta( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
        }*/

        //MODO RECOMENDADO EN KOTLIN
        when (origen) {
            suma -> resultado.text=suma( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
            mult -> resultado.text=multiplicacion( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
            division -> resultado.text=division( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
            porc -> resultado.text=porcentaje( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
            resta -> resultado.text=resta( numeroA.text.toString().toFloat(),numeroB.text.toString().toFloat()).toString()
        }

    }

    override fun suma(valorA: Float, valorB: Float): Float {
        return valorA +valorB
    }

    override fun resta(valorA: Float, valorB: Float): Float {
        return valorA-valorB
    }

    override fun division(valorA: Float, valorB: Float): Float {
        return valorA /valorB
    }

    override fun multiplicacion(valorA: Float, valorB: Float): Float {
        return valorA*valorB
    }

    override fun porcentaje(valorA: Float, valorB: Float): Float {

        return valorA*(valorB/100)
    }


}
