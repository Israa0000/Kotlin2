package com.example.proyecto_kotlin_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorInt
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyecto_kotlin_2.ui.theme.Proyecto_kotlin_2Theme

class Galeria : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Proyecto_kotlin_2Theme {
            GaleriaApp()
            }
        }
    }
    @Composable
    fun GaleriaApp(){

        var listaMiniaturas : ArrayList<Miniaturas> = MisMiniaturas()
        LazyColumn (

        ){

        }
    }

    @Composable
    fun MiniaturaCarta(mini : Miniaturas, modifier : Modifier = Modifier){
        Card(
            modifier = modifier
        ){
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(mini.imagenMiniatura),
                    contentDescription = stringResource(mini.nombreMiniatura),//solo aparece si la imagen no carga
                    modifier = Modifier.size(500.dp,500.dp)
                )
                Text(
                    text = stringResource(mini.nombreMiniatura),
                    modifier = Modifier.padding(top = 16.dp),
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GaleriaAppPreview() {
        Proyecto_kotlin_2Theme {
            GaleriaApp()
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun CardPreview() {
        Proyecto_kotlin_2Theme {
            MiniaturaCarta(Miniaturas(R.string.weather,R.drawable.weather))
        }
    }
}
