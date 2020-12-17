package com.example.calculadordeimportacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_logged_in.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)
            auth = FirebaseAuth.getInstance()
            btnCerrarSesion.setOnClickListener {
                auth.signOut()
                finish()

            }

    }

    fun Calcular(view: View) {
        val bSuma: Button = findViewById(R.id.btnCalcular)
        bSuma.setOnClickListener {
            val intent = Intent(this, CalcularActivity::class.java)
            startActivity(intent)
        }
    }
}





