package myapp;
import java.util.Scanner;
public class adulthood {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you: ");
        int age = Integer.valueOf(scanner.nextLine());
        if (age >= 18){
            System.out.print("You are an adult!");
        } else if (age <= 0) {
            System.out.print("That is not an age...");
        }else {
            System.out.print("You are not an adult.");
        }
    }
}