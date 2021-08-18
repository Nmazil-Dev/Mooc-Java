package myapp;
import java.util.Scanner;
public class there_yet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 4){
                break;
            }
        }
    }
}