package com.example.proyecto_kotlin_2

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hobby(@StringRes val nombreHobby : Int, val availableNumber : Int, @DrawableRes val imagenHobby : Int)
