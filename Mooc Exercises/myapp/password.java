package myapp;
import java.util.Scanner;
public class password {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Password: ");
        String input = scanner.nextLine();
        if (input.equals("Caput Draconis")){
            System.out.print("Welcome!");
        } else {
            System.out.print("Off with you!");
        }
    }
}