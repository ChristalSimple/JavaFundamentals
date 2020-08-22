import java.util.Arrays;
import java.util.Collections;

public class Teme_08_08_2020
{
    public static void main(String[] args)
    {
//        exercitiuFizzBuzz();
//        exercitiuArray1();
//        exercitiuArray2();
//        exercitiuArray3();
//        exercitiuArray4();
//        exercitiuArray5();
//        exercitiuArray6();
//        exercitiuArray7();
    }

    public static void exercitiuFizzBuzz()
    {
        int counterFizzBuzz = 0, counterFizz = 0, counterBuzz = 0;

        for(int i = 1; i <= 100; i++)
        {
            // numerele divizibile cu 3 si cu 5
            // sunt intodeauna divizibile cu 15
            if(i % 15 == 0)
            {
                System.out.print("FizzBuzz  ");
                counterFizzBuzz++;
            }
            else if(i % 3 == 0)
            {
                System.out.print("Fizz  ");
                counterFizz++;
            }
            else if(i % 5 == 0)
            {
                System.out.print("Buzz  ");
                counterBuzz++;
            }
            else
            {
                System.out.print(i + "  ");
            }
        }
        System.out.print("\n");
        System.out.println("counterBuzz: " + counterBuzz);
        System.out.println("counterFizz: " + counterFizz);
        System.out.println("counterFizzBuzz: " + counterFizzBuzz);
    }

    public static void exercitiuArray1()
    {
        int[] arrayInt = {1, 7, 3, 10, 9};
        float averageArrayInt = 0;
        for(int i = 0; i < arrayInt.length; i++)
        {
            averageArrayInt += arrayInt[i];
        }

        averageArrayInt /= arrayInt.length;

//        for(int i = 0; i < arrayInt.length; i++)
//        {
//            System.out.println(arrayInt[i] + " ");
//        } = Arrays.toString(arrayInt)

        System.out.println("Average value of array elements "
                    + "of arrayInt: " + Arrays.toString(arrayInt) + " is : "
                    + averageArrayInt);
    }

    public static void exercitiuArray2()
    {
        int[] arrayInt = new int[]{1, 7, 3, 10, 9};

        System.out.println("Odd numbers from arrayInt are: ");
        for(int i = 0; i < arrayInt.length; i++)
        {
            if(arrayInt[i] % 2 != 0)
            {
                System.out.print(arrayInt[i] + " ");
            }
        }
    }

    public static void exercitiuArray3()
    {
        int[] arrayInt = {1, 7, 3, 10, 9};
        int reverseIterator = arrayInt.length - 1;
        int[] reversedArrayInt = new int[arrayInt.length];

        for(int i = 0; i < arrayInt.length; i++)
        {
            reversedArrayInt[reverseIterator] =
                    arrayInt[i]; // reversedArrayInt = {9, 10, 3, 7, 1}
            reverseIterator--; //
        }

//        Collections.reverse(Arrays.asList(arrayInt));

        System.out.println("arrayInt: " + Arrays.toString(arrayInt));
        System.out.println("arrayInt as reversed: " + Arrays.toString(reversedArrayInt));
    }

    public static void exercitiuArray4()
    {
        int[] arrayInt = {1, 7, 3, 10, 9};
        int odd = 0, even = 0;

        for(int i = 0; i < arrayInt.length; i++)
        {
            if(arrayInt[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Odd numbers in arrayInt: " + odd);
        System.out.println("Even numbers in arrayInt: " + even);
    }

    public static void exercitiuArray5()
    {
        int[] arrayInt = {1, 7, 3, 7, 10, 1, 9};

        System.out.println("Elementele duplicate din arrayInt: " + Arrays.toString(arrayInt)
                + " sunt: ");
        for(int i = 0; i < arrayInt.length; i++)
        {
            for(int j = i + 1; j < arrayInt.length; j++)
            {
                if(arrayInt[i] == arrayInt[j])
                {
                    System.out.print(arrayInt[j] + " ");
                }
            }
        }
    }

    public static void exercitiuArray6()
    {
        int[] arrayInt = {1, 7, 3, 10, 9};
        System.out.println("Second largest value from arrayInt: "
                + Arrays.toString(arrayInt)
                + " is: " + getSecondLargest(arrayInt));
    }

    public static int getSecondLargest(int[] array)
    {   // {1, 7, 3, 10, 9}
        int variabilaTemporara;

        //bubbleSort
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    variabilaTemporara = array[i]; // 7 ... 10
                    array[i] = array[j]; // {1, 3, 3, 10, 9} {1, 3, 7, 9, 9}
                    array[j] = variabilaTemporara; // {1, 3, 7, 10, 9} {1, 3, 7, 9, 10}
                }
            }
        }
        // array = {1, 3, 7, 9, 10}
        return array[array.length - 2];
    }

    public static void exercitiuArray7()
    {
        int[] arrayInt = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;

        System.out.println("The following pair's sum is "
                + sum + " :");
        for(int i = 0; i < arrayInt.length; i++)
        {
            for(int j = i + 1; j < arrayInt.length; j++)
            {
                if(arrayInt[i] + arrayInt[j] == sum)
                {
                    System.out.print(arrayInt[i] + "-"
                            + arrayInt[j] +
                            ", ");
                }
            }
        }
    }
}
