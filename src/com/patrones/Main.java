package com.patrones;

import com.patrones.figuras.Circulo;
import com.patrones.figuras.Cuadrado;
import com.patrones.figuras.Pentagono;
import com.patrones.figuras.Triangulo;

import java.util.Random;

public class Main {

    private static int randomEntero(int max, int min){
        return (new Random()).nextInt((max-min)+1)+min;
    }

    public static void main(String[] args) {
	// write your code here
        int max = 4, min=1, iter=10, tipoFigura;
        for(int i=1; i < iter+1; i++)
        {
            tipoFigura = randomEntero(max, min);
            if(tipoFigura==1){
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.Dibujar();
            }

            if(tipoFigura==2){
                Circulo circulo = new Circulo();
                circulo.Dibujar();
            }

            if(tipoFigura==3){
                Triangulo triangulo = new Triangulo();
                triangulo.Dibujar();
            }

            if(tipoFigura==4){
                Pentagono pentagono = new Pentagono();
                pentagono.Dibujar();
            }
        }
    }
}
