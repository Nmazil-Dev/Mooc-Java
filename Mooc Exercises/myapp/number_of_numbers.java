package myapp;
import java.util.Scanner;
public class number_of_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                System.out.println("Number of numbers: " + numCount);
                break;
            } else {
                numCount = numCount + 1;
            }
        }
    }
}