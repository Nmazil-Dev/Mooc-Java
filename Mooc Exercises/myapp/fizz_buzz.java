package myapp;
import java.util.Scanner;
public class fizz_buzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1-100: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number > 100 || number < 1){
            System.out.println("Enter a different number.");
        } else if (number % 3 == 0 && number % 5 ==0 ){
            System.out.print("FizzBuzz");
        } else if (number % 3 == 0){
            System.out.print("Fizz");
        } else if (number % 5 == 0){
            System.out.print("Buzz");
        } else {
            System.out.print(number);
        }
    }
}