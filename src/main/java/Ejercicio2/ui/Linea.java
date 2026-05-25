package Ejercicio2.ui;

import Ejercicio2.modelo.Panel;

class Linea implements Figura {
    private final Coordenada coordenada;
    private int longitud;

    public Linea(Coordenada coordenada, int longitud) {
        this.longitud = longitud;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel){
        panel.dibujarLinea(this.coordenada.x(),this.coordenada.y(), this.coordenada.x() + this.longitud, this.coordenada.y());
    }
}