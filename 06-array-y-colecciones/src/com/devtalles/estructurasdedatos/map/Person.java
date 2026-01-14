package com.devtalles.estructurasdedatos.map;

import java.util.*;

public class Person {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    static void main(String[] args) {
        Map<String, Person> persons = new HashMap();
        Person person1 = new Person("Maria", "123");
        Person person3 = new Person("Maria2", "123");
        Person person2 = new Person("Ana", "456");

        //create
        persons.put(person1.dni, person1);
        persons.put(person2.dni, person2);
        persons.put(person3.dni, person3);

        //read
        System.out.println(persons);

        //delete
        persons.remove(person2.dni);

        System.out.println(persons);

        //update
        persons.put(person2.dni, new Person("Gabiel", "999"));

    }
}
