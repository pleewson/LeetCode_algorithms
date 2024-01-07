package LeetCode_Easy;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        sumOfTwoIntegers();

    }

    public static void sumOfTwoIntegers() {
        Scanner scan = new Scanner(System.in);

        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println("Enter First Integer:");
                int a = scan.nextInt();

                System.out.println("Enter Second Integer:");
                int b = scan.nextInt();

                System.out.println("Sum: " + (a + b));

                isValid = true;
            } catch (InputMismatchException ex) {
                System.out.println("Please Enter an Integer. Try again.");
                scan.nextLine();
            }
        }

        scan.close();
    }

}