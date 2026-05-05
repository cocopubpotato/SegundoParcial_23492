package com.example.segundoparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.segundoparcial_23492.info.Dragmodels

@Composable
fun CardDragon(navegante: NavHostController, dragon: Dragmodels){
    Card(
        modifier = Modifier.height(250.dp).fillMaxWidth().padding(8.dp)
            .clickable { navegante.navigate(route= dragon) },
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row {
                Image(
                    painter = painterResource(dragon.Imagen_01),
                    contentDescription = "imagen de dragon",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(80.dp).align(Alignment.CenterVertically)
                        )
                Image(
                    painter = painterResource(dragon.ClaseImg),
                    contentDescription = "imagen de dragon",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(42.dp).width(64.dp)
                        .align(Alignment.CenterVertically)
                )
                Column(modifier = Modifier.padding(5.dp)) {
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(dragon.Nombre, fontSize = 20.sp, textAlign = TextAlign.Center)
                    Spacer(modifier = Modifier.size(10.dp))
                }
            }
        }
    }
}