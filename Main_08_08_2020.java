public class Main_08_08_2020
{
    public static void main(String[] args)
    {
        int grade = 5;
        switch (grade)
        {
            case 10:
                System.out.println("Super Star!");
                break;
            case 9:
            case 7:
                System.out.println("Hm, Not bad!");
                break;
            case 5:
                System.out.println("You passed");
            case 4:
                System.out.println("You failed");
                break;
            default:
                System.out.println("Invalid " +
                "grade");
        }

        int x = 20;
        while (x < 20)
        {
                System.out.println("x is: " + x);
                x++;
        }

        System.out.println("S-a iesit din while");





        int y = 10;
        do
        {
            System.out.print("y is: " + y);
            y++;
            System.out.println();
        } while (y < 20);


        // 1 4 5 2 1 8 4 6 7 1231 76346
        int[] numereIntregi = new int[5]; // 0 0 0 0 0
//        double[] numereDouble = new double[3];
        Dog dog1 = new Dog();



        int a;
        // Eroare
//        System.out.println(a);
        System.out.println(numereIntregi[0]);
        numereIntregi[0] = 14; // 14 0 0 0 0
        numereIntregi[1] = 11; // 14 11 0 0 0
        numereIntregi[2] = 8; // 14 11 8 0 0

        // Referinta numereIntregi pointeaza
        // catre alt obiect int[]
//        numereIntregi = new int[10];

        System.out.println(numereIntregi[0]);
        System.out.println(numereIntregi[1]);
        System.out.println(numereIntregi[2]);
        System.out.println(numereIntregi[3]);
        System.out.println(numereIntregi[4]);


        for (int i = 0; i < numereIntregi.length; i++)
        {
            numereIntregi[i] = i + 1;
        }

        for (int i = 0; i < numereIntregi.length; i++)
        {
            System.out.println(numereIntregi[i]);
        }



//         0   1   2    3      4    5
//        [0] [1] [4]  [7]   [21]  [6]
        int[] numereleIntregi = {0, 1, 4, 7, 21, 6};
        for(int i = 0; i <= 5;i++)
        {
            System.out.println("i is: " + i);
            if(numereleIntregi[i] == 4)
            {
                System.out.println("Valoarea de la pozitia i: "
                        + i + " este:"
                        + numereleIntregi[i]);
            }
        }




        // Array cu elemente de tip int
        int[] numbers = new int[3];

        // Variabila primitiva
        int z = 10;

        // Referinta de tip Dog
        Dog d1;

        // referinta catre un Obiect de tip Dog
        // nou creat
        d1 = new Dog();

        x += 5;

//        //Alta referinta obiect Dog
        Dog d2 = new Dog();
        d1 = d2;

        d2 = new Dog();

        int[] myArray = {3, 5, 7};
//        myArray = {2, 4, 5};


        double[] myArray2 = {3, 2.5, -8, 11, 13};

        // Print all Elements
        for(int i = 0; i < myArray2.length; i++)
        {
            System.out.println(myArray2[i] + " ");
        }

        // Summing all Elements
        double total = 0;
        for(int i = 0; i < myArray2.length; i++)
        {
            total += myArray2[i];
            System.out.println(i);
        }

        System.out.println("Total is: " + total);

        // Array bi-dimensional(matrice)
//        int[][] myArray4 = new int[1][2];


        double[] myArray3 = {3, 2.5, -8, 11};

        // Find largest Element
        double max = myArray3[0];

        for(int i = 1; i < myArray3.length; i++)
        {
            if(myArray[i] > max)
            {
                max = myArray3[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}
