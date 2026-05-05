package com.example.segundoparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.segundoparcial_23492.info.Dragmodels

//IMAGEN C
@Composable
fun UnDragon(navegante: NavHostController,dragon: Dragmodels) {

    var result by remember{mutableStateOf("")}

    Column(Modifier
        .fillMaxSize()
        .padding(12.dp)) {
    //imagen dragon mediana
         Image(
             painter = painterResource(dragon.Imagen_02),
             contentDescription = "imagen de dragon mediana",
             //contentScale = ContentScale.FillBounds,
             modifier = Modifier
                 .padding(10.dp)
                 .height(120.dp)
                 .align(Alignment.CenterHorizontally)
         )
    //nombre
        Text(text = dragon.Nombre, fontSize = 18.sp, textAlign = TextAlign.Center)
    //clase
        Row(Modifier.fillMaxWidth()) {
            Text(text = "Clase: ${dragon.Clase} ", fontWeight = FontWeight.Bold)
            Image(
                painter = painterResource(dragon.ClaseImg),
                contentDescription = "imagen de la clase",

                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.CenterVertically) ,
                contentScale = ContentScale.FillBounds
            )
        }
    //stats
         Column(Modifier.fillMaxWidth()) {
             Text(text = dragon.Descripcion)
             Text(text = "\nNivel de Peligro: ${dragon.NiveldePeligro}", fontWeight = FontWeight.Bold)
             Row(Modifier.fillMaxWidth()) {
                 Text(text = "¿Se puede entrenar? ")
                 Text(text = dragon.Entrenable, fontWeight = FontWeight.Bold)}
            Text(dragon.Recomendacion)

    //botones
            Text("¿Qué Haras?", fontSize = 16.sp,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
             Row(Modifier.fillMaxWidth(),
                 horizontalArrangement = Arrangement.SpaceEvenly) {
                 Button(onClick = {
                     if (dragon.Nombre== "Furia Nocturna"){
                         result= "A este vikingo le decian 'el macho',porque murio de la forma mas macha posible"
                     }else {
                        result= "¡Ehorabuena! Derrotaste al dragon ${dragon.Nombre} pero perdiste una pierna"
                     } }) { Text("Luchar") }
                 Button(onClick = {
                     if (dragon.Entrenable=="Sí"){
                        result=  "Felicidades, Entenaste a tu dragon y lo llamaste ${dragon.Apodo}"
                     }else{
                         result= "No pudiste entrenar al dragon y caiste en batalla"
                     } }) { Text("Entrenar") }
                 Button(onClick = { navegante.popBackStack() }) {Text("Huir") }

             }
             Text(result)

         }


    }
}

