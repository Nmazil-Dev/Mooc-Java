package myapp;
import java.util.Scanner;
public class checking_the_age{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you: ");
        int age = Integer.valueOf(scanner.nextLine());
        if (age > 0 && age <= 120){
            System.out.print("OK");
        } else {
            System.out.print("Impossible");
        }
    }
}