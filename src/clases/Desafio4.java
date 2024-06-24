package clases;

import java.util.LinkedList;
import java.util.Queue;

public class Desafio4 {
    public static void main(String[] args) {

        Queue<String> juegos = new LinkedList<>();


        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");


        int cantidadJuegos = juegos.size();
        System.out.println("Cantidad de juegos en la lista: " + cantidadJuegos);

        System.out.println("Listado de juegos:");
        for (String juego : juegos) {
            System.out.println(juego);
        }
    }
}
