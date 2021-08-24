package part3;
import java.util.ArrayList;
import java.util.Scanner;

//Take user input to make a list and return the sum of the second and third numbers 
public class second_third {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        System.out.print("Enter numbers: ");
        int count = 0;
        while (true){
            int userNum = Integer.valueOf(scanner.nextLine());
            if (userNum == 0){
                break;
            } else {
                list.add(userNum);
                count++;
            }
        }
        if (count >= 3){
            int sum =  list.get(1) + list.get(2);
            System.out.println(sum);
        } else {
            System.out.println("Not enough numbers");
        }
    }
}
