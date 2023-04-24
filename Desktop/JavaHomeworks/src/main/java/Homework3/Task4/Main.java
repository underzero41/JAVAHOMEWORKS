package Homework3.Task4;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer result = 0;
        ArrayList<Integer> numbers = getNums();
        for (Integer num: numbers){
            result += num;
        }
        System.out.println("Max: "+ Collections.max(numbers));
        System.out.println("Min " + Collections.min(numbers));
        System.out.println("Half: " + result / numbers.size());
    }

    /**
     *
     * @return List of numbers
     */
    private static ArrayList<Integer> getNums() {
        ArrayList<Integer> numbers  = new ArrayList<Integer>();
        numbers.add(3283);
        numbers.add(3434);
        numbers.add(1212);
        numbers.add(1231);
        numbers.add(213);
        numbers.add(2131);
        numbers.add(435);
        numbers.add(678);
        numbers.add(567);
        numbers.add(847);
        numbers.add(437);
        numbers.add(7483);
        numbers.add(7643);
        numbers.add(4723);
        numbers.add(873);
        numbers.add(8732);
        return numbers;
    }
}