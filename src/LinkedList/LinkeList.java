package LinkedList;

import java.util.*;

public class LinkeList {

    public static void main(String[] args) {

        // Crear LinkedList de Strings
        List<String> nombres = new LinkedList<>();

        // Inserción
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Maria");
        System.out.println("Lista inicial: " + nombres);

        // Eliminación
        nombres.remove("Luis");  // elimina por valor
        nombres.remove(1);       // elimina por índice (Carlos en este caso)
        System.out.println("Después de eliminar: " + nombres);

        // Modificación
        nombres.set(0, "Andrea");  // reemplaza "Ana" por "Andrea"
        System.out.println("Después de modificar: " + nombres);

        // FOR tradicional
        System.out.println("Recorrido con for tradicional:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));
        }

        // FOR EACH
        System.out.println("Recorrido con for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

    }


}
