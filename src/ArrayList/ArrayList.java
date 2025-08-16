package ArrayList;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // ArrayList usa un arreglo dinámico internamente
        List<String> nombres = new java.util.ArrayList<>();

        // Insercción
        nombres.add("Ana");      // se agrega al final
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Maria");
        System.out.println("Lista inicial: " + nombres);

        // Eliminación
        nombres.remove("Luis");  // elimina por valor
        nombres.remove(1);       // elimina por índice
        System.out.println("Después de eliminar: " + nombres);

        // Modificación
        nombres.set(0, "Andrea"); // reemplaza el elemento en posición 0
        System.out.println("Después de modificar: " + nombres);

        // FOR tradicional
        System.out.println("Recorrido con for tradicional:");
        for (int i = 0; i < nombres.size(); i++) {
            // acceso rápido por índice (O(1))
            System.out.println("Posición " + i + ": " + nombres.get(i));
        }

        // FOR EACH
        System.out.println("Recorrido con for-each:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
