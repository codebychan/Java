import java.util.Scanner;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Main {

    // Method
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables and Data Types
        int a = 10;
        double b = 5.5;
        char grade = 'A';
        boolean passed = true;
        String college = "GEC";

        System.out.println("Integer : " + a);
        System.out.println("Double  : " + b);
        System.out.println("Char    : " + grade);
        System.out.println("Boolean : " + passed);
        System.out.println("String  : " + college);

        // Input
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        // If-Else
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        // For Loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }

        // Array
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("\nArray Elements:");
        for (int value : arr) {
            System.out.println(value);
        }

        // Method Call
        System.out.println("\nSquare of " + num + " = " + square(num));

        // Object and Class
        Student s = new Student();
        s.name = "Chandana";
        s.age = 20;

        System.out.println("\nStudent Details:");
        s.display();

        sc.close();
    }
}