package Homework3.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Good2> good2s = getGood2();
        Scanner scanner = new Scanner(System.in);
        Integer currentMinPrice = Integer.MAX_VALUE;
        String currentMinGoodName = null;
        String currentCountry = null;
        System.out.println("Choose type of sort 1, 2 or 3: ");
        Integer result = scanner.nextInt();
        for(Good2 good2: good2s){
            if(good2.getSort() == result && currentMinPrice > good2.getPrice()){
                currentMinPrice = good2.getPrice();
                currentMinGoodName = good2.getName();
                currentCountry = good2.getCountry();
            }
        }
        scanner.close();
        System.out.println("Good: " + currentMinGoodName);
        System.out.println("Price: " + currentMinPrice);
        System.out.println("Country: " + currentCountry);

    }

    /**
     *
     * @return goods from the list
     */
    private static ArrayList<Good2> getGood2() {
        ArrayList<Good2> good2s = new ArrayList<Good2>();
        good2s.add(new Good2("buckwheat", "Russia", 200.00, 10000, 1));
        good2s.add(new Good2("buckwheat", "China", 400.00, 15000, 2));
        good2s.add(new Good2("buckwheat", "India", 1000.00, 20000, 3));
        good2s.add(new Good2("rice", "Russia", 200.00, 20000, 2));
        good2s.add(new Good2("rice", "China", 400.00, 12000, 1));
        good2s.add(new Good2("rice", "India", 1000.00, 15000, 3));
        good2s.add(new Good2("oatmeal", "Russia", 200.00, 30000, 3));
        good2s.add(new Good2("oatmeal", "China", 200.00, 20000, 2));
        good2s.add(new Good2("oatmeal", "India", 200.00, 10000, 1));
        return  good2s;
    }
}
