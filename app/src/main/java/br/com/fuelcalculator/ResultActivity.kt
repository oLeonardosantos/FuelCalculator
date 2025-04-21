package br.com.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnNew = findViewById<Button>(R.id.btn_new)
        val preco = intent.getFloatExtra("preco", 0f)
        val consumo = intent.getIntExtra("consumo", 0)
        val distancia = intent.getIntExtra("distancia", 0)

        val resultPreco = findViewById<TextView>(R.id.price_resultado)
        val resultConsumo = findViewById<TextView>(R.id.consumo_resultado)
        val resultKm = findViewById<TextView>(R.id.km_resultado)

        resultPreco.text = "R$ %.2f".format(preco)
        resultConsumo.text = "$consumo km/L"
        resultKm.text = "$distancia km"

        val result = (distancia.toFloat() / consumo.toFloat()) * preco
        val tvResult = findViewById<TextView>(R.id.result)
        tvResult.text = "$ %.2f".format(result)

        btnNew.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}