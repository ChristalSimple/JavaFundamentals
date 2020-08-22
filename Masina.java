// 02.08.2020
// Schita pentru crearea obiectelor
// de tip Masina
public class Masina
{
    // Declarare variabile primitive

    // Variabile de tip intreg
    public int a, b, c;

    // Variabile de tip real
    // Precizie de pana la 7 zecimale
    // Cuvantul cheie 'final' se foloseste
    // pentru a restrictiona schimbarea valorii variabilei.
    // Cu alte cuvinte field-ul unFieldReal1 este constant;
    public final float unFieldReal1 = 4.542456f;


    // Variabile de tip real cu precizie
    // de pana la 16 zecimale
    public double oVariabilaDouble1 = 7.1012623166164326;

    static int x = 10;

    //  Metoda statica a clasei Masina
    public static void metodaStatica()
    {
        System.out.println("Aceasta metoda poate fi apelata direct din clasa Masina");
        System.out.println("fara a fi nevoie de existanta unei instante de tip Masina");
    }

    //  Metoda non-statica a clasei Masina
    //  Poate fi apelata doar din interiorul
    //  unei instante a clasei Masina
    public void metodaNonStatica()
    {
        //Variabile locale
        int d = 21;
        System.out.println("Valoare variabila locala d: " + d);
    }

    public void informatiiMasina()
    {
        System.out.println("Valori ale field-urilor acestei Masini:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("unFieldReal1: " + unFieldReal1);
        System.out.println("oVariabilaDouble1: " + oVariabilaDouble1);
    }
}
