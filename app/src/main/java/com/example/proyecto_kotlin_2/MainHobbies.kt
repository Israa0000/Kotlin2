package com.example.proyecto_kotlin_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyecto_kotlin_2.ui.theme.Proyecto_kotlin_2Theme

class MainHobbies : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Proyecto_kotlin_2Theme {
                HobbiesApp()
            }
        }
    }

    @Composable
    fun HobbiesApp(){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){

        }
    }

    @Composable
    fun HobbiesGrid(){
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
        ){

        }
    }


    @Composable
    fun HobbiesCard(modifier : Modifier = Modifier){
        Card(

        ){
            Row (

            ){
                Image(
                    painter = painterResource(R.drawable.weather),
                    contentDescription = null
                )
                Box(){
                    Column (

                    ){
                        Text(
                            text = "Weather Report",
                        )
                        Row() {
                            Icon(
                                painter = painterResource(R.drawable.ic_launcher_foreground),
                                contentDescription = null
                            )
                            Text(
                                text = ""
                            )
                        }
                    }
                }
            }

        }
    }

    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    fun HobbiesAppPreview() {
        Proyecto_kotlin_2Theme() {
            HobbiesApp()
        }
    }
}

