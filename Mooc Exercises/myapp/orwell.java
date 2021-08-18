package myapp;
import java.util.Scanner;
public class orwell {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        if (number == 1984){
            System.out.println("Orwell");
        } else {
            System.out.println("Not Orwell...");
        }

    }
    
}