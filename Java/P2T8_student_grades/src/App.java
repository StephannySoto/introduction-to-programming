//AUTHOR: Ana Stephanny Soto Forero
//DATE: 2020-oct-08
//DESCRIPTION: This program calculate the final grade: N1(20%) + N2(25%) + N3(25%) + N4(30%)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===============================================");
        System.out.println("P2T8: Age of a person. make by Stephanny Soto");
        System.out.println("GRADESOFT VERSION 1.0");
        System.out.println("===============================================");

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Input the 1º grde(20%)-this value should be between 0 and 5");
        float N1 = keyboard.nextFloat();

        System.out.println("Input the 2º grde(25%)-this value should be between 0 and 5");
        float N2 = keyboard.nextFloat();

        System.out.println("Input the 3º grde(25%)-this value should be between 0 and 5");
        float N3 = keyboard.nextFloat();

        System.out.println("Input the 4º grde(30%)-this value should be between 0 and 5");
        float N4 = keyboard.nextFloat();

        if ( N1<0 || N1>5 || N2<0 || N2>5 || N3<0 || N3>5 || N4<0 || N4>5){

        System.err.println("ERR: The final grade can't calculate because one grade wasb not between 0 and 5");
        }else{
           
            double FINALG = (N1*0.2)+(N2*0.25)+(N3*0.25)+(N4*0.3);
            System.out.println(" The final grade is: "+FINALG);
        }
    }
}
