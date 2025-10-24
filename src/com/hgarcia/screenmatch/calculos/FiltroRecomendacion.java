package com.hgarcia.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtrar(Clasificacion clasificacion) {
        if(clasificacion.getClasificacion() == 5){
            System.out.println("Muy bien evaluada por el público");
        }else {
            if(clasificacion.getClasificacion() == 4){
                System.out.println("Recomendada por el público");
            } else{
                if(clasificacion.getClasificacion() == 3){
                    System.out.println("Hay mejores opciones");
                } else {
                    if(clasificacion.getClasificacion() == 2){
                        System.out.println("Poco recomendable");
                    }else{
                        System.out.printf("Nada recomendable");
                    }
                }
            }
        }
    }
}