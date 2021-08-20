package myapp;
import java.util.Scanner;
public class only_pos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            } else if (num < 0){
                System.out.println("Unsuitable number.");
                continue;
            } else {
                System.out.println(num * num);
            }
        }
    }
    
}