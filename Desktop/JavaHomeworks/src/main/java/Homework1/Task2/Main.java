package Homework1.Task2;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Input numbers: ");
        System.out.println(sumNum());
    }

    /**
     * @return sum of positive number between negative until zero
     */
    private static int sumNum() {
        int positiveNumbers = 0;
        int result = 0;
        int currentNumber = -1;
        Scanner scanner = new Scanner(System.in);

        while (currentNumber != 0) {
            try {
                currentNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вводите только числа!");
                scanner.nextLine();
                continue;
            }

            if (currentNumber >= 0) {
                positiveNumbers += currentNumber;
            } else {
                result += positiveNumbers;
                positiveNumbers = 0;
            }
        }
        scanner.close();
        return result;
    }
}
