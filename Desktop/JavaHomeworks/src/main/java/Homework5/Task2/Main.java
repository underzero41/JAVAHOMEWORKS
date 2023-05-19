package Homework5.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> persons = getPerson();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for(Person person: persons) {

            treeMap.putIfAbsent(person.getName(), 0);
            treeMap.put(person.getName(), treeMap.get(person.getName()) + 1);
        }
        for(var entry: treeMap.entrySet()){
            System.out.println((entry.getKey() + ": " + entry.getValue()));
        }
        }

    public static LinkedList<Person> getPerson() {
        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("Ivan", "Ivanov"));
        persons.add(new Person("Svetlana", "Petrova"));
        persons.add(new Person("Kristina", "Belova"));
        persons.add(new Person("Anna", "Mussina"));
        persons.add(new Person("Anna", "Krutova"));
        persons.add(new Person("Ivan", "Yurin"));
        persons.add(new Person("Petr", "Lykov"));
        persons.add(new Person("Pavel", "Chernov"));
        persons.add(new Person("Petr", "Chernishov"));
        persons.add(new Person("Maria", "Fedotova"));
        persons.add(new Person("Marina", "Svetlova"));
        persons.add(new Person("Marina", "Savina"));
        persons.add(new Person("Maria", "Ryukova"));
        persons.add(new Person("Marina", "Lugovaya"));
        persons.add(new Person("Anna", "Vladimirovna"));
        persons.add(new Person("Ivan", "Mechnikov"));
        persons.add(new Person("Petr", "Petin"));
        persons.add(new Person("Ivan", "Ezhov"));
        return persons;
    }
}

