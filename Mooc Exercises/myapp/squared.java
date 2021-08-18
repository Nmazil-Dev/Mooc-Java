package myapp;
import java.util.Scanner;
public class squared{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to square: ");
        int number = Integer.valueOf(scanner.nextLine());
        int squared = number * number;
        System.out.println(squared);
    }
}