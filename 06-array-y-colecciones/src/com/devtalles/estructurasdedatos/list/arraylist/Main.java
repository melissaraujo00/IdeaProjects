package com.devtalles.estructurasdedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> studens = new ArrayList<>();

        studens.add("Ana");
        studens.add("Maria");
        //agregar en una posicion
        studens.add(2, "Fernando");

        System.out.println(studens);
        //obtener
        System.out.println(studens.get(0));

        //eliminar
        System.out.println(studens.remove(1));

        System.out.println(studens);

        //remplazar
        System.out.println(studens.set(0, "Marcelo"));


    }
}
