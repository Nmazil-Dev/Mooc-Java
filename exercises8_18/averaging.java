package exercises8_18;

public class averaging {
    public static int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    public static double average(int num1, int num2, int num3, int num4){
        return (double) sum(num1, num2, num3, num4) / 4;
    }
    public static void main(String[] args){
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }    
}