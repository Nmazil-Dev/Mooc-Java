package myapp;
import java.util.Scanner;
public class positivity {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number > 0){
            System.out.print("The number is positive.");
        } else if (number == 0 ) {
            System.out.print("The number is zero.");
        } else {
            System.out.print("The number is negative.");
        }
    }
}