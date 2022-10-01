package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World");
    }

    //todo Task 2
    public void helloRobot(){
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

    //todo Task 3
    public void sumOfLiterals(){
    char d = 'Z';
    int e = 0XFACE;
    int f = 012;
    long g = 80L;
    float h = 44e-1f;
    float i = 5.5f;
    double j = 8.88e1;
    double k = 99.9;

    int sum = d + e + f + (int) g + (int) h + (int) i + (int) j + (int) k;
    System.out.println(sum);


    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int firstnumber = scan.nextInt();
        int secondnumber = scan.nextInt();

        System.out.println(firstnumber+secondnumber);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int firstnumber = scan.nextInt();
        int secondnumber = scan.nextInt();

        firstnumber = firstnumber + secondnumber;
        secondnumber = firstnumber - secondnumber;
        firstnumber = firstnumber - secondnumber;

        System.out.println(firstnumber);
        System.out.println(secondnumber);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("firstnumber: ");
        int firstnumber = scan.nextInt();
        System.out.println("secondnumber: ");
        int secondnumber = scan.nextInt();

        if (firstnumber == secondnumber) {
            System.out.println("firstnumber==secondnumber");
        } else if (firstnumber > secondnumber) {
            System.out.println("firstnumber>secondnumber");
        } else {
            System.out.println("secondnumber>firstnumber");
        }
    }
    //todo Task 7
    public void ratingSalesPerson(){
        System.out.println("Enter annual Revenue: ");
        Scanner scan = new Scanner(System.in);

        int umsatz = scan.nextInt();

        if (umsatz < 0 || umsatz>=100000) {
            System.out.println("Invalid Revenue");

        } else if (umsatz >= 0 && umsatz<20000){
            System.out.println("Poor Sales Revenue");

        } else if (umsatz >= 20000 && umsatz<50000){
            System.out.println("Average Sales Revenue");

        } else if (umsatz >= 50000 && umsatz <80000){
            System.out.println("Good Sales Revenue");

        } else if (umsatz >= 80000 && umsatz <100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        double provision = 0;
        int eingabe = 0;
        Scanner scan = new Scanner(System.in);
        eingabe = scan.nextInt();
        switch (eingabe) {
            case 1: provision=0.01;
                System.out.println("Your provision is: " + provision);
                break;
            case 2: provision=0.02;
                System.out.println("Your provision is: " + provision);
                break;
            case 3: provision=0.03;
                System.out.println("Your provision is: " + provision);
                break;
            case 4: provision=0.04;
                System.out.println("Your provision is: " + provision);
                break;
            default: provision=0.00;
            System.out.println("Your provision is: " + provision);
            break;
}
}
//todo Task 9
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
       if (year%4 == 0 && (year%100 !=0 || year%400 == 0)){
           System.out.println("Is a leap year!");
       } else {
           System.out.println("Is not a leap year!");
       }


    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scan = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter (Three Digit) Number: ");
        int num = scan.nextInt();

        while (num != 0) {
            /*
             * The following 3 lines of Code have been taken from the Internet | https://www.programiz.com/java-programming/examples/reverse-number, last visit: 02.10.2022
             */
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println(rev);
    }


    public static void main(String[] args){
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
