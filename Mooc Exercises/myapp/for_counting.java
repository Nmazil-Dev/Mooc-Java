package myapp;
import java.util.Scanner;
public class for_counting{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count up to: ");
        int limit = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= limit; i++){
            System.out.println(i);
        }
    }
}