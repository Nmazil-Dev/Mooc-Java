package myapp;
import java.util.Scanner;
public class number_and_sum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sumNums = 0;
        int count = 0;
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sumNums);
                break;
            } else {
                sumNums += num;
                count++;
            }

        }
        
    }
}