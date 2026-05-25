package Ejercicio4.modelo;

import Ejercicio4.builder.ComboBuilder;

public class Main {
    static void main(){
        Combo combo1= new ComboBuilder()
                .comboFamiliar(1200, "Combo Familiar: 4 hamburguesas + papas grandes")
                .agregarCarne(4)
                .agregarPapas(3)
                .build();
        Combo combo2=new ComboBuilder()
                .comboBasico(1500,"Combo Especial: Matambre a la pizza + Papas fritas")
                .agregarCarne(1)
                .agregarPapas(4)
                .build();
        System.out.println("PEDIDO 1");
        System.out.println(combo1.getDescripcion());
        System.out.println("Precio total: $" + combo1.getPrecio());

        System.out.println();

        System.out.println("PEDIDO 2");
        System.out.println(combo2.getDescripcion());
        System.out.println("Precio total: $" + combo2.getPrecio());
    }
}
