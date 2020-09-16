public class Main_05_09_2020 {
    public static void main(String[] args) {
//        printDivizibilCu(100);
//        printPowers(3, 100);
//        printFibonacciSeries(10);
//        printPrimeNumbers(15);
//        printIncrementedNumbers(7);
//        printFactorial(5);
//        factorialOf(5);
        printPyramidPattern(5);
    }

    public static void printDivizibilCu(int limitaDeNumere)                //4
    {
        int[] divisibleByThree = new int[limitaDeNumere];
        int[] divisibleByFive = new int[limitaDeNumere];
        int[] divisibleByFifteen = new int[limitaDeNumere];

        int threeCounter = 0;
        int fiveCounter = 0;
        int fifteenCounter = 0;

        for (int i = 1; i <= limitaDeNumere; i++) {
            if (i % 3 == 0) {
                divisibleByThree[threeCounter] = i;
                threeCounter++;
            }
            if (i % 5 == 0) {
                divisibleByFive[fiveCounter] = i;
                fiveCounter++;
            }
            if (i % 15 == 0) {
                divisibleByFifteen[fifteenCounter] = i;
                fifteenCounter++;
            }
        }

//        System.out.printf("%d, %d, %d,",
//                threeCounter, fiveCounter, fifteenCounter);

        // divisibleByThree[] = {3, 6, 9, 12, 15, .... 99}
        // threeCounter = 33; i = 0 - 32

        // divisibleByFive[] =  {5, 10, 15, 20.... 100}
        // fiveCounter = 20; i = 0 - 19

        // divisibleByFifteen = {15, 30, 45, ... 90}
        // fifteenCounter = 6 i = 0 - 5

//        System.out.println("Length of our arrays:");
//        System.out.printf("Size of divisibleByThree: %d\n",
//                            divisibleByThree.length);
//        System.out.printf("Size of divisibleByFive: %d\n",
//                divisibleByFive.length);
//        System.out.printf("Size of divisibleByFifteen: %d\n",
//                divisibleByFifteen.length);

        System.out.print("Divisible by 3 - ");
        for (int i = 0; i < threeCounter; i++) {
            System.out.print(divisibleByThree[i] + " ");
        }

        System.out.print("\nDivisible by 5 - ");
        for (int i = 0; i < fiveCounter; i++) {
            System.out.print(divisibleByFive[i] + " ");
        }

        System.out.print("\nDivisible by 3 & 5 - ");
        for (int i = 0; i < fifteenCounter; i++) {
            System.out.print(divisibleByFifteen[i] + " ");
        }
    }

    public static void printPowers(int number, int threshold)            //5
    {
        System.out.printf("Powers of number %d up to %d: ", number, threshold);

        for (int i = number; i < threshold; i = i * number) {
            System.out.print(i + " ");
        }
    }

    public static void printFibonacciSeries(int threshold)            //6
    {
        System.out.printf("Fibonacci series of %d terms: ", threshold);

        int secondToLast = 0;
        int last = 1;
        int counter = 2;

        System.out.print(secondToLast + " " + last + " ");

        while (counter < threshold) {
            int current = secondToLast + last;
            secondToLast = last;
            last = current;

            System.out.print(last + " ");
            counter++;
        }
    }

    public static void printPrimeNumbers(int threshold)            //8
    {
        System.out.printf("First %d prime numbers: ", threshold);

        int primeNumbersCount = 1;
        int numberToCheck = 2;

        while (primeNumbersCount <= threshold) {
            if (isPrime(numberToCheck)) {
                primeNumbersCount++;
                System.out.print(numberToCheck + " ");
            }
            numberToCheck++;
        }

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void printIncrementedNumbers(int n)            //9
    {
        int incrementedNumber = n;

        System.out.printf("First %d numbers (incremented by %d): %d ", n, n, incrementedNumber);

        for (int i = 2; i <= n; i++) {
            incrementedNumber += n;

            System.out.print(incrementedNumber + " ");
        }
    }


    public static void printFactorial(int number)                //10
    {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("Factorial of %d is: %d\n\n", number, factorial);
    }

    // Recursive
    //factorialOf(5); == 5 * 24 = 120
    //factorialOf(4); == 4 * 6 = 24
    //factorialOf(3); == 3 * 2 = 6
    //factorialOf(2); == 2 * 1 = 2
    //factorialOf(1); == 1
    public static int factorialOf(int number)
    {
        if (number == 0 || number == 1)
        {
            return 1;
        }
//        int result = number * factorialOf(number - 1);
//        return result;
        return number * factorialOf(number - 1);

    }

    // Stack: factorialOf(5) (return)-> 5 * (return-ul de la urmatorul apel al metodei factorialOf, adica apelul factorialOf(4) )
    // Stack: factorialOf(4) (return)-> 4 * (returnul urmatoarei apeleri de factorialOf)
    // ...
    // Stack: factorialOf(1) (return)-> 1

    public static void printPyramidPattern(int threshold) 			//7
    {
        int deCateOriPrintamUnNumar = 1;

        for (int i = 1; i <= threshold; i++)
        {
            for (int j = 1; j <= threshold - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= deCateOriPrintamUnNumar; j++)
            {
                System.out.print(i);
            }
            System.out.println("");
            deCateOriPrintamUnNumar += 2;
        }
    }

}
