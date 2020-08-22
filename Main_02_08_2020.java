// Pentru a rula codul din acest Main
// dati click dreapta pe Main_02_08_2020
// din lista de fisiere din folderul /src/
// si dati click pe: Run Main_02_08_2020.main()
public class Main_02_08_2020
{

    public static void main(String args[])
    {
        // Exemplu apel metoda statica direct din clasa:
        Masina.metodaStatica();

        // Exemplu apel metoda statica din interioarul
        // unei instante a clasei Masina
        Masina oMasina = new Masina();
        oMasina.metodaStatica();

        oMasina.a = 9;
        oMasina.b = 17;
        oMasina.c = 20;

        // Eroare de compilare
        // Fieldul oVariabilaReala1 este constanta
//        oMasina.oFieldReal1 = 0.34563f;

        oMasina.oVariabilaDouble1 = 67.44219845;

        // Apel metodaNonStatica
        oMasina.metodaNonStatica();

        oMasina.informatiiMasina();

        // Apel metodaNonStatica() incorect
        //Eroare de compilare
//        Masina.metodaNonStatica();

        Masina altaMasina = new Masina();
        altaMasina.a = 49;
        altaMasina.informatiiMasina();

        Masina.x = 15;
        System.out.println("Valoare x pentru oMasina: "
                + oMasina.x);
        System.out.println("Valoare x pentru altaMasina: "
                + altaMasina.x);
        System.out.println("Valoare x acces direct din schita Masina: " +
                Masina.x);

        // Operatii cu operatori:
        // Operatori unary multiplii
        int x = 0;
        int a = ++x + x-- + x++ - --x;
        System.out.println(a);

        // Exemplu overflow:
        System.out.println(-2147483648-1);

        // Exemple operatori unari:
        // 1.
        int y = -5;
        int z = 12;

        y = +y;
        System.out.println(y);

        y += z;
        System.out.println(y);

        y = y + 16;
        System.out.println(y);

        y = -(12 - 15);
        System.out.println(y);

        // 2.
        double f = 2 + 2 * (y--);
        System.out.println(f);

        System.out.println(12%3);

        // 3.
        boolean verificare1 = false;

        verificare1 = !verificare1;

        System.out.println(verificare1);

        // Exemplu if statement simplu:

        // Variabila locala scope main()
        int temperature = 110;
        if (temperature > 100)
        {
            System.out.println("The water " +
                    "will boil");
        }

        // Exemplu if statement cu ramura else:
        temperature = 80;
        if(temperature > 100)
        {
            System.out.println("The water " +
                    "will boil");
        }
        else
        {
            System.out.println("The water " +
                    "is getting hotter");
        }

        // Exemplu if statement cu ramura else if:
        temperature = 0;
        if (temperature > 100)
        {
            System.out.println("The water " +
                    "will boil");
        }
        else if(temperature == 0)
        {
            System.out.println("The water " +
                    "is starting to freeze");
        }

        // Exemplu if statement cu operatorul &&:
        boolean verificare2 = false;
        boolean verificare3 = verificare1 && false;

        if(verificare2 && verificare3)
        {
            System.out.println("S-a intrat in if");
        }
        else
        {
            System.out.println("Nu s-a intrat in if");
        }

        // Exemplu if statement cu apel de metode:
        if(metodaCuReturnTrue() && metodaCuReturnFalse())
        {
            System.out.println("S-a intrat in if-ul cu apel de metode.");
        }
        else
            {
            System.out.println("Nu s-a intrat in if-ul cu apel de metode");
        }

        // Exemplu operator ternar:
        int numarIntreg1 = 15;
        String mesaj =
                (numarIntreg1 % 3 == 0) ? "numarIntreg1 este divizibil cu 3" : "numarIntreg2 nu este divizibil cu 3";

        // Exemplu if cu operatorul ||
        boolean intratInIf = false;
        if(verificare1 || verificare2)
        {
            //cod
            intratInIf = true;
        }
        System.out.println(intratInIf);


        // Exemplu switch statement:
        int numarIntreg2 = 2;
        switch (numarIntreg2)
        {
            case 1:
                // statements
                System.out.println("S-a executat caseul: '1' deoarece:");
                System.out.println("Valoarea lui x este: " + numarIntreg2);
                break; // optional

            case 2:
                // statements
                System.out.println("S-a executat cazul: '2' deoarece:");
                System.out.println("Valoarea lui x este: " +
                        numarIntreg2);
                break; // optional

            // we may have any number of cases
            default: // optional
                // statements
                System.out.println("Niciuna dintre conditiile switch-ului" +
                        "nu s-a indemplinit");
        }

        // Exemplu switch statement cu String:
        String sirDeCaracterePentruSwitch =
                "O propozitie interesanta";

        switch (sirDeCaracterePentruSwitch)
        {
            case "O propozitie interesanta":
                // statements
                System.out.println("S-a executat case-ul: "
                + " 'O propozitie interesanta'" + " deoarece:");
                System.out.println("Valoarea lui sirDeCaracterePentruSwitch este: " +
                        sirDeCaracterePentruSwitch);
                //cod
                break; // optional

            case "O propozitie neinteresanta":
                // statements
                System.out.println("S-a executat case-ul: " +
                        " 'O propozitie neinteresanta'" + " deoarece:");
                System.out.println("Valoarea lui sirDeCaracterePentruSwitch este: " +
                        sirDeCaracterePentruSwitch);
                break; // optional

            // we may have any number of cases
            default: // optional
                // statements
                System.out.println("Niciuna dintre conditiile switch-ului" +
                        "nu s-a indemplinit");
        }


        String sirCaractere1 = "O propozitie interesanta";
        metodaCuSwitch(sirCaractere1);
        String sirCaractere2 = "O propozitie neinteresanta";
        metodaCuSwitch(sirCaractere2);

    }

    public static void metodaCuSwitch(String x)
    {
        switch (x)
        {
            case "O propozitie interesanta":
                // statements
                System.out.println("S-a executat case-ul: "
                    + " 'O propozitie interesanta'" + " deoarece:");
                System.out.println("Valoarea lui x este: " +
                    x);
                break; // optional

            case "O propozitie neinteresanta":
                // statements
                System.out.println("S-a executat case-ul: " +
                    " 'O propozitie neinteresanta'" + " deoarece:");
                System.out.println("Valoarea lui x este: " +
                    x);
                break; // optional

            // we may have any number of cases
            default: // optional
                // statements
                System.out.println("Niciuna dintre conditiile switch-ului" +
                    "nu s-a indemplinit");
    }
}

    public static boolean metodaCuReturnTrue()
    {
        //cod
        return true;
    }

    public static boolean metodaCuReturnFalse()
    {
        //cod
        return false;
    }
}
