package com.example.segundoparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.segundoparcial_23492.info.Dragmodels

//IMAGEN C
@Composable
fun UnDragon(navegante: NavHostController,dragon: Dragmodels) {
    Column(Modifier
        .fillMaxSize()
        .padding(10.dp)) {
    //imagen dragon mediana
         Image(
             painter = painterResource(dragon.Imagen_02),
             contentDescription = "imagen de dragon mediana",
             contentScale = ContentScale.FillBounds,
             modifier = Modifier
                 .height(120.dp)
                 .align(Alignment.CenterHorizontally)
         )
    //nombre
        Text(text = dragon.Nombre, fontSize = 18.sp, textAlign = TextAlign.Center)
    //clase
        Row() {
            Text(text = dragon.Clase)
            Image(
                painter = painterResource(dragon.ClaseImg),
                contentDescription = "imagen de la clase",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(15.dp)
                    .align(Alignment.CenterVertically)
                    )
                }
                //stats
                Row() {
                    Text(text = dragon.Descripcion)
                    Text(text = dragon.NiveldePeligro)
                    Text(text = "¿Se puede entrenar?  ${dragon.Entrenable}")
                }
                //botones
        Button(onClick = { navegante.popBackStack() }) {Text("Regresar") }
    }
}
