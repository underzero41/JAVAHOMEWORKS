package Homework5.Task1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s");
        Map<String,Integer> map = new HashMap<>();
        for (String i : words) {
            if (!i.isEmpty()) {
                Integer count = map.get(i);
                if (count == null) {
                    count = 0;
                }
                map.put(i, ++count);
            }
            }
        for (String  j: map.keySet()){
            if (message.equals(j)){
                System.out.println(j + "- " + map.get(j));
        }
        }
    }
    }