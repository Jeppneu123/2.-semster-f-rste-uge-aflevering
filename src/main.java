import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double height = 183.5;
        double shoeSize = 43.5;

        int result = 3 * 5 / 5 + 1;
        System.out.println(result);

        // Convert 100 Fahrenehit to Celcius

        double fahrenheit = 100.0;
        System.out.println((fahrenheit-32)*5/9);

        double convertMilesToKM = 1.609344;
        int milesToConvert = 19;

        System.out.println(milesToConvert/convertMilesToKM);

        String firstName = "Jeppe ";
        String lastName = "Neumann";
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.charAt(3));

        System.out.println(firstName.concat(lastName));

        String stringOne = "name";
        String stringTwo = "NaMe";

        System.out.println(stringOne.equals(stringTwo));

        // Methods 1
/*
        int age;
        Scanner yourAge = new Scanner(System.in);
        System.out.println("Please enter you age");

        age = yourAge.nextLine();
        if (age >= 18){
            System.out.println("You're eligible");
        }
        else {
            System.out.println("You're not eligible");
        }

 */

        // Methods 2
        int [] arrMax = new int [] {1,18,8};

        int max = arrMax[0];

        for (int i = 0; i < arrMax.length; i++) {
            if (arrMax[i]> max)
                max=arrMax[i];
        }

        System.out.println("The lagest element in the arry is: " + max);

        int [] arrMin = new int [] {1,18,-8};

        int min = arrMin[0];

        for (int i = 0; i < arrMin.length; i++) {
            if (arrMin[i]< max)
                min=arrMin[i];
        }
        System.out.println("The smallest element in the arry is: " + min);

        // Methods 3


    }
}




/*
    public static void main (String[] args){
        Scanner yourAge = new Scanner (system.in);
        System.out.println("Enter you age");

        String age = yourAge.nextLine();
        if (age <= 18){
            System.out.println("You're eligible");
        }
        else () {
            System.out.println("You're not eligible");
        }

    }


 */