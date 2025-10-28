package com.example.proyectopersonal1pmm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
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
}
