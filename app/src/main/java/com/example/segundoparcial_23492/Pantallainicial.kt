package com.example.segundoparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Inicio(){
    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        //, verticalArrangement = Arrangement.SpaceEvenly
        ) {
        Image(painter = painterResource(R.drawable.libro),
            modifier = Modifier.fillMaxSize(), contentDescription = "libro",
            contentScale = ContentScale.FillBounds)
        OutlinedButton(onClick = {}, ) {  //lista
            Text("Abrir",fontSize = 14.sp , textAlign = TextAlign.Center)
        }
    }

}