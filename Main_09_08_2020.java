// Wildcard import
//import Java.Fundamentals.Ziua1.*;
//import Java.Fundamentals.*;

// Import clase specifice

// Erorare: importam clase cu acelasi nume
// din package-uri diferite
import Java.Fundamentals.Ziua1.Dog;
//import DeLaMarius.Dog;

// Scapam de eroare redenumind clasa Dog
// (din package-ul DeLaMarius) in DogDeLaMarius
// astfel putem folosi atat clasa Dog din pakage-ul
// Java.Fundamentals.Ziua1
// cat si clasa Dog din package-ul
// DeLaMarius in aceasi clasa(Main_09_08_2020)
import DeLaMarius.DogDeLaMarius;

public class Main_09_08_2020
{
    public static void main(String[] args)
    {
//        // Declarare si Instantiere 'matrix'
//        int numarLinii = 2;
//        int numarColoane = 3;
//
//        int[][] matrix = new int[numarLinii][numarColoane];
//
//        // Initializare elemente 'matrix'
//
//        matrix[0][0] = 5;
//        matrix[0][1] = 10;
//        matrix[0][2] = 7;
//        matrix[1][0] = 10;
//        matrix[1][1] = 12;
//        matrix[1][2] = 14;
//
//        // Afisare elemente 'matrix'
//        for(int i = 0; i < numarLinii; i++)
//        {
//            for(int j = 0; j < numarColoane; j++)
//            {
//                System.out.print(matrix[i][j] + ", ");
//            }
//            System.out.print("\n");
//        }

        // Alternative declarare, instantiere
        // si initializare matrice
//        int[][] myMatrixInt1 = new int[3][3];
//        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
//        int nrLinii = myMatrixInt.length;
//        int nrColoane = 3;
//
//        for(int i = 0; i < nrLinii; i++)
//        {
//            for(int j = 0; j < nrColoane; j++)
//            {
//                System.out.print(myMatrixInt[i][j] + " ");
//            }
//            System.out.println();
//        }


        // Exercitiu max cu matrice(array bi-dimensional)
//        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
//        int numarLinii = 3;
//        int numarColoane = 3;
//        int max = myMatrixInt[0][0];
//
//        for(int i = 0; i < numarLinii; i++)
//        {
//            for(int j = 0; j < numarColoane; j++)
//            {
//                if(myMatrixInt[i][j] > max)
//                {
//                    max = myMatrixInt[i][j];
//                }
//            }
//
//        }
//        System.out.println("Max is: " + max);


        // Exercitiu medie elemente matrice
//        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
//        //1, 7, 3
//        //10, 3, 4
//        //1, 2, 9
//        int numarLinii = 3;
//        int numarColoane = 3;
//        float averageMatrixInt = 0;
//        for(int i = 0; i < numarLinii; i++)
//        {
//            for(int j = 0; j < numarColoane; j++)
//            {
//                averageMatrixInt += myMatrixInt[i][j];
//            }
//
//        }
//
//        averageMatrixInt /= numarLinii * numarColoane;
//
//        System.out.println("Average value of matrix elements "
//                + "of myMatrixInt is: "
//                + averageMatrixInt);

        // Tema: myMatrixInt exercitiile: 2, 3, 4, 5


//        Dog dog1 = new Dog();
//        System.out.println(dog1.varsta);
//        System.out.println(dog1.nume);
//        System.out.println();
//        dog1.latra();
//        System.out.println();

//        dog1.Dog();
//
//        Dog dog2 = new Dog(11, "Spike");
//
//        dog2.latra();

//        System.out.println(dog2.varsta);
//        System.out.println(dog2.nume);

////        dog1.a = 1;
////        dog1.b = 2;
////        dog1.greutate = "40 kg";
//        dog1.varsta = 10;
//        dog1.nume = "Spike";
//
//        dog1.latra();

//        Random someNr = new Random();
//        System.out.print(someNr.nextInt(47));

        //Apel garbage collector
//        System.gc();
    }
}
