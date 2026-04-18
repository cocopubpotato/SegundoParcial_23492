package com.example.segundoparcial_23492

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.segundoparcial_23492.info.Drag

@Composable
fun NavManager() {
    val navController = rememberNavController()
    val DragQ = remember { Drag().getDragon() }
    val DragSel = remember { mutableIntStateOf(0) }



    NavHost(navController, startDestination = "Inicio"){
        composable("Inicio"){
            Inicio(navegante = navController)
        }
        composable("ListaDragones"){
            ListaDragones(navegante = navController,DragQ,DragSel)
        }
        composable("UnDragon"){
            UnDragon(navegante = navController,DragSel)
        }
    }

}
