package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    public App() {
    }

    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public void helloRobot() {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    public void sumOfLiterals() {
        char d = 90;
        int e = '龜';
        int f = 10;
        long g = 80L;
        float h = 4.4F;
        float i = 5.5F;
        double j = 88.8;
        double k = 99.9;
        int sum = d + e + f + (int)g + (int)h + (int)i + (int)j + (int)k;
        System.out.println(sum);
    }

    public void addTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        int firstnumber = scan.nextInt();
        int secondnumber = scan.nextInt();
        System.out.println(firstnumber + secondnumber);
    }

    public void swapTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int n1 = scan.nextInt();
        System.out.print("y: ");
        int n2 = scan.nextInt();
        n1 += n2;
        n2 = n1 - n2;
        n1 -= n2;
        System.out.println("After Swap:");
        System.out.println("x: " + n1);
        System.out.println("y: " + n2);
    }

    public void compareTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();
        if (n1 == n2) {
            System.out.println("n1 == n2");
        } else if (n1 > n2) {
            System.out.println("n1 > n2");
        } else {
            System.out.println("n2 > n1");
        }

    }

    public void ratingSalesPerson() {
        System.out.print("Enter annual Revenue: ");
        Scanner scan = new Scanner(System.in);
        int umsatz = scan.nextInt();
        if (umsatz >= 0 && umsatz < 100000) {
            if (umsatz >= 0 && umsatz < 20000) {
                System.out.println("Poor Sales Revenue");
            } else if (umsatz >= 20000 && umsatz < 50000) {
                System.out.println("Average Sales Revenue");
            } else if (umsatz >= 50000 && umsatz < 80000) {
                System.out.println("Good Sales Revenue");
            } else if (umsatz >= 80000 && umsatz < 100000) {
                System.out.println("Excellent Sales Revenue");
            }
        } else {
            System.out.println("Invalid Revenue");
        }

    }

    public void getCommissionRate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int eingabe = scan.nextInt();
        double provision;
        switch (eingabe) {
            case 1:
                provision = 0.01;
                System.out.println("Your Commission Rate was set to " + provision);
                break;
            case 2:
                provision = 0.02;
                System.out.println("Your Commission Rate was set to " + provision);
                break;
            case 3:
                provision = 0.03;
                System.out.println("Your Commission Rate was set to " + provision);
                break;
            case 4:
                provision = 0.04;
                System.out.println("Your Commission Rate was set to " + provision);
                break;
            default:
                provision = 0.0;
                System.out.println("Your Commission Rate was set to " + provision);
        }

    }

    public void leapyear() {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Year: Not a Leapyear");
        } else {
            System.out.println("Year: Leapyear");
        }

    }

    public void transposedNumbers() {
        Scanner scan = new Scanner(System.in);
        int rev = 0;
        /*
         * The following 3 lines of Code have been taken from the Internet | https://www.programiz.com/java-programming/examples/reverse-number, last visit: 02.10.2022
         */
        for(int num = scan.nextInt(); num != 0; num /= 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Number: " + rev);
    }

    public static void main(String[] args) {
        App exercise1 = new App();
        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();
        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();
        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();
        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();
        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();
        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();
        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();
        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();
        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();
        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}