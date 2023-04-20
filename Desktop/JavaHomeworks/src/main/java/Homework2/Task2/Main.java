package Homework2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(IncSeq());
    }

    /**
     *
     * @return boolean value whether the sequence is increasing.
     */
    private static boolean IncSeq()
    {
        int currNum;
        int nextNum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers and exit with the char: ");

        while (true)
        {
            try
            {
                currNum = scanner.nextInt();

                if (currNum < nextNum)
                {
                    return false;
                }

                nextNum = currNum;
            }
            catch (Exception e)
            {
                break;
            }
        }
        return true;
    }
}
