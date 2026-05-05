package com.example.segundoparcial_23492

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.segundoparcial_23492.info.Drag


//IMAGEN B
@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun ListaDragones(navegante: NavHostController){
    val vm = Drag()

    LazyColumn( Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween, horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            Row() {
                Text("Elije un Dragón")
                Button({navegante.popBackStack()}) {//regresar a inicio
                    Text("Cerrar Libro") }
            }
        }
        items(vm.getDragon()){
            CardDragon(navegante = navegante, it) }
    }

    }
