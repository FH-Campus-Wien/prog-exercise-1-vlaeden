package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.*;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println();
        System.out.println("          __    ");
        System.out.println("     _(\\ |@@|");
        System.out.println(" (__/\\__ \\--/ __");
        System.out.println("    \\___|----| | __\n" + " \\ }{ /\\ )_ / _\\");
        System.out.println("         /\\__/\\ \\__O (__");
        System.out.println("        (--/\\--)   \\__/");
        System.out.println("          _)( )(_");
        System.out.println("         `---''---` ");
    }


    //todo Task 3
    public void sumOfLiterals(){

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int t = scanner.nextInt();

        s += t;
        t = s-t;
        s = s-t;
        System.out.println(s);
        System.out.println(t);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("a is bigger than b");
        }
        if (a<b){
            System.out.println("a is smaller than b");
        }
        if (a==b){
            System.out.println("They're the same.");
        }
     }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
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