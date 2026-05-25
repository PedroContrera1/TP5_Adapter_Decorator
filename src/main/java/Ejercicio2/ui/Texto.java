package Ejercicio2.ui;

import Ejercicio2.modelo.Panel;

class Texto implements Figura {
    private final Coordenada coordenada;
    private String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.texto = texto;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarTexto(this.texto, this.coordenada.x(), this.coordenada.y());
    }
}