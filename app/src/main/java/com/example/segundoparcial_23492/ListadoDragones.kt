package com.example.segundoparcial_23492

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.segundoparcial_23492.info.Dragmodels


//IMAGEN B
@Preview(showBackground = true)
@Composable
fun ListaDragones(navegante: NavHostController, dragones: List<Drag>, seleccionada: MutableState<Int> ){

    Column(Modifier.fillMaxSize().padding(10.dp), verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally){
    Row() {
        Text("Elije un Dragón")
        Button({}) {//regresar a inicio
            Text("Cerrar Libro") }
    }

        LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
            items(dragones) { drag ->
                Card(
                    modifier = Modifier.height(250.dp).fillMaxWidth().padding(8.dp)
                        .clickable {
                            seleccionada.value= drag.num         //variable de la id del modelo que vamos a seleccionar
                        navegante.navigate(route="Dragones"
                    )
                        },
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row {
                            Image(
                                painter = painterResource(drag.Imagen01),
                                contentDescription = "imagen de dragon",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.size(80.dp).align(Alignment.CenterVertically)
                            )

                            Image(
                                painter = painterResource(drag.Clase),
                                contentDescription = "imagen de dragon",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.height(42.dp).width(64.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            Column(modifier = Modifier.padding(5.dp)) {
                                Spacer(modifier = Modifier.size(10.dp))
                                Text(drag.Nombre, fontSize = 20.sp, textAlign = TextAlign.Center,)
                                Spacer(modifier = Modifier.size(10.dp))

                            }
                        }

                    }
                }
            }
        }
    }
}