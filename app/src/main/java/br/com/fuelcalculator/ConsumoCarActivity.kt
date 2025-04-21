package br.com.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ConsumoCarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumo_car)

        val btnProximo = findViewById<Button>(R.id.btn_proximo)
        val preco = intent.getFloatExtra("preco", 0f)
        val consumo = findViewById<EditText>(R.id.edt_consumo)

        btnProximo.setOnClickListener {
            val intent = Intent(this, DistancActivity::class.java)
            intent.putExtra("consumo", consumo.text.toString().toInt())
            intent.putExtra("preco", preco)
            startActivity(intent)
        }
    }
}