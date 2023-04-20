package Homework2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Input numbers and exit with the char: ");
        System.out.println(sumNumbers());
    }

    /**
     *
     * @return the sum of prime numbers from a sequence
     */
    private static int sumNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        int curNum = 0;
        int result = 0;

        while (curNum >= 0)
        {
            try
            {
                curNum = scanner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("The sum of prime number is: ");
                scanner.nextLine();
                break;
            }

            if(isTrue(curNum))
            {
                result += curNum;
            }
        }

        scanner.close();
        return result;
    }

    /**
     *
     * @param number to check
     * @return a boolean value to check if a number is prime
     */
    private static boolean isTrue(int number)
    {
        if (number < 2)
        {
            return  false;
        }

        for (int i = 2; i * i < number; i++)
        {
            if (number % i == 0)
            {
                return  false;
            }
        }

        return  true;
    }
}
