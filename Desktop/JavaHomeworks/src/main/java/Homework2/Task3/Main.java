package Homework2.Task3;

public class Main {
    public static void main(String[] args)
    {
        int[] nums = new int[] {20, 3, -5, 6, -28, 37, -12, -754};
        replaceNeg(nums);
        printArray(nums);
    }

    /**
     * Replace all negative numbers of array
     * @param elements input array
     */
    private static void replaceNeg(int[] elements)
    {
        int sumDigit = 0;

        for (int i = 0; i < elements.length; i++)
        {
            if (Math.abs(elements[i]) >= 10 && Math.abs(elements[i]) < 100)
            {
                sumDigit += i;
            }
        }

        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i] < 0)
            {
                elements[i] = sumDigit;
            }
        }
    }

    /**
     * print array
     * @param numbers input array
     */
    private static void printArray(int[] numbers)
    {
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
    }
}
