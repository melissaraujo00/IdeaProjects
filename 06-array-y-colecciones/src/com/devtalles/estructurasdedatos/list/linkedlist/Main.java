package com.devtalles.estructurasdedatos.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Buenos Aires");
        cities.add("New York");
        cities.add("Paris");

        cities.addFirst("London");
        cities.addFirst("Berlin");

        System.out.println(cities.get(2));
        //actualizar
        System.out.println(cities.set(2, "Madrid"));
        //Eliminar por nombre
        System.out.println(cities.remove("Paris"));

        cities.removeFirst();
        cities.removeLast();

        String searchCity = "Buenos Aires";

        if (cities.contains(searchCity)){
            System.out.println("esta en la lista");
        }else {
            System.out.println("nO ESTA LA LISTA");
        }

        for (String city: cities){
            System.out.println("Ciudad: "+ city);
        }
    }
}
