package br.com.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DistancActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distanc)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val preco = intent.getFloatExtra("preco", 0f)
        val consumo = intent.getIntExtra("consumo", 0)
        val distancia = findViewById<EditText>(R.id.edt_km)


        btnCalcular.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("consumo", consumo)
            intent.putExtra("preco", preco)
            intent.putExtra("distancia", distancia.text.toString().toInt())
            startActivity(intent)
        }
    }
}