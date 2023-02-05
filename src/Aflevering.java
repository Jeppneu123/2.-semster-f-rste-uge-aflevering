import java.util.Scanner;

public class Aflevering {

    public static void main(String [] args) {
        // Method 1
        votingAge();

        // Method 2
        maxAndMinimum();

        // Method 3
        oddOrEven();

        // Method 4
        nameAbbreviations ();

        // Car & Driver
        Car mercedes = new Car("Mercedes", 1200000);
        Driver jeppe = new Driver("Jeppe Jæger Neumann", 23);

        mercedes.start();
        jeppe.drive(mercedes);
        mercedes.move();

        // Employee
        Employee jens = new Employee("Jens", "Olsen", 39000);
        Employee ulrikke = new Employee("Ulrikke", "Jensen", 75000);

        System.out.println("Yearly salary of " + jens.firstName + " " + jens.lastName + " " + jens.getYearlySalary() + " DKK");
        System.out.println("Yearly salary of " + ulrikke.firstName + " " + ulrikke.lastName + " " + ulrikke.getYearlySalary() + " DKK");


        jens.salaryRaise();
        ulrikke.salaryRaise();

        System.out.println(jens.getYearlySalary());
        System.out.println(ulrikke.getYearlySalary());
    }

    public static void votingAge () {

        Scanner yourAge = new Scanner(System.in);
        System.out.println("Please enter you age");

        int age = yourAge.nextInt();
        if (age >= 18){
            System.out.println("You're eligible");
        }
        else {
            System.out.println("You're not eligible");
        }
    }

    public static void maxAndMinimum () {

        int [] arrMax = new int [] {1,18,8};

        int max = arrMax[0];

        for (int i = 0; i < arrMax.length; i++) {
            if (arrMax[i] > max)
                max=arrMax[i];
        }

        System.out.println("The largest element in the arry is: " + max);

        int [] arrMin = new int [] {1,18,-8};

        int min = arrMin[0];

        for (int i = 0; i < arrMin.length; i++) {
            if (arrMin[i] < min)
                min=arrMin[i];
        }
        System.out.println("The smallest element in the arry is: " + min);

    }

    public static void oddOrEven () {

            System.out.println("Write a number to check if its even or odd");
            Scanner sc = new Scanner (System.in);

            int number = sc.nextInt();
            if (number % 2 == 0 ) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }

    public static void nameAbbreviations () {

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your full name: ");
        String fullName = sc.nextLine();

        String[] parts = fullName.split(" ");
        char firstInitial = parts[0].charAt(0);
        char middelInitial = parts[1].charAt(0);
        String lastName = parts[2];

        System.out.println(firstInitial + ". " + middelInitial + ". " + lastName);
    }
}

/* Car & driver.
There is a car, which has attributes model and price, and the car has functionalities start, stop and move.
Also, there is a driver, having attributes name and age, and the behaviour drive.
Create the classes Car and Driver.
The functionality of the methods does not matter. Just print something to the console*/