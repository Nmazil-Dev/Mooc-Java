package exercises8_18;

public class advanced_astro {
    public static void printSpaces(int spaces){
        for(int i = spaces; i > 1; i--){
            System.out.print("0");
        }
    }
    public static void printStars(int stars){
        for(int i = 0; i < stars; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printTriangle(int height){
        int stars = 1;
        for (int i = height; i > 0; i--){
            printSpaces(i);
            printStars(stars);
            stars++;
        }
    }
    public static void printTreetop(int height){
        int stars = 1;
        for (int i = height; i > 0; i--){
            printSpaces(i);
            printStars(stars);
            stars+=2;
        }

    }
    public static void printTreetrunk(int height){
        for (int i = 0; i < 2; i++){
            printSpaces(height);
            printStars(3);
        }
    }
    public static void christmasTree(int height){
        printTreetop(height);
        printTreetrunk(height-1);
    }
    public static void main(String[] args){
        christmasTree(10);
    }
    
}