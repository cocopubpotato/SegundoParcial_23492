package com.example.segundoparcial_23492.info

import kotlinx.serialization.Serializable


//serial porque se usa en multo¡iples vistas y asi solo se seleccionan los datos en lugar de tener que mandar todo
@Serializable
data class Dragmodels(
    val num: Int,
    val Nombre: String,
    val Apodo: String,
    val Entrenable: String,
    val Clase: String,
    val Descripcion: String,
    val Recomendacion: String,
    val NiveldePeligro: String,
    val Imagen_01:Int,
    val Imagen_02: Int,
    val ClaseImg: Int
)