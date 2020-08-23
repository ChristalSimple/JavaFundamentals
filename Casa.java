//01.08.2020
//Schita pentru crearea obiectelor
//de tip Casa
public class Casa
{
    // Variabile/Fielduri ale clasei(Class variables):

    // Variabila/Field static de tip int
    // Caracteristici:
    // 1. Exista in memorie independent de
    // existenta/inexistenta unor obiecte/instante de tip Casa
    // 2. Field unic pentru toate obiectele/instantele de tip Casa
    // 3. Fieldul 'static int variabila' este stocat
    // in aceeasi locatie de memorie pentru
    // fiecare obiect/instanta de tip Casa
    // 4. Modificarea valorii fieldului static 'variabila'
    // din unul dintre obiectele/instantele de tip Casa
    // va modifica valoarea pentru toate obiectele/instantele
    // de tip Casa
    // Cuvantul cheie 'public' permite accesarea field-ului
    // din exteriorul clasei Casa
    public static int variabila = 10;

    // Cuvantul cheie 'private' nu permite accesarea field-ului
    // din exteriorul clasei Casa
    private int unNumarIntreg1 = 45;
    private int unNumarIntreg2 = 15;

    //Pseudo-cod
//    private char[] innerStringChars;
//    String(char[] someString)
//    {
//        innerStringChars = someString;
//    }

    // Metoda membra a clasei Casa
    public int oMetodaExemplu(int variabilaParametru)
    {
        // Variabile locale ce apartin scopului
        //oMetodaExemplu
        int unNumar = 0;
        // variabilaParametru apartine scope-ului
        // oMetodaExemplu

        unNumar += unNumarIntreg2;

        return unNumar + variabilaParametru;
    }


    public void sleepIfTired(boolean isTired)
    {
        if(isTired == true)
        {
            // Variabila locala a if-ului
            int nrOfHours = 8;
            unNumarIntreg1 = 14;
            System.out.println("nrOfHours:" + nrOfHours);
            System.out.println("unNumarIntreg1" + " " + unNumarIntreg1);
        } // nrOfHours goes out of scope(dispare)

        {
            int nrOfHours = 4;
            unNumarIntreg2 = 34;
            System.out.println("nrOfHours:" + nrOfHours + " " + unNumarIntreg2);
        }
        // Eroare de compilare
        // (nrOfHours nu exista in afara scope-ului)
        // Decomentati linia urmatoare pentru verificare
        // System.out.println(nrOfHours);
    }

    public static void oAltaMetodaExemplu()
    {
//        int altNumar = oMetodaExemplu(variabila);
//        System.out.println(altNumar);
    }
}

//class String
//{
//    //field-uri
//    char[] myString;
//    //...
//    // Constructor class String
//    String(char[] parametruChar)
//    {
//
//    }
//    //metode membre clasa String
//    //...
//}
