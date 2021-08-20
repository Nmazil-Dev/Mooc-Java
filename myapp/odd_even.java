package myapp;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        String even = "Number " + number + " is even.";
        String odd = "Number " + number + " is odd.";
        String zero = "The number is zero!";
        if (number == 0){
            System.out.print(zero); 
        } else if (number % 2 == 0){
            System.out.print(even);
        } else {
            System.out.print(odd);
        }
    }
}