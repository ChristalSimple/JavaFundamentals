import java.util.Arrays;

public class Teme_09_08_2020
{
    public static void main(String[] args)
    {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = myMatrixInt.length, numarColoane = 3;

//        exercitiu2Matrice(myMatrixInt, numarLinii, numarColoane);
//        exercitiu3Matrice(myMatrixInt, numarLinii, numarColoane);
//        int[][] reveredMatrix = exercitiu3Matrice(myMatrixInt, numarLinii, numarColoane);
//        exercitiu4Matrice(myMatrixInt, numarLinii, numarColoane);
        exercitiu5Matrice(myMatrixInt, numarLinii, numarColoane);
    }

    public static void exercitiu2Matrice(int[][] matrix,
                                         int nrRows, int nrColumns)
    {

        System.out.println("Odd numbers of matrix:");
        for(int i = 0; i < nrRows; i++)
        {
            System.out.print("Row " + i + ": ");
            for(int j = 0; j < nrColumns; j++)
            {
                if(matrix[i][j] % 2 != 0)
                {
                    System.out.print("matrix[" + i + "][" + j + "]= ");
                    System.out.print(matrix[i][j] + ", ");
                }
            }
            System.out.print("\n");
        }
    }

    public static int[][] exercitiu3Matrice(int[][] matrix,
                                         int nrRows, int nrColumns)
    {
        int[][] reversedMatrix = new int[nrRows][nrColumns];
        // 0, 0, 0
        // 0, 0, 0
        // 0, 0, 0
        int reverseRowIterator = nrRows - 1;
        int reverseColumnIterator = nrColumns - 1;

        for(int i = 0; i < nrRows; i++)
        {
            for(int j = 0; j < nrColumns; j++)
            {
//                reversedMatrix[i][reverseColumnIterator] =
//                        matrix[i][j];
//                reversedMatrix[reverseRowIterator][j] =
//                        matrix[i][j];
                reversedMatrix[reverseRowIterator][reverseColumnIterator] =
                        matrix[i][j];
                reverseColumnIterator--;
            }
            reverseColumnIterator = nrColumns - 1;
            reverseRowIterator--;
        }

        // reveresedMatrix instance
        // {9, 2, 1}
        // {4, 3, 10},
        // {3, 7, 1},

        for(int i = 0; i < nrRows; i++)
        {
            for(int j = 0; j < nrColumns; j++)
            {
                System.out.print(reversedMatrix[i][j] + ", ");
            }
            System.out.print("\n");
        }

        return reversedMatrix;
    }

    public static void exercitiu4Matrice(int[][] matrix,
                                         int nrRows, int nrColumns)
    {
        int odd = 0, even = 0;

        for(int i = 0; i < nrRows; i++)
        {
            for(int j = 0; j < nrColumns; j++)
            {
                if(matrix[i][j] % 2 == 0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }

        }
        System.out.println("Odd numbers in arrayInt: " + odd);
        System.out.println("Even numbers in arrayInt: " + even);
    }

    public static void exercitiu5Matrice(int[][] matrix,
                                         int nrRows, int nrColumns)
    {
        System.out.println("Elementele duplicate din myMatrixInt sunt: ");
//        for(int i = 0; i < nrRows; i++)
//        {
//            for(int j = 0; j < nrColumns; j++)
//            {
//                for(int k = j + 1; k < nrColumns; k++)
//                {
//                    if(matrix[i][j] == matrix[i][k])
//                    {
//                        System.out.print(matrix[i][j] + ", ");
//                    }
//                }
//            }
//        }

//        System.out.println();

        int[] temporaryArray = new int[nrRows * nrColumns];
        int temporaryArrayIterator = 0;
        for(int i = 0; i < nrRows; i++)
        {
            for(int j = 0; j < nrColumns; j++)
            {
                temporaryArray[temporaryArrayIterator] = matrix[i][j];
                temporaryArrayIterator++;
            }
        }

//        for(int i = 0; i < temporaryArray.length; i++)
//        {
//            System.out.print(temporaryArray[i] + ", ");
//        }

        for(int i = 0; i < temporaryArray.length; i++)
        {
            for(int j = i + 1; j < temporaryArray.length; j++)
            {
                if(temporaryArray[i] == temporaryArray[j])
                {
                    System.out.print(temporaryArray[j] + ", ");
                }
            }
        }
    }
}
