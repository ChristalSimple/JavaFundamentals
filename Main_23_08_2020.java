import java.util.Scanner;

public class Main_23_08_2020 {
    public static void main(String[] args) {
//        int unInt = 11;
//        String unString = "Un sir de caractere ";
//        String altString = new String("Un alt sir de caractere");
//
//        unInt = unInt + 23;
//
//        System.out.println(unString + altString);

//        String s1 = "1";
//        String s2 = "2";
//
//        System.out.println(s1 + s2);

//        String s1 = new String("Jerry");
//        String s2 = new String("Jerry");
//        String s3 = "Tom";
//        String s4 = "Tom";
//
//        s3 = "Tim";


//        char z = 'a';
//        System.out.println(z);
//        z++;//z = 'b';
//        z = 'z';
//        z++;
//        z++;
//        z--;
//        z--;
//        System.out.println(z);

//        String x = "";
//        for(char y = 'a'; y <= 'z'; y++)
//        {
//            x += y;
//            System.out.println(x);
//        }


//        StringBuilder x = new StringBuilder("");
//        for(char y = 'a'; y <= 'z'; y++)
//        {
//            x.append(y);
//            System.out.println(x);
//        }


//        StringBuilder x = new StringBuilder("Tom");
//        x.append("&");
//        StringBuilder y = x.append("Jerry");
//        System.out.println(x);
//        System.out.println(y);


        String s1 = new String("Jerry");
        String s2 = new String("Jerry");
        String s3 = "Jerry";
        String s4 = "Jerry";

//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s3);
//        System.out.println(s3 == s4);

//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//
//        dog1.a = 10;
//        dog1.b = 7;
//        dog1.greutate = "25";
//
//        dog2.a = 10;
//        dog2.b = 7;
//        dog2.greutate = "25";

//        System.out.println(dog1 == dog2);


//        System.out.println("Hello");
//        System.out.println("Ionel");

        String upperCaseString = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
//        exercitiu3(upperCaseString);
//        exercitiu4("avaJ");
//        exercitiu5("Programmer");
//        exercitiu6("Java", "Fundamentals");
//        exercitiu7("This is Java!");
//        exercitiu8("This is a comparison!", "THIS is A Comparison");
//        exercitiu9("Java exercisesc","ses");
        exercitiu10("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");


//        exercitiu3(upperCaseString);
//        exercitiu4("avaJ");
//        exercitiu5("Programmer");
//        exercitiu6("Java", "Fundamentals");
//        exercitiu7("This is Java!");
//        exercitiu8("This is a comparison", "THIS is A Comparison");
//        exercitiu9("Java exercises", "ses");
//        exercitiu10("Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33");
    }

    public static void exercitiu3(String stringParameter) {
        System.out.println("Converting string to lowercase: " +
                stringParameter);

        System.out.println(stringParameter.toLowerCase());
//        String p = upperCaseString.toLowerCase();

//        System.out.println(upperCaseString);
    }

    public static void exercitiu4(String stringParameter)
//            reverseStringFromParameter(String stringParameter)
    {
        System.out.println("Printing string to be reversed: "
                + stringParameter);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(stringParameter);

//        System.out.println(stringBuilder);

        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }

    public static void exercitiu5(String stringParameter) {
        System.out.println("String to be extracted from: "
                + stringParameter);

        int stringLength = stringParameter.length();
        // "Programmer"
        String firstHalf = stringParameter.substring(0, stringLength / 2);

        System.out.println(firstHalf);
    }

    public static void exercitiu6(String firstStringParameter,
                                  String secondStringParameter) {
        System.out.println("Concatenating string without first letter: "
                + firstStringParameter + secondStringParameter);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(firstStringParameter.substring(1));
        stringBuilder.append(secondStringParameter.substring(1));

        System.out.println(stringBuilder);
    }

    public static void exercitiu7(String stringParameter) {

        System.out.println("String parameter: " + stringParameter);
        System.out.printf("Our string parameter \"%s\" is %d characters long\n",
                stringParameter, stringParameter.length());
    }

    public static void exercitiu8(String firstStringParameter,
                                  String secondStringParameter) {
        System.out.printf("String to compare: \"%s\" and \"%s\"\n",
                firstStringParameter,
                secondStringParameter);

        if (firstStringParameter.equalsIgnoreCase(secondStringParameter)) {
            System.out.printf("Strings \"%s\" and \"%s\" are legicographically equal!\n",
                    firstStringParameter,
                    secondStringParameter);
        } else {
            System.out.printf("Strings \"%s\" and \"%s\" are not legicographically equal!\n",
                    firstStringParameter,
                    secondStringParameter);
        }
    }

    public static void exercitiu9(String firstStringParameter,
                                  String secondStringParameter) {
        System.out.printf("Does \"%s\" end in \"%s\"?\n",
                firstStringParameter,
                secondStringParameter);

        String endOfString = firstStringParameter.substring(
                firstStringParameter.length() -
                        secondStringParameter.length());

        if (endOfString.equals(secondStringParameter)) {
            System.out.printf("\"%s\" end with \"%s\"\n",
                    firstStringParameter,
                    secondStringParameter);
        } else {
            System.out.printf("\"%s\" does not end with \"%s\"\n",
                    firstStringParameter,
                    secondStringParameter);
        }
    }

    public static void exercitiu10(String stringParameter) {
        System.out.printf("Calculating count of each character type from string: \"%s\"",
                stringParameter);

        int lettersCount = 0, spacesCount = 0;
        int numbersCount = 0, othersCount = 0;

        String someString = "dajls";


        for (int i = 0; i < stringParameter.length(); i++) {
            if (stringParameter.substring(i, i + 1).matches("[a-zA-Z]")) {
//                String s = stringParameter.substring(0, 1);
//                s.matches("[a-zA-Z]");
                lettersCount++;
                continue;
            }

            if (stringParameter.substring(i, i + 1).matches("[0-9]")) {
                numbersCount++;
                continue;
            }

            if (stringParameter.substring(i, i + 1).matches(" ")) {
                spacesCount++;
                continue;
            }

            othersCount++;

//            switch(stringParameter.substring(i, i+1))
//            {
//                case "[a-zA-Z]":
//                    lettersCount++;
//                    break;
//                case "[0-9]":
//                    numbersCount++;
//                    break;
//                case " ":
//                    spacesCount++;
//                    break;
//                default:
//                    othersCount++;
//            }
        }

        System.out.printf("String: \"%s\"\n", stringParameter);
        System.out.printf("contains: %d letters, %d spaces, %d numbers, %d other characters",
                lettersCount, spacesCount, numbersCount, othersCount);
    }
}
