package com.example.proyectopersonal1pmm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val jugadores = mutableListOf<String>()
    private lateinit var playerInput: EditText
    private lateinit var playerList: TextView
    private lateinit var extremidadText: TextView
    private lateinit var colorText: TextView
    private lateinit var spinButton: Button
    private lateinit var addPlayerButton: Button

    private val extremidades = listOf("Mano izquierda", "Mano derecha", "Pie izquierdo", "Pie derecho")
    private val colores = listOf("Rojo", "Azul", "Verde", "Amarillo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        playerInput = findViewById(R.id.playerInput)
        playerList = findViewById(R.id.playerList)
        extremidadText = findViewById(R.id.extremidadText)
        colorText = findViewById(R.id.colorText)
        spinButton = findViewById(R.id.spinButton)
        addPlayerButton = findViewById(R.id.addPlayerButton)

        addPlayerButton.setOnClickListener {
            val nombre = playerInput.text.toString().trim()
            if (nombre.isNotEmpty() && jugadores.size < 4) {
                jugadores.add(nombre)
                playerInput.text.clear()
            } else if (jugadores.size >= 4) {
                Toast.makeText(this, "Máximo 4 jugadores", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Introduce un nombre", Toast.LENGTH_SHORT).show()
            }
        }

        spinButton.setOnClickListener {
            if (jugadores.isEmpty()) {
                Toast.makeText(this, "Añade al menos un jugador", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val jugador = jugadores.random()
            val extremidad = extremidades.random()
            val color = colores.random()

            extremidadText.text = "Extremidad: $extremidad"
            colorText.text = "Color: $color"

            Toast.makeText(this, "$jugador → $extremidad en $color", Toast.LENGTH_LONG).show()
        }
    }

}
