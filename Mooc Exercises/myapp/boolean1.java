package myapp;
import java.util.Scanner;
public class boolean1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed > 120){
            System.out.println("Speeding Ticket!");
        } else {
            System.out.println("Good Speed.");
        }
    }
    
}