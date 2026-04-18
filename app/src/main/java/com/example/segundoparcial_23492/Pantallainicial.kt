package com.example.segundoparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


//IMAGEN A
@Composable
fun Inicio(navegante: NavHostController){
    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End
        , verticalArrangement = Arrangement.SpaceAround
        ) {
        OutlinedButton(onClick = {navegante.navigate(route="ListaDragones")}) {  //lista
            Text("Abrir",fontSize = 14.sp , textAlign = TextAlign.Center, color =Color.White ) }
        Image(painter = painterResource(R.drawable.libro),
            modifier = Modifier.fillMaxSize(), contentDescription = "libro",
            contentScale = ContentScale.FillBounds)

        }


}