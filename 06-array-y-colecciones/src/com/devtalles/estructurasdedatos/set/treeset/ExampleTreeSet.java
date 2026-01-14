package com.devtalles.estructurasdedatos.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);


        numbers.remove(3);

        numbers.remove(50);
        numbers.add(90);

        System.out.println(numbers);
    }
}
