package com.example.segundoparcial_23492.info

import com.example.segundoparcial_23492.R

class Drag {

    fun selected(dragnum: Int) :List<Dragmodels> {        //variable llama a la data class
        return when (dragnum) {
            1 -> getDragon()

            else -> getnone()
        }
    }

    fun getnone(): List<Dragmodels> {
        val msg = mutableListOf<Dragmodels>()
        msg.add(Dragmodels(
                num = 1, Nombre = "Trueno Tambor", Apodo = "Thornado",
                Entrenable = "Sí", Clase = "Marejada",
                Descripcion = "Este solitario dragón habita en cuevas y estanques marinos, si se le molesta puede producir un golpe de sonido que mata hombres a corta distancia",
                Recomendacion = "Tirar  a Matar",
                "En extremo peligroso",
                Imagen_01 = R.drawable.trueno01,
                Imagen_02 = R.drawable.trueno02,
                R.drawable.marejeada
            )
        )
        return msg
    }

    fun getDragon(): List<Dragmodels> {
        val dragmodels = mutableListOf<Dragmodels>()
        dragmodels.add(
            Dragmodels(
                num = 1, Nombre = "Trueno Tambor", Apodo = "Thornado",
                Entrenable = "Sí", Clase = "Marejada",
                Descripcion = "Este solitario dragón habita en cuevas y estanques marinos, si se le molesta puede producir un golpe de sonido que mata hombres a corta distancia",
                Recomendacion = "Tirar  a Matar",
                "En extremo peligroso",
                Imagen_01 = R.drawable.trueno01,
                Imagen_02 = R.drawable.trueno02,
                R.drawable.marejeada
            )
        )
        dragmodels.add(
            Dragmodels(
                num = 1, Nombre = "Cortaleña",
                Apodo = "Trepatroncos",
                Entrenable = "Sí",
                Clase = "Afilada",
                Descripcion = "Esta enorme criatura tiene alas afiladas que pueden cortar árboles maduros",
                Recomendacion = "Tirar  a Matar",
                NiveldePeligro = "En extremo peligroso",
                Imagen_01 = R.drawable.cortalena01,
                Imagen_02 = R.drawable.cortalena02,
                ClaseImg = R.drawable.afilada
            )
        )










        return dragmodels
    }
}