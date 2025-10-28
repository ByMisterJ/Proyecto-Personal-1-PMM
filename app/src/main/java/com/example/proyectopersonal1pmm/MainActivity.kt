package com.example.proyectopersonal1pmm

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

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
                actualizarListaJugadores()
                playerInput.text.clear()
            } else if (jugadores.size >= 4) {
                Toast.makeText(this, "Máximo 4 jugadores", Toast.LENGTH_SHORT).show()
            }
        }


    }

}
