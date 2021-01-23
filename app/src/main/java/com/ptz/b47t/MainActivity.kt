package com.ptz.b47t

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.widget.ArrayAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*

//////////////////////////////////////////
// Bloco de Comando Main é o principal
//////////////////////////////////////////
class MainActivity : AppCompatActivity()  {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arraySpinner = listOf<String>("1","2","3","4","5","6","7","8","9")
        val arrayAdapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner)


        //////////////////////////////////////////////////////////////
        // Chamada do Button myEntrada para acessar o Sistema
        //////////////////////////////////////////////////////////////
        val myEntrada = findViewById<Button>(R.id.myEntrada) as Button
        myEntrada.setOnClickListener {
            // Fazendou uso da biblioteca intent
            val intent = Intent(this, Sistema::class.java).apply {

                // Bloco de comando caso exista
            }
            // Iniciando o intent
            startActivity(intent)
        }


    }

}