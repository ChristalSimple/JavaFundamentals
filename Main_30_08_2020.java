public class Main_30_08_2020
{
    public static void main(String[] args)
    {
//        fibonacciNumbers(10);
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        binarySearch(array, 8);
//        someMethod();
//        factorialOf(5);
//        System.out.printf("%d! = %d", 5, factorialOf(5));
//        System.out.println(fibonacciNumbers(3));
        int[] array2 = {2, 5, 3, 1, 8, 7, 6, 4};
//        bubbleSort(array2);
//        printArray(array2);
//        selectionSort(array2);
//        printArray(array2);
//        insertionSort(array2);
//        printArray(array2);
    }

    public static void fibonacciNumbers(int numbersInSequence)
    {
        int currentNumber = 0;
        int nextNumber = 1;
        int temporary;

        for(int i = 0; i < numbersInSequence; i++)
        {
            System.out.printf("%d ", currentNumber);
            //0, 1, 1, 2, 3, 5
            temporary = nextNumber;
            nextNumber = currentNumber + nextNumber;
            currentNumber = temporary;
        }
    }

    public static void binarySearch(int[] sortedArray,
                                    int valueToSearch)
    {
        int left = 0;
        int right = sortedArray.length - 1;
        int middle;
        boolean found = false;

        while(left <= right)
        {
            middle = (left + right) / 2;
            if(valueToSearch == sortedArray[middle])
            {
                System.out.printf("ValueToSearch: %d is at position: %d",
                        valueToSearch, middle);
                found = true;
                break;
            }
            else
            {
                if(valueToSearch < sortedArray[middle])
                {
                    right = middle - 1;
                }
                else
                {
                    left = middle + 1;
                }
            }
        }

        if(found == false)
        {
            System.out.printf("ValueToSearch: %d does not exist in array",
                            valueToSearch);
        }
    }

    //Infinite recurisive call
//    public static int someMethod()
//    {
//        someMethod();
//        return 1;
//    }

    // Iterative
//    public static void factorialOf(int number)
//    {
//        // 1 * 2 * 3 * 4 * 5
//        int numberFactorial = 1; // 2, 6, 24,
//        for(int i = 2; i <= number; i++)
//        {
//            numberFactorial = numberFactorial * i;
//        }
//
//        System.out.printf("%d! = %d", number, numberFactorial);
//    }

    // Recursive
    //factorialOf(5); == 5 * 24 = 120
    //factorialOf(4); == 4 * 6 = 24
    //factorialOf(3); == 3 * 2 = 6
    //factorialOf(2); == 2 * 1 = 2
    //factorialOf(1); == 1
    public static int factorialOf(int number)
    {
        if(number == 0 || number == 1)
        {
            return 1;
        }
//        int result = number * factorialOf(number - 1);
//        return result;
        return number * factorialOf(number - 1);
    }

    public static void bubbleSort(int[] array)
    {
        int temporary;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(array[j] > array[i])
                {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
    }

    public static void selectionSort(int[] array)
    {
        int min_index;
        int temporary;

        for(int i = 0; i < array.length; i++)
        {
            min_index = i;
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[min_index] > array[j])
                {
                    min_index = j;
                }
            }
            temporary = array[i];
            array[i] = array[min_index];
            array[min_index] = temporary;

        }
    }

    public static void insertionSort(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int temporary = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temporary)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temporary;
        }
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }
    }
}
