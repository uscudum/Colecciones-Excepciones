package HashMap;

import java.util.*;

public class ConjuntoMap {
    public static void main(String[] args) {
        // Un HashMap almacena pares (clave, valor)
        Map<Integer, String> alumnos = new HashMap<>();

        // Insercción
        alumnos.put(1, "Ana");
        alumnos.put(2, "Luis");
        alumnos.put(3, "Carlos");
        alumnos.put(4, "Maria");
        alumnos.put(2, "Lucia"); // la clave 2 ya existía, se reemplaza el valor
        System.out.println("Mapa inicial: " + alumnos);

        // Eliminación
        alumnos.remove(3); // elimina por clave
        System.out.println("Después de eliminar clave 3: " + alumnos);

        // Modificación
        alumnos.put(4, "Mariana"); // reemplaza valor asociado a clave 4
        System.out.println("Después de modificar clave 4: " + alumnos);

        // FOR EACH
        System.out.println("Recorrido con for-each:");
        for (Map.Entry<Integer, String> entrada : alumnos.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " - Valor: " + entrada.getValue());
        }

        // Recorrido solo por claves
        System.out.println("Claves:");
        for (Integer clave : alumnos.keySet()) {
            System.out.println(clave);
        }

        // Recorrido solo de valores
        System.out.println("Valores:");
        for (String valor : alumnos.values()) {
            System.out.println(valor);
        }

        // Búsqueda por clave
        if (alumnos.containsKey(1)) {
            System.out.println("La clave 1 está presente con valor: " + alumnos.get(1));
        }
    }
}
