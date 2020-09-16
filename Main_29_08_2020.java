public class Main_29_08_2020
{
    public static void main (String[] args)
    {
//        printSum(74, 36);
//        printRemainder(50, 3);
//        printOperationsResult(-5, 8, 6,
//                                55, 9, 9,
//                                20, -3, 5, 8,
//                                5, 15, 3, 2, 8, 3);
//        printExpressionOutput(25.5, 3.5, 3.5, 3.5,
//                                40.5, 4.5);
//        printCircleAreaAndPerimeter(7.5);
//        printNumbersAverage(10, 20, 30);
//        printRectangleAreaAndPerimeter(5.5, 8.5);
//        printSwappedVariables(5, 13);
//        printComparison(25, 39);
//        printSumDigits(133);
//        printMultiplicationTable(8);
//        printEvenNumbers(100);
        printNumbersNTimes(9);
    }

    public static void printSum(int operand1, int operand2)
    {
        int sum = operand1 + operand2;

        System.out.printf("%d + %d = %d", operand1, operand2, sum);
    }

    public static void printRemainder(int operand1, int operand2)
    {
        int division = operand1 / operand2;
        int remainder = operand1 % operand2;

        System.out.printf("%d / %d = %d (remainder:%d)", operand1, operand2, division, remainder);
    }

    public static void printOperationsResult(int firstOperationOperand1, int firstOperationOperand2, int firstOperationOperand3,
                                             int secondOperationOperand1, int secondOperationOperand2, int secondOperationOperand3,
                                             int thirdOperationOperand1, int thirdOperationOperand2,
                                             int thirdOperationOperand4, int thirdOperationOperand3,
                                             int forthOperationOperand1, int forthOperationOperand2,
                                             int forthOperationOperand3, int forthOperationOperand4,
                                             int forthOperationOperand5, int forthOperationOperand6)
    {
        int firstOperationResult =
                firstOperationOperand1 + firstOperationOperand2 * firstOperationOperand3;

        int secondOperationResult =
                (secondOperationOperand1 + secondOperationOperand2) % secondOperationOperand3;

        int thirdOperationResult =
                thirdOperationOperand1 + thirdOperationOperand2
                        * thirdOperationOperand3 / thirdOperationOperand4;

        int forthOperationResult =
                forthOperationOperand1 + forthOperationOperand2
                        / forthOperationOperand3 * forthOperationOperand4
                        - forthOperationOperand5 % forthOperationOperand6;



        System.out.printf("%d + %d * %d = %d\n",
                firstOperationOperand1, firstOperationOperand2,
                firstOperationOperand3,
                firstOperationResult);

        System.out.printf("(%d + %d) %s %d = %d\n",
                secondOperationOperand1, secondOperationOperand2, "%",
                secondOperationOperand3, secondOperationResult);

        System.out.printf("%d + %d * %d / %d = %d\n",
                thirdOperationOperand1, thirdOperationOperand2,
                thirdOperationOperand3, thirdOperationOperand4,
                thirdOperationResult);

        System.out.printf("%d + %d / %d * %d - %d %s %d = %d",
                forthOperationOperand1, forthOperationOperand2,
                forthOperationOperand3, forthOperationOperand4,
                forthOperationOperand5, "%", forthOperationOperand6,
                forthOperationResult);
    }

    public static void printExpressionOutput(double operand1, double operand2,
                                             double operand3, double operand4,
                                             double operand5, double operand6)
    {
        double result =
                (operand1 * operand2 - operand3 * operand4) / (operand5 - operand6);

        System.out.printf("((%.1f * %.1f - %.1f * %.1f) / (%.1f - %.1f)) = %.15f",
                operand1, operand2, operand3,
                operand4, operand5, operand6,
                result);
    }

    public static void printCircleAreaAndPerimeter(double radius)
    {
        double area = Math.PI * radius * radius;
        double perimeter = Math.PI * 2 * radius;

        System.out.printf("Circle (radius:%.2f) Area = %.14f\n",
                radius, area);

        System.out.printf("Circle (radius:%.2f) Perimeter = %.14f",
                radius, perimeter);
    }

    public static void printNumbersAverage(int number1, int number2, int number3)
    {
        int average = (number1 + number2 + number3) / 3;

        System.out.printf("Average (%d, %d, %d) = %d",
                number1, number2, number3, average);
    }

    public static void printRectangleAreaAndPerimeter(double width, double height)
    {
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Rectangle (w=%.1f, h=%.1f) Area = %.2f\n",
                width, height, area);

        System.out.printf("Rectangle (w=%.1f, h=%.1f) Perimeter = %.2f",
                width, height, perimeter);

    }

    public static void printSwappedVariables(int a, int b)
    {
        System.out.printf("Before swap a=%d, b=%d\n", a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("After swap a=%d, b=%d", a, b);
    }

    public static void printComparison(int numberToCompare1, int numberToCompare2)
    {
        System.out.println("Comparing " + numberToCompare1 + " - " + numberToCompare2);

        //Equal comparison
        if (numberToCompare1 == numberToCompare2)
        {
            System.out.printf("%d == %d\n", numberToCompare1, numberToCompare2);
        }
        else
        {
            System.out.printf("%d != %d\n", numberToCompare1, numberToCompare2);
        }

        //Smaller comparison
        if (numberToCompare1 < numberToCompare2)
        {
            System.out.printf("%d < %d\n", numberToCompare1, numberToCompare2);
        }

        //Greater comparison
        if (numberToCompare1 > numberToCompare2)
        {
            System.out.printf("%d > %d\n", numberToCompare1, numberToCompare2);
        }

        //Smaller or equal comparison
        if (numberToCompare1 <= numberToCompare2)
        {
            System.out.printf("%d <= %d\n", numberToCompare1, numberToCompare2);
        }

        //Greater or equal comparison
        if (numberToCompare1 >= numberToCompare2)
        {
            System.out.printf("%d >= %d\n", numberToCompare1, numberToCompare2);
        }
    }

    public static void printSumDigits(int number)
    {
        // storing the original number in an additional variable because
        // it will degrade as we extract its last digits
        int originalNumber = number;
        int sumDigits = 0;

        while (number > 0)
        {
            sumDigits = sumDigits + number % 10;
            number /= 10;
        }

        System.out.printf("Sum of number %d's digits is: %d",
                originalNumber, sumDigits);
    }

    public static void printMultiplicationTable(int number)
    {
        System.out.printf("Number %d's multiplication table: ", number);

        for (int i = 1; i <= 10; i++)
        {
            System.out.print((number * i) + " ");
        }
    }

    public static void printEvenNumbers(int threshold)
    {
        System.out.printf("Even numbers up to %d: ", threshold);

        for (int i = 1; i <= threshold; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void printNumbersNTimes(int n)
    {
        int temporary = n;

        System.out.printf("%d, ", temporary);

        for(int i = 1; i < n; i++)
        {
            temporary = (int)(n * Math.pow(10, i) + temporary);
            //5 * 10^2 + 55 = 5 * 100 + 55 = 500 + 55 = 555
            //5 * 10^3 + 555 = 5 * 1000 + 555 = 5000 + 555 = 5555
            //5 * 10^4 + 5555 = 5 * 10000 + 5555 = 55555
            //temporary = 55, 555, 5555, 55555
            System.out.printf("%d, ", temporary);
        }

    }
}
