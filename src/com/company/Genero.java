package com.company;

public enum Genero {
    MACHO(0),
    HEMBRA(1);

    private final int genero;
    private Genero(int g){
        genero=g;
    }

    public int getGenero() {
        return genero;
    }
}
