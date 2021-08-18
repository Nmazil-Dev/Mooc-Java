package myapp;
import java.util.Scanner;
public class absolute_value {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to get its absolute value: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number < 0){
            System.out.print(number * -1);
        } else {
            System.out.print(number);
        }
    }
}