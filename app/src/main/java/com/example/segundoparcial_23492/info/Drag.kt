package com.example.segundoparcial_23492.info

import androidx.lifecycle.ViewModel
import com.example.segundoparcial_23492.R

class Drag : ViewModel(){
    fun getDragon(): List<Dragmodels>
    {
        val dragona= Dragmodels(num = 1, Nombre = ",Trueno Tambor",Apodo = ",Thornado",
            Entrenable = ",Sí", Clase = ",Marejada",
            Descripcion = ",Este solitario dragon habita en cuevas y estanques marinos, si se le molesta puede producir un golpe de sonido que mata hombres a corta distancia",
            Recomendacion = ",Tirar  a Matar",
            ",En extremo peligroso",
            Imagen_01 = R.drawable.trueno01,
            Imagen_02 = R.drawable.trueno02,
            R.drawable.marejeada)
        val dragonb= Dragmodels(num = 1, Nombre = ",Trueno Tambor",Apodo = ",Thornado",
            Entrenable = ",Sí", Clase = ",Marejada",
            Descripcion = ",Este solitario dragon habita en cuevas y estanques marinos, si se le molesta puede producir un golpe de sonido que mata hombres a corta distancia",
            Recomendacion = ",Tirar  a Matar",
            ",En extremo peligroso",
            Imagen_01 = R.drawable.trueno01,
            Imagen_02 = R.drawable.trueno02,
            R.drawable.marejeada)
        val dragonc= Dragmodels(num = 2, Nombre = ",Cortaleña",
            Apodo = ",Trepatroncos",
            Entrenable = ",Sí",
            Clase = ",Afilada",
            Descripcion = ",Esta enorme criatura tiene alas afiladas que pueden cortar árboles maduros",
            Recomendacion = ",Tirar  a Matar",
            NiveldePeligro = ",En extremo peligroso",
            Imagen_01 = R.drawable.cortalena01,
            Imagen_02 = R.drawable.cortalena02,
            ClaseImg = R.drawable.afilada)
        val dragond= Dragmodels(3,
            Nombre= "Caldero",
            Apodo= "Scauldy",
            Entrenable= "Sí",
            Clase= "Marejada",
            Descripcion= "Rocía agua hirviendo a sus víctimas",
            Recomendacion= "Portar escudo y Tirar  a Matar",
            NiveldePeligro= "En extremo peligroso",
            Imagen_01= R.drawable.caldero01,
            Imagen_02= R.drawable.caldero02,
            R.drawable.marejeada)
        val dragone= Dragmodels(4,
            Nombre= "Metamorfala",
            Apodo="",
            Entrenable= "No",
            Clase= "Misterio",
            Descripcion=  "Recién salidos del huevo ya rocían ácido",
            Recomendacion="Tirar  a Matar",
            "Sumamente Peligroso",
            Imagen_01= R.drawable.metamorfala01,
            Imagen_02= R.drawable.metamorfala02,
            R.drawable.misterio)
        val dragonf= Dragmodels(5,
            Nombre= "Muerte Susurrante",
            Apodo= "Dientes",
            Entrenable= "No",
            Clase= "Piedra",
            Descripcion=  "Asfixia a sus víctimas, las entierra, las quema, las voltea como a calcetines",
            Recomendacion= "Tirar  a Matar",
            "En extremo peligroso",
            Imagen_01= R.drawable.muerte01,
            Imagen_02= R.drawable.muerte02,
            R.drawable.piedra)
        val dragong= Dragmodels(6,
            Nombre= "Furia Nocturna",
            Apodo= "Chimuelo//Dientes",
            Entrenable= "Sí",
            Clase= "Embestida",
            Descripcion= "Rapidez= Desconocida" +
                    "        Tamaño= Desconocido" +
                    "        La cría maligna del relámpago y la muerte misma. Nunca enfrentar a este dragon.",
            Recomendacion= "Tu única salida= Esconderte e implorar que no te encuentre",
            "S+++",
            Imagen_01= R.drawable.furia01,
            Imagen_02= R.drawable.furia02,
            R.drawable.embestida)

        val dmodels =listOf<Dragmodels>(dragona,dragonb,dragonc,dragond,dragone,dragonf,dragong)

        return dmodels
}
}