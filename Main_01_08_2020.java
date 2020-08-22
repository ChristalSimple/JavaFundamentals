// Pentru a rula codul din acest Main
// dati click dreapta pe Main_01_08_2020
// din lista de fisiere din folderul /src/
// si dati click pe: Run Main_01_08_2020.main()
public class Main_01_08_2020
{
    public static void main(String[] args)
    {
        // 1. Exemple variabile locale:

        // Declarare variabile locale (apartin scopului metodei main)
        String address;
        int age;
//        int variabilaLocalaMain1 = 10;

        //Initializare variabile locale
        address = "Adresa mea";
        age = 10;

        // Afisare variabile locale
        System.out.println(address);
        System.out.println(age);

        // Exemplu operatii aritmetice
        String s1, s2;
        String s3 = "Dog", s4 = "Cat";

        int i1, i2, i3 = 50, i4;
        i4 = 34;

        i2 = i3 + i4;
        System.out.println(i2);

        s1 = s3 + s4;
        System.out.println(s1);

        s2 = s4 + s3;
        System.out.println(s2);

        // Eroare de compilare
        // Variabila locala i1 nu a fost initializata
//        System.out.println(i1);

        System.out.println(i2);
        System.out.println(i3);
        System.out.println(s1);
        System.out.println(s2);

        // Modificare variabile locale
        // folosind return-ul unor metode
        // definite
        address = asigneazaValoareString();
        age = asigneazaValoareInt();

        System.out.println(address);
        System.out.println(age);


        // 2. Exemplu variabila statica:

        // Acces al fieldului 'static int variabila'
        // fara existanta unor obiecte de tip Casa
        // instantiate in prealabil
        System.out.println(Casa.variabila);

        boolean boolVariable = true; // 1 bit
        char oChar = 'C'; // 2 bytes(16 biti)
        byte aByte = 64; // 1 byte(8)
        short aShort = 20701;// 2 bytes(16 biti)
        int anInt = 2140000000; // 4 bytes (32 biti)
        long aLong = -48;// 8 bytes (64 biti)
        float aFloat = 41.4213f;//4 bytes (32 biti)
        double aDouble = 41.4534124; //8 bytes(64 biti)
        // Declararea obiectelor 'oCasa', 'oAltaCasa'
        // Si instantierea obiectelor
        // (asemanator initializarii variabilelor primitive)
        Casa oCasa = new Casa();
        Casa oAltaCasa = new Casa();

        oCasa.oMetodaExemplu(10);

        // Modificarea valorii fieldului 'static int variabila'
        // din exteriorul clasei Casa
        Casa.variabila = 25;

        // Afisarea valorii fieldului 'variabila'
        // din interiorul fiecarei instante de tip Casa
        System.out.println(oCasa.variabila);
        System.out.println(oAltaCasa.variabila);

        // Modificarea valorii fieldului 'static int variabila'
        // din interiorul uneia dintre instantele
        // de tip Casa
        oCasa.variabila = 37;

        // Afisarea valorii fieldului 'variabila'
        // din interiorul fiecarei instante de tip Casa
        System.out.println(oCasa.variabila);
        System.out.println(oAltaCasa.variabila);


        int altNumar = oCasa.oMetodaExemplu(10);
        System.out.println(altNumar);
    }

    public static String asigneazaValoareString()
    {
        return "O adresa oarecare";
    }

    public static int asigneazaValoareInt()
    {
        return 24;
    }
}
