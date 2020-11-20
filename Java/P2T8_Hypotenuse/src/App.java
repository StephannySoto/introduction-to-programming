import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P1T8: Hypotenuse. Maker by Stephanny Soto");

        int a, b;
        double h, th;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value of a");
        a = keyboard.nextInt();

        System.out.println("Input the value of b");
        b = keyboard.nextInt();

        h= (a*a)+(b*b);
        th = Math.sqrt(h);

        System.out.println("The hypotenuse is: "+th);
    }
}
