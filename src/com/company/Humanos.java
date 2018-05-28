package com.company;

import acm.graphics.GImage;

public abstract class Humanos {
    protected GImage imagen;

    public abstract void setImagen(String ruta);
    public abstract GImage getImagen();
}
