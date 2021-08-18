package myapp;
import java.util.Scanner;
public class carry_on{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Shall we carry on: ");
            String input = scanner.nextLine();
            if (input.equals("no")){
                break;
            }
        }
    }
}