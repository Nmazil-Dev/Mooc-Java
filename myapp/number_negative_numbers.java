package myapp;
import java.util.Scanner;
public class number_negative_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0){
                numCount = numCount + 1;
            } else if (num == 0){
                System.out.println("Number of negative numbers: " + numCount);
                break;
            }
        }
    }
}