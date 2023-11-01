package br.com.fiap.desafio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showImc()
    }

    fun showImc() {
        var sexoView = findViewById<RadioGroup>(R.id.btnGroup)

        var sexo = sexoView.checkedRadioButtonId

        var alturaView = findViewById<EditText>(R.id.altura).text.toString()

        var altura = ""

        var pesoIdeal = findViewById<Button>(R.id.pesoIdeal)

        pesoIdeal.setOnClickListener{
            if(sexo == R.id.btnMasc){
                altura += "${(72.7 * alturaView.toFloat()) - 58}"
            } else if(sexo == R.id.btnFem) {
                altura += "${(62.1 * alturaView.toFloat()) - 44.7}"
            }
            Toast.makeText(this, altura, Toast.LENGTH_LONG).show()
        }

    }
}