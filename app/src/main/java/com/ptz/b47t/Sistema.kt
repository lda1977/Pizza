package com.ptz.b47t

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

class Sistema : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema)

        ///////////////////////////////////////////////////
        // Spiner
        ///////////////////////////////////////////////////




        ////////////////////////////////////////////////////
        //Button para a entrada do Estoque
        ///////////////////////////////////////////////////
        val myEstoque = findViewById<Button>(R.id.myEstoque) as Button

        myEstoque.setOnClickListener {
            val intent = Intent(this, Estoque::class.java).apply{
                // Pode ser colocado um bloco de comando caso necessario
            }
            startActivity(intent)
        } // Fim Bloco Button Estoque

        ////////////////////////////////////////////////////
        //Button para a entrada das Bolinhas
        ///////////////////////////////////////////////////
        val myBolinha = findViewById<Button>(R.id.myBolinha) as Button

        myBolinha.setOnClickListener {
            val intent = Intent (this, Bolinha::class.java).apply{
                //Bloco de comando caso exista
            }
            startActivity(intent)
        } // Fim Button Bolinhas

        ////////////////////////////////////////////////////
        //Button para a entrada da Montagen
        ///////////////////////////////////////////////////
        val myMontagen = findViewById<Button>(R.id.myMontagen) as Button

        /*
        myMontagen.setOnClickListener {
            val intent = Intent(this, Montagen::class.java).apply{
                // Bloco comando caso necessario
            }
            startActivity(intent)
        } // Fim Bloco Button Montagen


         */
    }
}