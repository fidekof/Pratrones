package com.patrones.figuras;

public class FigurasFact {
    public FiguraI getInstancia(int typoFigura)
    {
        switch (typoFigura)
        {
            case 1: return new Circulo();
            case 2: return new Cuadrado();
            case 3: return  new Triangulo();
            // case 4: return new Pentagono();
            default: return null;
        }

    }
}
