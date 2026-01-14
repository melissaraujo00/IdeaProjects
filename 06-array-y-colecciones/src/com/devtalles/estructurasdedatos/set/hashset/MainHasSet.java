package com.devtalles.estructurasdedatos.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class MainHasSet {
    static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(30);

        numbers.remove(50);
        numbers.add(90);
    }
}
