package com.devtalles.estructurasdedatos.set.LinkedHashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHasSet {
    static void main(String[] args) {
            Set<Integer> numbers = new LinkedHashSet<>();

            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);

            numbers.remove(30);

            numbers.remove(50);
            numbers.add(90);

        System.out.println(numbers);
        }
    }
