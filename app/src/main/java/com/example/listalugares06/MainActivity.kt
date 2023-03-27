package com.example.listalugares06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var txtmostraar: TextView
    val lugares = arrayOf("Tequila", "Magdalena", "Arenal", "Guadalajara", "Amatitan", "Sayula", "El grullo", "Guzman", "Tala", "Zacoalco", "Vallarta")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializar
        txtmostraar = findViewById(R.id.txtmostrar)

        val ListView: ListView = findViewById(R.id.list_view_lugares)

        val adaptador = ArrayAdapter(this, R.layout.list_item, lugares)

        ListView.adapter = adaptador

        ListView.onItemClickListener = object:AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val item = ListView.getItemAtPosition(p2) as String
                Log.e("Valor Lista", item)
                Toast.makeText(applicationContext, "El valor es $item", Toast.LENGTH_LONG).show()
                txtmostraar.text = item
            }
        }

    }
}