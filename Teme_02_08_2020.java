import java.util.Scanner;

public class Teme_02_08_2020
{
    public static void main(String[] args)
    {
//        boolean leap = false;
//        int year = 1800;

//        year % 4 == 0 && year % 100 != 0 && year % 400 == 0
//
//        if(year % 4 == 0)
//        {
//            if(year % 100 != 0)
//            {
//                if(year % 400 == 0)
//                {
//                    leap = true;
//                }
//                else leap = false;
//            }
//            else leap = false;
//        }
//        else leap = false;
//
//        if(leap)
//        {
//            System.out.println("year is leap");
//        }
//        else
//            System.out.println("year is not leap");

//        boolean leap = false;
//        int year = 1800;
//
//        if(year % 400 == 0) // &&
//        {
//            if(year % 100 != 0)
//            {
//                leap = true;
//            }
//            else leap = false; // &&
//        }
//        else if(year % 4 == 0) // &&
//        {
//            if(year % 100 != 0) //&&
//            {
//                leap = true;
//            }
//            else leap = false;
//        }
//        else leap = false;
//
//        if(leap)
//        {
//            System.out.println("year is leap");
//        }
//        else
//            System.out.println("year is not leap");


//        exercitiu1();
//        exercitiu2();
        exercitiu3CuIf();
//        exercitiu3CuSwitch();
    }

    public static void exercitiu1()
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti valoarea lui a:");
        a = scanner.nextInt();

        System.out.println("Introduceti valoarea lui b:");
        b = scanner.nextInt();

        if(a > b)
        {
            System.out.println("a este mai mare decat b:");
            System.out.println(a + " > " + b);

        }
        else if(a != b)
        {
            System.out.println("b este mai mare decat a:");
            System.out.println(b + " > " + a);
        }
        else
        {
            System.out.println("a si b sunt egale");
        }
    }

    public static void exercitiu2()
    {
        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti valoarea lui a:");
        a = scanner.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("Valoarea lui a este para");
        }
        else
        {
            System.out.println("Valoarea lui a este impara");
        }
    }

    public static void exercitiu3CuIf()
    {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti anul pe care doriti sa-l verificati:");
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0
            || year % 400 == 0)
        {
            System.out.println("Anul " + year + " este an bisect");
        }
        else
        {
            System.out.println("Anul " + year + " nu este an bisect");
        }
    }

    public static int algoritmAnBisect(int year)
    {
        if(year % 4 == 0 && year % 100 != 0
                || year % 400 == 0)
        {
            return 366;
        }
        else
        {
            return 365;
        }
    }
    public static void exercitiu3CuSwitch()
    {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti anul pe care doriti sa-l verificati:");
        year = scanner.nextInt();

        switch(algoritmAnBisect(year))
        {
            case 366:
                System.out.println("Anul " + year + " este an bisect. Numar de zile: 366");
                break;
            case 365:
                System.out.println("Anul " + year + " este nu este an bisect. Numar de zile: 365");
                break;
        }
    }
}

