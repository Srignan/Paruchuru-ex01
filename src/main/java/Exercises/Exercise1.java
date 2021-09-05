package Exercises;

import java.util.Scanner;
/* import java util scanner
print statements to ask for name as well as the greeting
make string to input user's name and add the string name into greeting
 */
public class Exercise1 {
    private static final Scanner in = new Scanner(System.in);

            public static void main (String[] args) {
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}