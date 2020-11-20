import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------");
        System.out.println("P2T7: Supermarket Maker by Stephanny Soto");
        System.out.println("--------------------------------------------");

        int P1, P2, P3, P4, VALOR; 
        double IVA, BILL;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the 1º product:");
        P1 = keyboard.nextInt();

        System.out.println("Input the 2º product:");
        P2 = keyboard.nextInt();

        System.out.println("Input the 3º product:");
        P3 = keyboard.nextInt();

        System.out.println("Input the 4º product:");
        P4 = keyboard.nextInt();
        
        VALOR = P1+P2+P3+P4;

        IVA= VALOR *0.19;

        BILL = VALOR+IVA;

        System.out.println("--------------------------------------------");
        System.out.println("The total bil is "+BILL+" with IVA 19% $"+IVA);
        System.out.println("--------------------------------------------");

    }    
}
