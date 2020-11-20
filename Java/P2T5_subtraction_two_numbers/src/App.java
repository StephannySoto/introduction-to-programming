import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------");
        System.out.println("P2T5: Subtraction between two numbers. Maker by Stephanny Soto");
        System.out.println("--------------------------------");
       
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1 = keyboard.nextInt();

        System.out.println("Input the second number:");
        int num2 = keyboard.nextInt();

        int resu= num1- num2;

        System.out.println("The subtraction is "+resu);
    }
}
