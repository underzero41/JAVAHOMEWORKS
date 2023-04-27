package Homework4.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> reverse = reversedList(list);
        System.out.println(reverse);
    }

    /**
     *
     * @param list become to new cache to save new information reversed list
     * @return reversed list
     * @param <T> type
     */
    public static<T> List<T> reversedList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
}
