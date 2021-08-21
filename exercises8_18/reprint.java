package exercises8_18;
import java.util.Scanner;
public class reprint {
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method.");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times: ");
        int times = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < times; i++){
            printText();
        };
        
    }
    
}
