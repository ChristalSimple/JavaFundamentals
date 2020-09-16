public class LetterPatterns_05_09_2020
{
    public static void main(String[] args)
    {
//        printLetterJ();
//        printLetterA();
//        printLetterV();
        printJavaWord();
    }

    public static void printLetterJ()
    {
        int i, j;
        for(i = 0; i <= 3; i++)
        {
            for(j = 0; j <= 4; j++)
            {
                if(i <= 1 && j == 3 ||
                        i == 2 && j == 0 ||
                        i == 2 && j == 3 ||
                        i == 3 && j > 0 && j < 3)
                {
                    System.out.printf("J");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void printLetterA()
    {
        int i, j;
        for(i = 0; i <= 3; i++)
        {
            for(j = 0; j <= 7; j++)
            {
                if(i == 0 && j == 3 ||
                        i == 1 && j == 2 ||
                        i == 1 && j == 4 ||
                        i == 2 && j != 0 && j < 6 ||
                        i == 3 && j == 0 ||
                        i == 3 && j == 6)
                {
                    System.out.printf("a");
                }
                else
                {
                    System.out.printf(" ");
                }

            }
            System.out.printf("\n");
        }
    }

    public static void printLetterV()
    {
        int i, j;
        for(i = 0; i <= 3; i++)
        {
            for(j = 0; j <= 7; j++)
            {
                if(i == 0 && j == 0 ||
                        i == 0 && j == 6 ||
                        i == 1 && j == 1 ||
                        i == 1 && j == 5 ||
                        i == 2 && j == 2 ||
                        i == 2 && j == 4 ||
                        i == 3 && j == 3)
                {
                    System.out.printf("V");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void letterJ(int i, int j, int offset)
    {
        if(i <= 1 && j == 3 + offset ||
                i == 2 && j == 0 + offset ||
                i == 2 && j == 3 + offset ||
                i == 3 && j > 0 + offset && j < 3 + offset)
        {
            System.out.printf("J");
        }
        else if(j >= offset && j <= 3 + offset)
        {
            System.out.printf(" ");
        }
    }

    public static void letterA(int i, int j, int offset)
    {
        if(i == 0 && j == 3 + offset ||
                i == 1 && j == 2 + offset ||
                i == 1 && j == 4 + offset ||
                i == 2 && j > 0 + offset && j < 6 + offset ||
                i == 3 && j == 0 + offset ||
                i == 3 && j == 6 + offset)
        {
            System.out.printf("a");
        }
        else if(j >= offset && j <= 6 + offset)
        {
            System.out.printf(" ");
        }
    }

    public static void letterV(int i, int j, int offset)
    {
        if(i == 0 && j == 0 + offset ||
                i == 0 && j == 6 + offset ||
                i == 1 && j == 1 + offset ||
                i == 1 && j == 5 + offset ||
                i == 2 && j == 2 + offset ||
                i == 2 && j == 4 + offset ||
                i == 3 && j == 3 + offset)
        {
            System.out.printf("V");
        }
        else if(j >= offset && j <= 6 + offset)
        {
            System.out.printf(" ");
        }
    }

    public static void printJavaWord()
    {
        int i, j;
        int offsetJ, offsetA, offsetV, offset2ndA;
        offsetJ = 0;
        offsetA = 5;
        offsetV = 13;
        offset2ndA = 21;
        for(i = 0; i <= 3; i++)
        {
            for(j = 0; j <= 37; j++)
            {
                letterA(i, j, 0);
                letterJ(i, j, 7);
                letterA(i, j, 11);
                letterV(i, j, 18);
                letterA(i, j, 25);
                letterJ(i, j, 32);
            }
            System.out.printf("\n");
        }

    }
}
