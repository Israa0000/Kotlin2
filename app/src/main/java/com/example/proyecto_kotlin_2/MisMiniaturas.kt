package com.example.proyecto_kotlin_2

class MisMiniaturas {
    companion object {
        fun cargarMiniaturas(): ArrayList<Miniaturas> {
            val listaAuxiliar: ArrayList<Miniaturas> = ArrayList<Miniaturas>()

            listaAuxiliar.add(Miniaturas(R.string.jotaro, R.drawable.jotaro))
            listaAuxiliar.add(Miniaturas(R.string.josuke, R.drawable.josuke))
            listaAuxiliar.add(Miniaturas(R.string.giorno, R.drawable.giorno))
            listaAuxiliar.add(Miniaturas(R.string.jolyne, R.drawable.jolyne))
            listaAuxiliar.add(Miniaturas(R.string.joseph_joestar, R.drawable.joseph_joestar))
            listaAuxiliar.add(Miniaturas(R.string.hangedman, R.drawable.hangedman))
            listaAuxiliar.add(Miniaturas(R.string.kars, R.drawable.kars))
            listaAuxiliar.add(Miniaturas(R.string.kenjiNigimura, R.drawable.keichonijimura))
            listaAuxiliar.add(Miniaturas(R.string.valentine, R.drawable.valentine))
            listaAuxiliar.add(Miniaturas(R.string.weather, R.drawable.weather))

            return listaAuxiliar
        }
    }
}