package HashSet;

import java.util.*;

public class ConjuntoSet {
    public static void main(String[] args) {
        // Un HashSet.HashSet no guarda elementos repetidos ni en orden específico
        Set<String> frutas = new HashSet<>();

        // Insercción
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Manzana"); // repetido, no se agrega
        System.out.println("Frutas en el HashSet.HashSet: " + frutas);

        // Eliminación
        frutas.remove("Banana"); // elimina por valor
        System.out.println("Después de eliminar Banana: " + frutas);

        // Recorrido FOR EACH
        System.out.println("Recorrido con for-each:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Comprobación si existe
        if (frutas.contains("Pera")) {
            System.out.println("El conjunto contiene Pera");
        }
    }
}
