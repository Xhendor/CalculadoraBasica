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

        if(origen==suma){
            resultado.text=suma(1f,3f).toString()
        }else if(origen==mult){
            System.err.println("Mult")

        }else if(origen==division){
            System.err.println("Division")


        }else if(origen==porc){

            System.err.println("Porc")

        }else if(origen==resta){
            System.err.println("Resta")


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
