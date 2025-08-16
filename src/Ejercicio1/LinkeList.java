package Ejercicio1;

import java.util.*;

public class LinkeList {

    public static void main(String[] args) {

        Map<String, Integer> productos = new HashMap<>();

        productos.put("Manzana", 50);
        productos.put("Bebida", 150);
        productos.put("Azúcar", 100);


        System.out.println(productos.get("Bebida"));

        for (Map.Entry<String,Integer>  x :  productos.entrySet()){
            System.out.println("La clave es " + x.getKey());
            System.out.println("El valor es " + x.getValue());
            System.out.println("----------------------------");
        }

    }


}
