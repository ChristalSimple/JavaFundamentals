// 09.08.2020
package Java.Fundamentals.Ziua1;

public class Dog
{
    public int varsta;
    public String nume;
    public int greutate;

    public Dog()
    {
        varsta = 10;
        nume = "Lucky";
        System.out.println("Primul constructor Dog a fost apelat");
    }

    public Dog(int varstaParametru, String numeParametru)
    {
        varsta = varstaParametru;
        nume = numeParametru;
//        System.out.println("Constructorul cu 2 parametri a fost apelat");
        System.out.println("Un caine s-a nascut");
        System.out.println("Cu numele: " + nume);
        System.out.println("Si varsta: " + varsta);
    }

    public Dog(String nume)
    {

    }

    public Dog(int varsta, String nume, int greutate)
    {

    }

    public void latra()
    {
        int a = 1, b = 2 , c = 3, d = 4;

        System.out.println("Cainele cu numele:" + nume +
                " a latrat: Woof woof");
    }
}
