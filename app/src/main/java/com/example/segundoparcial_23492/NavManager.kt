package com.example.segundoparcial_23492

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.segundoparcial_23492.info.Dragmodels
import kotlinx.serialization.Serializable

@Serializable
object Inicio
@Serializable
object ListaDragones

@Preview(showBackground = true)
@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Inicio){
        composable<Inicio>{
            Inicioview(navController)
        }
        composable<ListaDragones>{
            ListaDragones(navController)
        }
        composable<Dragmodels>{  //va la lista de nuestros datos
            val dragon: Dragmodels= it.toRoute<Dragmodels>()
            UnDragon(navegante = navController,dragon)
        }
    }
}

