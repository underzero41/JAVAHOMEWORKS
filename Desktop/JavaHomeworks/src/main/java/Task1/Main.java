package Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String s = scanner.nextLine();
        System.out.println(ReverseString(s));
        scanner.close();

    }

    /**
     *
     * @param s text which we are reversing
     * @return reversed text
     */

    public static String ReverseString(String s){
        String[] arr = s.split(" ");
        String reversedArr = " ";
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i].equals("")){
                continue;
            }
            reversedArr += arr[i] + " ";
        }
        return reversedArr.trim();
    }


}



