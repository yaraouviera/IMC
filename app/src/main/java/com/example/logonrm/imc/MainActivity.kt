package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalcular.setOnClickListener {
            val telaResultado = Intent (this, ResultadoActivity::class.java)

            telaResultado.putExtra("Peso", inputPeso.editText?.text.toString())

            telaResultado.putExtra("Altura", inputAltura.editText?.text.toString())

            startActivity(telaResultado)

        }


        btLimpar.setOnClickListener {


            //digite seu comenstop
            // ? significa q evita nuul pointer
            //!! executad de qq forma, pode dar no pointer --- excessao n cracha o aap
            inputAltura.editText?.setText ("")
            inputPeso.editText?.setText("")

        }
    }
}
