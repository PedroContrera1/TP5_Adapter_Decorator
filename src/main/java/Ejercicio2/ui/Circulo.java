package Ejercicio2.ui;

import Ejercicio2.modelo.Panel;

class Circulo implements Figura {
    private int radio;
    private Coordenada coordenada;

    public Circulo(Coordenada coordenada, int radio) {
        this.radio = radio;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarCirculo(this.coordenada.x() - this.radio,
                this.coordenada.y() - this.radio,
                this.radio * 2,
                this.radio * 2);
    }
}