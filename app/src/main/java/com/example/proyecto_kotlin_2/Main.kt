package com.example.proyecto_kotlin_2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val jugadores = ArrayList<Jugador>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ejecutarPorConsola()
    }

    private fun ejecutarPorConsola() {
        jugadores.add(Jugador("Paqui", 22, "Mierdon33"))
        jugadores.add(Jugador("Luis", 19, "RDR2"))
        jugadores.add(Jugador("Laura", 21, "JJBA All-Star Battle R"))

        jugadoresToString(jugadores)
    }

    private fun jugadoresToString(jugadores: ArrayList<Jugador>) {
        for (jugador in jugadores) {
            Log.d("JugadoresListados", "${jugador.nombre}, que tiene ${jugador.edad} años, juega sobretodo a ${jugador.juego}")
        }
    }
}