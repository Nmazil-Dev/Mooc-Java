package myapp;
import java.util.Scanner;
public class gift_tax {
    //Make a function that calculates gift tax
    static double taxCalc(int tax_flat, int value, int exceeding, double tax_rate){
        return (tax_flat + (value - exceeding) * tax_rate);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of gift: ");
        int value = Integer.valueOf(scanner.nextLine());
        if (value > 1000000){
            System.out.println(taxCalc(142100, value, 1000000, .17));
        } else if (value >= 200000){
            System.out.println(taxCalc(22100, value, 200000, .15));
        } else if (value >= 55000){
            System.out.println(taxCalc(4700, value, 55000, .12));
        } else if (value >= 25000){
            System.out.println(taxCalc(1700, value, 25000, .10));
        } else if (value >= 5000){
            System.out.println(taxCalc(100, value, 5000, .08));
        } else {
            System.out.println("No tax!");
        }
    }
}