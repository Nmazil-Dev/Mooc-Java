package myapp;
import java.util.Scanner;
public class average_nums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sumNum = 0;
        int numCount = 0;
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                if (numCount == 0){
                    System.out.println("Cannot calculate the average.");
                    break;
                }
                double average = sumNum / numCount;
                System.out.println("The average of the numbers is: " + average);
                break;
            } else if (num < 0) {
                continue;
            }else {
                sumNum += num;
                numCount++;
            }
        }
    }
}