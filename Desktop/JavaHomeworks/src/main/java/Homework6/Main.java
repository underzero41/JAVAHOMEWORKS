package Homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 8, 256, "Windows 10", "Black", 800.0));
        laptops.add(new Laptop("Apple", 16, 512, "macOS", "Silver", 1500.0));
        laptops.add(new Laptop("HP", 4, 128, "Windows 10", "Blue", 500.0));
        laptops.add(new Laptop("Lenovo", 8, 512, "Windows 10", "Gray", 900.0));
        laptops.add(new Laptop("Asus", 16, 1, "Windows 10", "Black", 1200.0));

        // Сортировка по цене
        Collections.sort(laptops, Comparator.comparingDouble(Laptop::getPrice));
        System.out.println("Сортировка по цене:");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

        // Сортировка по размеру оперативной памяти
        Collections.sort(laptops, Comparator.comparingInt(Laptop::getRam));
        System.out.println("Сортировка по размеру оперативной памяти:");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

        // Фильтрация по операционной системе
        List<Laptop> windowsLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getOs().equals("Windows 10")) {
                windowsLaptops.add(laptop);
            }
        }
        System.out.println("Фильтрация по операционной системе (Windows 10):");
        for (Laptop laptop : windowsLaptops) {
            System.out.println(laptop);
        }

        // Фильтрация по цене и размеру оперативной памяти
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() < 1000.0 && laptop.getRam() >= 8) {
                filteredLaptops.add(laptop);
            }
        }
        System.out.println("Фильтрация по цене и размеру оперативной памяти (<1000$ и >=8GB):");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}
