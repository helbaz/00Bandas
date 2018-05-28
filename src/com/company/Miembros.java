package com.company;

import acm.graphics.GImage;

import java.util.Random;

public class Miembros extends Humanos{
    private Genero genero;
    @Override
    public void setImagen(String ruta) {
        this.imagen=imagen;
    }
    @Override
    public GImage getImagen() {
        return this.imagen;
    }
    public Miembros(){
        Random random=new Random();
        int random2=random.nextInt(2);
        if (random2==0) {

        }


    }

    public Genero getGenero() {
        return genero;
    }

}
