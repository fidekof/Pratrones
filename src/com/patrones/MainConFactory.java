package com.patrones;

import com.patrones.figuras.FiguraI;
import com.patrones.figuras.FigurasFact;

import java.util.Random;

public class MainConFactory {
    public static void main(String[] args) {
        int max = 3, min=1, iter=20, tipoFigura;
        FigurasFact figurasFact = new FigurasFact();
        FiguraI figuraI;
        for(int i=1; i < iter+1; i++)
        {
            figuraI = figurasFact.getInstancia(randomEntero(max, min));
            figuraI.Dibujar();
        }
    }

    private static int randomEntero(int max, int min){
        return (new Random()).nextInt((max-min)+1)+min;
    }
}
