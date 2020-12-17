package com.example.calculadordeimportacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    public var numero = 0
    public var dolares = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun Regresar(view: View) {
        val bSuma: Button = findViewById(R.id.btnRegresar)
        bSuma.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    fun Suma(view: View) {
        val bSuma: Button = findViewById(R.id.btnSumar)
        var textoMostrado: TextView = findViewById(R.id.txtPeso)
        var txtprecio: TextView = findViewById(R.id.txtResultado)
        bSuma.setOnClickListener {
            numero = numero + 1
            txtPeso.text = numero.toString()
            dolares = dolares + 300
            txtprecio.text = dolares.toString()
        }

    }

    fun Resta(view: View) {
        val bnegativo: Button = findViewById(R.id.btnRestar)
        var textoMostrado: TextView = findViewById(R.id.txtPeso)
        var txtprecio: TextView = findViewById(R.id.txtResultado)
        bnegativo.setOnClickListener {
            if(numero >=1){

                numero = numero - 1
                txtPeso.text = numero.toString()
                dolares = dolares - 300
                txtResultado.text = dolares.toString()
            }}

    }
}
