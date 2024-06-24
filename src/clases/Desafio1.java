package clases;

import java.util.ArrayList;

public class Desafio1 {
    public static void main(String[] args) {

        ArrayList<String> marcas = new ArrayList<>();


        marcas.add("Kodak");
        marcas.add("Nokia");
        marcas.add("Blockbuster");
        marcas.add("Compaq");
        marcas.add("MySpace");
        marcas.add("Palm");
        marcas.add("Sega");
        marcas.add("Netscape");
        marcas.add("Atari");
        marcas.add("Pan Am");

        System.out.println("Listado inicial de marcas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }


        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println("\nListado después de agregar nuevas marcas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }


        int index = marcas.indexOf("Blokbaster");
        if (index != -1) {
            marcas.set(index, "Blockbuster");
        }

        System.out.println("\nListado después de corregir 'Blokbaster' a 'Blockbuster':");
        for (String marca : marcas) {
            System.out.println(marca);
        }


        boolean removed = marcas.remove("Carrefour");
        if (removed) {
            System.out.println("\n'Carrefour' se eliminó correctamente.");
        } else {
            System.out.println("\n'Carrefour' no se encontró en el listado.");
        }

        System.out.println("\nListado después de remover 'Carrefour':");
        for (String marca : marcas) {
            System.out.println(marca);
        }


        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("BlackBerry");
        posiblesMarcas.add("Yahoo!");
        posiblesMarcas.add("AltaVista");

        marcas.addAll(posiblesMarcas);

        System.out.println("\nListado después de agregar posibles marcas fuera del mercado:");
        for (String marca : marcas) {
            System.out.println(marca);
        }


        int cantidadMarcas = marcas.size();
        System.out.println("\nLa cantidad de elementos en el listado es: " + cantidadMarcas);
    }
}
